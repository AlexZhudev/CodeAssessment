package com.alexdev.codeassign;



/* *
 *  Author: Alex
 *  instruction:
 *  go to http://localhost:8088/
 * 
 * 
 * 
 * 
 * */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.alexdev.codeassign.service.FileProperties;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties(FileProperties.class)
@EnableJpaRepositories
public class UploadFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadFileApplication.class, args);
	}
}
