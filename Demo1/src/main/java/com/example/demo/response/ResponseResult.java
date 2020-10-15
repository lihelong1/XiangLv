package com.example.demo.response;

public class ResponseResult {
    private boolean success;
    private int code;
    private String message;
    private Object data;

    public ResponseResult(ResponseState responseState) {
        this.success = responseState.getSuccess();
        this.code = responseState.getCode();
        this.message = responseState.getMessage();
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(ResponseState.SUCCESS);
    }

    public static ResponseResult LOGIN_SUCCESS(){
        return new ResponseResult(ResponseState.LOGIN_SUCCESS);
    }

    public static ResponseResult SUCCESS(String message){
        ResponseResult responseResult = new ResponseResult(ResponseState.SUCCESS);
        responseResult.setMessage(message);
        return responseResult;
    }


    public static ResponseResult FAILD(){
        return new ResponseResult(ResponseState.FAILD);
    }
    public static ResponseResult FAILD(String message){
        ResponseResult responseResult = new ResponseResult(ResponseState.FAILD);
        responseResult.setMessage(message);
        return responseResult;
    }

    public static ResponseResult LOGIN_FAILD(){
        return new ResponseResult(ResponseState.LOGIN_FAILD);
    }

    public static ResponseResult GET_RESOURCE_FAILD(){
        return new ResponseResult(ResponseState.GET_RESOURCE_FAILD);
    }




    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

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

    public Object getData() {
        return data;
    }

    public ResponseResult setData(Object data) {
        this.data = data;
        return this;
    }
}
