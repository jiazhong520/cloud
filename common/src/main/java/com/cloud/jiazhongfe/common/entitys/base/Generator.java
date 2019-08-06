package com.cloud.jiazhongfe.common.entitys.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Generator implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 是否删除
     */
    private Boolean deleteFlag;


    /**
     * 创建人
     */
    private String createBy;

    /**
     * 最后修改人
     */
    private String lasterBy;


    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date lasterUpdateDate;
}
