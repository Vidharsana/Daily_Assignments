package com.mph.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.mph")
@PropertySource("classpath:info.properties")
public class ConfigClass {

}
