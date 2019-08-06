package com.cloude.jiazhongfei.product;


import com.cloud.jiazhongfe.common.entitys.User;
import com.cloud.jiazhongfe.common.entitys.fegin.user.UserFeginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Autowired
    private UserFeginService userFeginService;

    @Autowired
    RestTemplate restTemplate;

    /**
     * rest使用
     */
    @Test
    public void contextLoads() {
        final User forObject = restTemplate.getForObject("http://USER-SERVICE/user?a={1}", User.class,10);
        Map<String,Object> hasMap = new HashMap<>();
        hasMap.put("b",10);
        final User post = restTemplate.postForObject("http://USER-SERVICE/postUser",hasMap,User.class);
        System.out.println(forObject.getDesc());
        System.out.println(post.getDesc());
    }


    @Test
    public void test(){
        final User user = userFeginService.getUser(1);
        final User use2r = userFeginService.postUser(1);
        System.out.println(user);
        System.out.println(use2r);
    }

}
