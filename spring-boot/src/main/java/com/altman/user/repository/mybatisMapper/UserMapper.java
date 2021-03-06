package com.altman.user.repository.mybatisMapper;

import com.altman.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    int insert(User user);
}
