package com.cloud.jiazhongfe.common.entitys.fegin.hystrix;

import com.cloud.jiazhongfe.common.entitys.User;
import com.cloud.jiazhongfe.common.entitys.fegin.user.UserFeginService;
import org.springframework.stereotype.Component;

@Component
public class FeginRoback implements UserFeginService {

    @Override
    public User getUser(Integer a) {
        User user = new User();
        user.setId(1l);
        return user;
    }

    @Override
    public User postUser(Integer b) {
        User user = new User();
        user.setId(1l);
        return user;
    }
}
