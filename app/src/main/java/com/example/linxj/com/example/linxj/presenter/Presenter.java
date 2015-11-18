package com.example.linxj.com.example.linxj.presenter;

import com.example.linxj.model.IUserModel;
import com.example.linxj.model.UserModel;
import com.example.linxj.model.UserModelimp;
import com.example.linxj.mvp.IloginView;

/**
 * Created by lvjia on 2015/9/6.
 */
public class Presenter {
    IUserModel iUserModel;
    IloginView iloginView;
    public Presenter(IloginView view){
        iUserModel = new UserModelimp() ;
        this.iloginView = view;
    }

    public void setModel(){

        iUserModel.setName(iloginView.getName());
        iUserModel.setPassword(iloginView.getPass());
    }
    public void showInfo(){
        UserModel userModel = iUserModel.getUserModel();
        this.iloginView.toast();
        this.iloginView.setInfo(iUserModel.getName()+" "+iUserModel.getPassword());
    }
}
