package com.example.parameter.boot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath*:META-INF/spring-config/*.xml")
public class SpringXMLConfiguration {
}
