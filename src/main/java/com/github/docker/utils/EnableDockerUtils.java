package com.github.docker.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.github.docker.utils.config.DockerUtilsConfiguration;

/**
 * @author GRajaMca
 *
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({ DockerUtilsConfiguration.class })
public @interface EnableDockerUtils {

}
