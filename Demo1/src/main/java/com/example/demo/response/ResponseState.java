package com.example.demo.response;

public enum  ResponseState {
    SUCCESS(true,20000,"操作成功"),
    LOGIN_SUCCESS(true,20001,"登陆成功"),
    FAILD(false,40000,"操作失败"),
    GET_RESOURCE_FAILD(false,40001,"获取资源失败"),
    LOGIN_FAILD(false,49999 ,"登陆失败");

    ResponseState(boolean success,int code,String message){
        this.code = code;
        this.message = message;
        this.success = success;

    }



    private int code;
    private String message;
    private Boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}


