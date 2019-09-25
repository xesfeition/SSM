package com.mvc.controller;

import com.mvc.pojo.News;
import com.mvc.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private Myservice myservice;
    @RequestMapping("/all")
    @ResponseBody
    public List<News> all(){
        return myservice.all();
    }
}
