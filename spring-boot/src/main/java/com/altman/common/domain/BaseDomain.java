package com.altman.common.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDomain {

    private int id;
    private Date createTime;
    private Date updateTime;
}
