package com.jxd.emp.controller;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author WangYue
 * @Date 2020/10/23
 * @Version 1.0
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "student")
public class ConfigController {
    private String sname;
    private String sage;
    private String ssex;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    @RequestMapping("config")
    @ResponseBody
    public String Config(){
        System.out.println(sname+sage+ssex);
        return "hello";
    }
}
