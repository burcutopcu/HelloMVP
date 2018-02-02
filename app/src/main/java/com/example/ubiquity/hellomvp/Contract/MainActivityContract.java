package com.example.ubiquity.hellomvp.Contract;

/**
 * Created by Ubiquity on 2/2/2018.
 */

public interface MainActivityContract{

    interface  View {
        void initView();
        void setViewData(String data);
    }

    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }
}

