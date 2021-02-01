package com.example.comsumer.controller;

import com.example.comsumer.common.DubboServiceFactory;
import com.example.comsumer.domain.RequestDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RouterController {
    @PostMapping(value = "/router/")
    public Object getUser(@RequestBody RequestDTO dto) {
        Map<String, Object> map = new HashMap<>();
        //后端接口参数类型
        map.put("ParamType", "java.lang.String");
        //用以调用后端接口的实参
        map.put("Object", dto.getMethodParams()[0].get("id"));

        List<Map<String, Object>> paramInfos= new ArrayList<>();
        paramInfos.add(map);

        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();

        return dubbo.genericInvoke(dto.getInterfaceName(), dto.getMethodName(), paramInfos);
    }
}
