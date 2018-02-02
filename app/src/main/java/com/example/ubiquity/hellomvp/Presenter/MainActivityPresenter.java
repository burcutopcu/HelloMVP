package com.example.ubiquity.hellomvp.Presenter;

import android.view.View;

import com.example.ubiquity.hellomvp.Contract.MainActivityContract;
import com.example.ubiquity.hellomvp.Model.MainActivityModel;
import com.example.ubiquity.hellomvp.View.MainActivity;

/**
 * Created by Ubiquity on 2/2/2018.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivity mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivity view) {
        mView= view;
        initPresenter();
    }

    private void initPresenter(){
        mModel= (MainActivityContract.Model) new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data= mModel.getData();
        mView.setViewData(data);
    }
}
