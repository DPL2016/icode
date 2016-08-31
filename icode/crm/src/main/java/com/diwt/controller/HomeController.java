package com.diwt.controller;

import com.diwt.dto.FlashMessage;
import com.diwt.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

@Controller
public class HomeController {
    @Inject
    private UserService userService;

    @RequestMapping(value ="/",method = RequestMethod.GET)
    public String login(){
        return "/login";
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "/home";
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login(String tel, String password, RedirectAttributes redirectAttributes){
        Subject subject = SecurityUtils.getSubject();
        try {
            if (subject.isAuthenticated()){
                subject.logout();
            }
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(tel, DigestUtils.md5Hex(password));
            subject.login(usernamePasswordToken);
            userService.saveUserLogin();
            return "redirect:/home";
        }catch (LockedAccountException ex){
            ex.printStackTrace();
            redirectAttributes.addFlashAttribute("message",new FlashMessage(FlashMessage.STATE_ERROR,"账号已被禁用"));
        }catch (AuthenticationException e){
            redirectAttributes.addFlashAttribute("message",new FlashMessage(FlashMessage.STATE_ERROR,"账号或密码错误"));
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
