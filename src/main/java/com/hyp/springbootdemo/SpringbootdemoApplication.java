package com.hyp.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 2020年5月31日
 * @author heyapei
 */
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.hyp.blogmaster.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.hyp"})
//开启定时任务
/*@EnableScheduling*/
//开启异步调用方法
/*@EnableAsync*/
public class SpringbootdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }
}
