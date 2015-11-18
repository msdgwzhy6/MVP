package com.example.linxj.model;

/**
 * Created by lvjia on 2015/9/6.
 */
public class UserModel {
    private String name;
    private String password;
    public UserModel(String name,String password){
        this.name = name;
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {

        return name;
    }

    public String getPassword() {
        return password;
    }
}
