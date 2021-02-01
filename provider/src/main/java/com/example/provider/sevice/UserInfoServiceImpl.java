package com.example.provider.sevice;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.provider.api.UserInfoService;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public Map<String, String> getUser(String id) {
        System.out.println("dubbo泛化调用！");
        Map<String, String> map = new HashMap<>();
        map.put("id", "1001");
        map.put("param", "小明");
        return map;
    }

    @Override
    public Map<String, String>[] getUsers() {
        return new Map[0];
    }
}
