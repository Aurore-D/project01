package com.jxd.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName EmpApplication
 * @Description TODO
 * @Author WangYue
 * @Date 2020/10/22
 * @Version 1.0
 */

//@ComponentScan(basePackages = "com.jxd") //扫描@service等注解
@SpringBootApplication
@MapperScan("com.jxd.emp.mapper")   //
public class EmpApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmpApplication.class);
    }
}



