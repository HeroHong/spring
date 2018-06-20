package com.altman.user.service.impl;

import com.altman.common.dto.BaseResult;
import com.altman.user.domain.User;
import com.altman.user.repository.mybatisMapper.UserMapper;
import com.altman.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public BaseResult<Boolean> saveUser(User user) {
        if (user == null || StringUtils.isEmpty(user.getName())
                || StringUtils.isEmpty(user.getPassword())) {
            return BaseResult.error(false);
        }

        if (userMapper.insert(user) == 1) {
            return BaseResult.success(true);
        }
        return BaseResult.error(false);
    }
}
