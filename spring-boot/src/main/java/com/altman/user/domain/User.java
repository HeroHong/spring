package com.altman.user.domain;

import com.altman.common.domain.BaseDomain;
import lombok.Data;

@Data
public class User extends BaseDomain {

    private String name;
    private String password;
}
