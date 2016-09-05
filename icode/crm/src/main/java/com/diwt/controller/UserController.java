package com.diwt.controller;

import com.diwt.dto.DataTablesResult;
import com.diwt.pojo.User;
import com.diwt.service.UserService;
import com.diwt.util.Strings;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Inject
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 员工列表页面
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String list() {
        return "admin/list";
    }
/**
 * 让DataTables控件加载数据
 * @return
 */
    @RequestMapping(value = "/users.json",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public DataTablesResult userload(HttpServletRequest request){
        String draw = request.getParameter("draw");
        String start = request.getParameter("start");
        String length = request.getParameter("length");
        String keyword = request.getParameter("search[value]");
        String orderColumnIndex = request.getParameter("order[0][column]");
        String orderType = request.getParameter("order[0][dir]");
        String orderColumnName = request.getParameter("columns["+orderColumnIndex+"][name]");
        keyword = Strings.toUTF8(keyword);
        Map<String,Object>param = Maps.newHashMap();
        param.put("draw",draw);
        param.put("start",start);
        if(StringUtils.isNotEmpty(keyword)) {
            param.put("keyword", "%" + Strings.toUTF8(keyword) + "%");
        }
        param.put("keyword",keyword);
        param.put("orderColumn",orderColumnName);
        param.put("orderType",orderType);
        param.put("length",length);
        List<User> userList = userService.findByParam(param);
        Long count = userService.countUser();
        Long filterCount = userService.countByParam(param);
        return new DataTablesResult(draw,userList,count,filterCount);
    }

}
