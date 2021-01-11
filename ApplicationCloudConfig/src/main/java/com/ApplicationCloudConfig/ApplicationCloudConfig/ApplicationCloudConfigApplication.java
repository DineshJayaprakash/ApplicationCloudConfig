package com.ApplicationCloudConfig.ApplicationCloudConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * class ApplicationCloudConfigApplication
 * 
 * @created By Dinesh J
 * @created Date 08/12
 * @description used to execute user module 
 */
@EnableConfigServer
@SpringBootApplication
public class ApplicationCloudConfigApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ApplicationCloudConfigApplication.class, args);
	}

}
