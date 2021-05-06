package com.zfcraft.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

//@EnableFeignClients
//@SpringCloudApplication
@SpringBootApplication
@MapperScan("com.zfcraft.web.mapper")
public class AssetApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetApplication.class, args);
	}
}
