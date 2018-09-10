package com.altman.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dataSource.properties")
@Data
public class MyBatisConfig {

    @Value("${driverClass}")
    private String driverClass;
    @Value("${jdbcUrl}")
    private String jdbcUrl;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;
}
