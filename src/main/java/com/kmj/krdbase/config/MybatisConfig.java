package com.kmj.krdbase.config;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author mengjian.ke create in 17:11 2018/9/28
 */
@Configuration
public class MybatisConfig {

    private String url;
    private String driver;
    private String username;
    private String password;


}
