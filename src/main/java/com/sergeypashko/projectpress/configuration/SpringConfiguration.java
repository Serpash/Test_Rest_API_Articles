package com.sergeypashko.projectpress.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sergeypashko.projectpress")
@EnableAutoConfiguration
public class SpringConfiguration {
}
