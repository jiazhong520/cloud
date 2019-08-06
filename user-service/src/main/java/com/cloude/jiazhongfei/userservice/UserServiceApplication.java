package com.cloude.jiazhongfei.userservice;


import com.cloud.jiazhongfe.common.entitys.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;


@SpringBootApplication
@PropertySource("classpath:config/application-dev.properties")
@Configuration
@EnableDiscoveryClient
@RestController
@Log4j2
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @GetMapping("/user")
    public User getUser(@NotNull Integer a){
        User user  = new User();
        user.setDesc("test");
        log.info(a);
        return user;
    }
    @PostMapping("/postUser")
    public User postUser(@NotNull Integer b){
        User user  = new User();
        user.setDesc("test");
        return user;
    }
}
