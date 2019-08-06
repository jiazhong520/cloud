package com.cloud.jiazhongfe.common.entitys;

import com.cloud.jiazhongfe.common.entitys.base.Generator;
import lombok.Data;

import java.util.Date;

@Data
public class User extends Generator {
    private static final long serialVersionUID = 1L;


    /**
     * 用户名称
     */
    private String nickName;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 性别
     */
    private String gerder;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String iocn;

    /**
     * 自我描述
     */
    private String desc;

    /**
     * 是否封禁
     */
    private String isProhibition;

    /**
     * 封禁模块
     */
    private String modular;

    /**
     * 封禁时间
     */
    private Date isModularCreateDate;

    /**
     * 是否是幸运用户
     */
    private String isLucky;

    /**
     * 密码
     */
    private String passWord;

    /**
     * user_client
     */
    private String userClient;

    /**
     * is_vip
     */
    private String isVip;

}