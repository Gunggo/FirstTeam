package com.study.android.myapplication2222.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.study.android.myapplication2222.MainActivity;
import com.study.android.myapplication2222.R;


public class EmailLogin extends AppCompatActivity {

    Button loginCheckBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);

        loginCheckBtn = (Button)findViewById(R.id.emailLoginCheck);
        loginCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmailLogin.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
