package com.study.android.myapplication2222.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.study.android.myapplication2222.MainActivity;
import com.study.android.myapplication2222.R;

public class LoginMain extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private EmailLogin emailLogin = new EmailLogin();

    Button emailLoginBtn;
    ImageButton kakaoLoginBtn;
    ImageButton naverLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailLoginBtn = (Button)findViewById(R.id.emailLoginBtn);
        emailLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginMain.this, EmailLogin.class);
                startActivity(intent);
            }
        });

        kakaoLoginBtn = (ImageButton)findViewById(R.id.kakaoLoginBtn);
        kakaoLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginMain.this, MainActivity.class);
                startActivity(intent);
            }
        });

        naverLoginBtn = (ImageButton)findViewById(R.id.naverLoginBtn);
        naverLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginMain.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
