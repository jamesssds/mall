package com.example.provider.api;

import java.util.Map;

public interface UserInfoService {
    Map<String, String> getUser(String id);

    Map<String, String>[] getUsers();
}
