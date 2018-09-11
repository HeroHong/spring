package com.altman.config;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceConfig {

    private String dataSourceClassName;
    private String jdbcUrl;
    private String username;
    private String password;
    private String connectionTimeout;
    private String idleTimeout;
    private String maxLifetime;



    public DataSource getDataSource () {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/simpsons");
        ds.setUsername("bart");
        ds.setPassword("51mp50n");
        return ds;
    }
}
