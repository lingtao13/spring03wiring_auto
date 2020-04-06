package com.lingtao.pojo;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hello)) return false;
        Hello hello = (Hello) o;
        return Objects.equals(string, hello.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
