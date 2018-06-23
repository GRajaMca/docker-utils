package com.github.docker.utils.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author GRajaMca
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.github.docker.utils" })
@ConditionalOnWebApplication
public class DockerUtilsConfiguration {

}
