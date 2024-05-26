package com.qqboj.qqbojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication()
@MapperScan("com.qqboj.qqbojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.qqboj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.qqboj.qqbojbackendserviceclient.service"})
public class YuojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuojBackendUserServiceApplication.class, args);
    }

}
