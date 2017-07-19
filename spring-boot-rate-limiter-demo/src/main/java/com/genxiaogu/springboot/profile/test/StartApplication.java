package com.genxiaogu.springboot.profile.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author genxiaogu
 * @date 2017/02/19
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class StartApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
