package com.hbj.myelitis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author miemie
 * @since 2018-08-10
 */
@Configuration
@MapperScan("com.hbj.myelitis.mapper")
public class MybatisPlusConfig {

}
