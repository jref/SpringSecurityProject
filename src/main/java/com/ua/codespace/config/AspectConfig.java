package com.ua.codespace.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.ua.codespace.aspects")
@EnableAspectJAutoProxy
public class AspectConfig {
}
