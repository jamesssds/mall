package com.example.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BookService;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {

    @Reference
    BookService bookService;

    @ResponseBody
    @RequestMapping("/message")
    public String getProviderMessage() {
        return bookService.getBook();
    }
}
