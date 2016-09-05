package com.diwt;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by xiaod on 2016/9/4.
 */
public class Application {
    /**
     * 自定义Application
     * @param args
     */
    public static void main(String[] args) {

        /*//1.3.7
        SpringApplication application = new SpringApplication(Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        //1.3.0
        //application.setShowBanner(false);
        //application.run(args);*/

        //分层的ApplicationContext
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .sources(Parent.class)
                .child(Application.class)
                .run(args);
    }
}
