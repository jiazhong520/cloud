package com.cloud.jiazhongfe.common.entitys.fegin.user;

import com.cloud.jiazhongfe.common.entitys.User;
import com.cloud.jiazhongfe.common.entitys.fegin.hystrix.FeginRoback;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "USER-SERVICE",fallback = FeginRoback.class)
public interface UserFeginService {

    @GetMapping("/user")
    public User getUser(@RequestParam("a") Integer a);

    @PostMapping("/postUser")
    public User postUser(@RequestParam("b") Integer b);
}
