package com.mhj.system;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class WebResult {
    private int ret;
    private String msg;
    private Object result;

    public int getRet() {
        return this.ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public WebResult(Object result) {
        this.result = result;
    }

    public WebResult() {
    }

    public WebResult(int ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }

    public WebResult(int ret, String msg, Object result) {
        this.ret = ret;
        this.msg = msg;
        this.result = result;
    }

    public WebResult(int ret,Object result) {
        this.ret = ret;
        this.result = result;
    }

    public WebResult(Map<String, Object> retMap) {
        if (retMap.get("ret") != null) {
            this.ret = ((Integer) retMap.get("ret")).intValue();
        }

        if (retMap.get("msg") != null) {
            this.msg = (String) retMap.get("msg");
        }

        if (retMap.get("result") != null) {
            this.result = retMap.get("result");
        }

    }

    @JsonIgnore
    public boolean isReturnSuccess() {
        return this.ret == 0;
    }
}
