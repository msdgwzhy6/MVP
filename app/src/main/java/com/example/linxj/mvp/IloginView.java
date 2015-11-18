package com.example.linxj.mvp;

/**
 * Created by lvjia on 2015/9/6.
 */
public interface IloginView {
    void setName(String Name);
    void setPass(String Pass);
    void toast();
    String getName();
    String getPass();
    void setInfo(String str);
}
