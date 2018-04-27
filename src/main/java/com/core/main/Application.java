package com.core.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



/**
 * spring cloud程序入口
 * @author libin
 *
 */

@SpringBootApplication  
@EnableEurekaServer
public class Application {
	public static void main(String[] args) {
		/**
		 * https://blog.csdn.net/wantnrun/article/details/73770782
		 * 此处位服务中心,具体的client 之间的调用2018-04-28日再继续
		 */
		SpringApplication.run(Application.class,args);
	}
}
