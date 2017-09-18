package com.shiziqiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 启动一个服务注册中心
 * 只需要一个注解@EnableEurekaServer
 * @author shiziqiu
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerStudyApplication.class, args);
	}
}
