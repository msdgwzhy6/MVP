package com.example.linxj.model;

/**
 * Created by lvjia on 2015/9/6.
 */
public class UserModelimp implements IUserModel {
    private String name;
    private String pass;
    public UserModelimp(){

    }
    //进行存储，可以存数据库或远程服务器等。
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPassword(String pass) {
        this.pass = pass;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.pass;
    }

    @Override
    public UserModel getUserModel() {
        return new UserModel(this.name,this.pass);
    }
}
