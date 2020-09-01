package com.along.test_user.entity;

public class Msg {
    private int code;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Msg success(Object data){
        Msg msg=new Msg();
        msg.setCode(100);
        msg.setData(data);
        return msg;
    }
}
