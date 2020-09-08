package com.example.provider.sevice;

import com.alibaba.dubbo.config.annotation.Service;
import service.BookService;

@Service
public class ProviderServiceImpl implements BookService {

    @Override
    public String getBook() {
        return "获取提供的的书";
    }
}
