package com.example.comsumer.domain;

import java.util.Map;

public class RequestDTO {
    /** 接口名 **/
    private String interfaceName;
    /** 方法名 **/
    private String methodName;
    /** 方法参数 **/
    private Map[] methodParams;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Map[] getMethodParams() {
        return methodParams;
    }

    public void setMethodParams(Map[] methodParams) {
        this.methodParams = methodParams;
    }
}
