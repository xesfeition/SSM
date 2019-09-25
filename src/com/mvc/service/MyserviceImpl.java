package com.mvc.service;

import com.mvc.dao.NewsMapper;
import com.mvc.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyserviceImpl implements Myservice {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<News> all() {
        return newsMapper.all();
    }
}
