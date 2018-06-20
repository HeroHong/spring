package com.altman.user.controller;

import com.altman.common.dto.BaseResult;
import com.altman.common.exception.ControllerException;
import com.altman.user.domain.User;
import com.altman.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("user")
    public BaseResult addUser (@RequestBody User user) {
        if (user == null || StringUtils.isEmpty(user.getName()) || StringUtils.isEmpty(user.getPassword())) {
            throw new ControllerException("参数异常");
        }
        return userService.saveUser(user);
    }
}
