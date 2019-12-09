package com.study.android.myapplication2222;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.study.android.myapplication2222.Login.LoginMain;


public class IntroActivity extends AppCompatActivity {

    private static final int STOPSPLASH = 0;
    private static final long SPLASHTIME = 1000;

    private Handler splashHander = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            Intent intent;

            switch (msg.what)
            {
                case STOPSPLASH :
                    intent = new Intent(IntroActivity.this, LoginMain.class);
                    startActivity(intent);
                    overridePendingTransition(R.xml.fade_in, R.xml.hold);
                    finish();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Message msg = new Message();
        msg.what = STOPSPLASH;
        splashHander.sendMessageDelayed(msg, SPLASHTIME);
    }
}
