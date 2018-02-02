package com.example.ubiquity.hellomvp.Model;

import com.example.ubiquity.hellomvp.Contract.MainActivityContract;

/**
 * Created by Ubiquity on 2/2/2018.
 */

public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String getData() {
        return "Hello World";
    }
}
