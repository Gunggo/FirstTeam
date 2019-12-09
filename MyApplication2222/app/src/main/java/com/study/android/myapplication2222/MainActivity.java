package com.study.android.myapplication2222;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.study.android.myapplication2222.CareNote.CareNoteMain;
import com.study.android.myapplication2222.CareNote.WalkNoteMain;
import com.study.android.myapplication2222.Community.CommunityMain;
import com.study.android.myapplication2222.Home.Home;
import com.study.android.myapplication2222.Reser.HomeReserMain;
import com.study.android.myapplication2222.SideNav.SideNavMain;

public class MainActivity extends AppCompatActivity {

    // 프래그먼트
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private CommunityMain communityMain = new CommunityMain();
    private Home main = new Home();
    private SideNavMain sideNavMain = new SideNavMain();

    Toolbar mainToolBar;
    ActionBar mainActionBar;
    ImageView topLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.FrameLayout, main).commitAllowingStateLoss();

        // 하단 메뉴
        BottomNavigationView bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction1 = fragmentManager.beginTransaction();

                switch (menuItem.getItemId()) {
                    case R.id.bottom_home:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        transaction1.replace(R.id.FrameLayout, main)
                                .commitAllowingStateLoss();
                        break;
                    case R.id.bottom_reser:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        callReserDial();
                        break;
                    case R.id.bottom_care:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        callNoteDial();
                        break;
                    case R.id.bottom_board:
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        transaction1.replace(R.id.FrameLayout, communityMain)
                                .commitAllowingStateLoss();
                        break;
                }
                return true;
            }
        });

        // 툴바 활성화
        mainToolBar = (Toolbar) findViewById(R.id.mainToolBar);
        setSupportActionBar(mainToolBar);
        mainToolBar.setBackgroundColor(Color.WHITE);

        // 액션바 활성화
        mainActionBar = getSupportActionBar();

        // 툴바 홈버튼 활성화
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // 툴바 홈버튼 이미지 변경
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.top_nav);
        // 툴바 타이틀제목 제거
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    // 툴바 아이템 리스너
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            callSide();
            return true;
        } else if (item.getItemId() == R.id.side_home_btn) {
            replaceFragment(Home.newInstance());
            return true;
        } else if (item.getItemId() == R.id.side_chat_btn){

        } else if (item.getItemId() == R.id.filterClose) {
            replaceFragment(HomeReserMain.newInstance());
        }
        return super.onOptionsItemSelected(item);
    }

    // 사이드 네비
    public void callSide() {
        topLogo = (ImageView)findViewById(R.id.topLogo);
        topLogo.setVisibility(View.GONE);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.FrameLayout, sideNavMain).commitAllowingStateLoss();
    }

    // 툴바 숨기기
    public void hideActionBar() {
        mainActionBar.hide();
    }

    // 툴바 꺼내기
    public void showActionBar() {
        mainActionBar.show();
    }

    // 프래그먼트 전환용 메서드
    public void replaceFragment(Fragment fragment) {
        topLogo = (ImageView)findViewById(R.id.topLogo);
        topLogo.setVisibility(View.VISIBLE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.FrameLayout, fragment).commit();
    }

    // 일지 다이얼로그
    public void callNoteDial() {
        final Dialog noteDial = new Dialog(this);
        noteDial.getWindow().setGravity(Gravity.BOTTOM);
        noteDial.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        noteDial.setContentView(R.layout.care_dialog);

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(noteDial.getWindow().getAttributes());

        Button careNote = noteDial.findViewById(R.id.careNoteBtn);
        careNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noteDial.hide();
                replaceFragment(CareNoteMain.newInstance());
            }
        });

        Button walkNote = noteDial.findViewById(R.id.walkNoteBtn);
        walkNote.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                noteDial.hide();
                replaceFragment(WalkNoteMain.newInstance());
            }
        });

        noteDial.show();
    }

    // 예약 다이얼로그
    public void callReserDial() {
        final Dialog reserDial = new Dialog(this);
        reserDial.getWindow().setGravity(Gravity.BOTTOM);
        reserDial.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        reserDial.setContentView(R.layout.reser_dialog);

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(reserDial.getWindow().getAttributes());

        Button homeReser = reserDial.findViewById(R.id.homeReserBtn);
        homeReser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reserDial.hide();
                replaceFragment(HomeReserMain.newInstance());
            }
        });

        Button walkReser = reserDial.findViewById(R.id.walkReserBtn);
        walkReser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reserDial.hide();
                replaceFragment(WalkNoteMain.newInstance());
            }
        });

        reserDial.show();
    }
}
