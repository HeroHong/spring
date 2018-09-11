package com.altman.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class DataSourceConfig {

    @Value("${driverClass}")
    private String driverClassName;
    @Value("${jdbcUrl}")
    private String jdbcUrl;
    @Value("${user}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${connectionTimeout}")
    private String connectionTimeout;
    @Value("${maximumPoolSize}")
    private String maximumPoolSize;
    @Value("${maxLifetime}")
    private String maxLifetime;


    @Bean
    @Primary
    public DataSource getDataSource () {
        HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setJdbcUrl(jdbcUrl);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setConnectionTimeout(Long.valueOf(connectionTimeout));
        ds.setMaximumPoolSize(Integer.valueOf(maximumPoolSize));
        ds.setMaxLifetime(Long.valueOf(maxLifetime));

        ds.addDataSourceProperty("cachePrepStmts", "true");
        ds.addDataSourceProperty("prepStmtCacheSize", "250");
        ds.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        return ds;
    }
}
