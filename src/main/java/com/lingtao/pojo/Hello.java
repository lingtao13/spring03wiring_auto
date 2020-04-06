package com.lingtao.pojo;

/**
 * Created by lingtao on 2020/4/6 17:44
 **/
public class Hello {


    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                '}';
    }
}
