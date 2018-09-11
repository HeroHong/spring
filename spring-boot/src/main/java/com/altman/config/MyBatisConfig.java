package com.altman.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.ClassPathMapperScanner;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.altman.**.mybatisMapper.xml", sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MyBatisConfig {

    @Bean(name = "masterSqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory (DataSource ds) throws Exception {
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(ds);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sfb.setMapperLocations(resolver.getResources("classpath:com/altman/**/mybatisMapper/*.xml"));

        return sfb.getObject();
    }

    @Bean(name = "masterTransactionManager")
    public DataSourceTransactionManager getTransactionManager (DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }
}
