package com.cloud.jiazhongfe.common.entitys.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class config {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
