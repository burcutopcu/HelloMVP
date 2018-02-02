package com.example.ubiquity.hellomvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ubiquity.hellomvp.Contract.MainActivityContract;
import com.example.ubiquity.hellomvp.Presenter.MainActivityPresenter;
import com.example.ubiquity.hellomvp.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    private TextView mTextView;
    private Button mButton;
    private MainActivityContract.Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mPresenter = new MainActivityPresenter(this);

    }
        @Override
        public void initView () {
            mTextView = (TextView) findViewById(R.id.textView5);
            mButton = (Button) findViewById(R.id.button5);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mPresenter.onClick(view);
                }
            });
        }

        @Override
        public void setViewData (String data){
            mTextView.setText(data);
        }
    }

