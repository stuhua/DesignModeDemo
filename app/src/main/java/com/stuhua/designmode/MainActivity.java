package com.stuhua.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Subject subject=new Subject();
        BinaryObserver observer=new BinaryObserver(subject);
        subject.setState(20);
    }
}
