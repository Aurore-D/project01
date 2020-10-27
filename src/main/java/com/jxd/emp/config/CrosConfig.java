package com.jxd.emp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:zff
 * @Description:Todo
 * @Date:2020/4/19
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {
    public void addCorsMappings(CorsRegistry registry){//添加跨域请求
        //   /**匹配的是我们后台的路径，代表后台共享了什么资源
        registry.addMapping("/**")
                //匹配的是前台的服务器地址，* 是允许任意其他服务器
                .allowedOrigins("*")
                //允许的前台的请求方式
                .allowedMethods("GET","HEAD","POST","DELETE","OPTIONS")
                //
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }
}
