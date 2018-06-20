package com.altman.user.service;

import com.altman.common.dto.BaseResult;
import com.altman.user.domain.User;

public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    BaseResult saveUser (User user);
}
