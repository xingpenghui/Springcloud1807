package com.feri.springcloud1807.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *@Author feri
 *@Date Created in 2019/3/21 15:38
 */
@SpringBootApplication
@EnableFeignClients    //基于Feign
@EnableDiscoveryClient  //发现服务  服务消费者
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
