package com.example.cyyz.myjenkinstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @InjectView(R.id.tv_holleworldd)
    TextView tvHolleworldd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        tvHolleworldd.setText("你好世界");
    }

    @OnClick(R.id.tv_holleworldd)
    public void onClick() {
        tvHolleworldd.setText("test2");
    }
}
