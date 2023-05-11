package com.demo.postgresqlspring.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.demo.postgresqlspring" })
public class Configuration {
}
