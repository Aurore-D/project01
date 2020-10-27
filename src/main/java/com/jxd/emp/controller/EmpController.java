package com.jxd.emp.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.jxd.emp.mapper.IBookMapper;
import com.jxd.emp.model.Book;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IBookService;
import com.jxd.emp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author WangYue
 * @Date 2020/10/22
 * @Version 1.0
 */
@Controller
public class EmpController {

    @Autowired
    private IEmpService empService;
    @Autowired
    private IBookService bookService;

    @Value("${name}")
    private String name;

    @Value("${student.sname}")
    private String sname;

    @Value("${persons[0].pname}")
    private String pname;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(name);
        System.out.println(sname);
        System.out.println(pname);
        return "Hello SpringBoot!!";
    }

    @ResponseBody
    @RequestMapping("getAll")
    public List<Emp> getAll(){

        return empService.getAll();
    }

    @ResponseBody
    @RequestMapping("getBook")
    public List<Book> getBook(){
        return bookService.list();
    }

    @RequestMapping("/helloBtl")
    public String helloBtl(Model model){
        model.addAttribute("msg","helloBtl!!");
        return "hello.btl";
    }

    @RequestMapping("/helloBtl02")
    public String helloBtl02(Model model){
        model.addAttribute("msg","Html末班文件");
        return "hello02.html";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model){
        System.out.println("++++++++++++++++");
        model.addAttribute("msg","改变了模版位置");
        List<Book> list = bookService.list();
        model.addAttribute("list",list);
        System.out.println("+++1");
        return "welcome.html";
    }

    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public String login(@PathVariable("uname") String uname ,@PathVariable("pwd") String pwd){
        if("admin".equals(uname)&&"123".equals(pwd)){
            return "success";
        }else {
            return "error";
        }
    }
}
