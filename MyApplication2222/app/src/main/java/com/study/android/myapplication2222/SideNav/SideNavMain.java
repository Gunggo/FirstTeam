package com.study.android.myapplication2222.SideNav;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.study.android.myapplication2222.MainActivity;
import com.study.android.myapplication2222.PetSiter.PayGraph;
import com.study.android.myapplication2222.R;
import com.study.android.myapplication2222.Reser.ReserStatus;


public class SideNavMain extends Fragment {

    public static SideNavMain newInstance() {
        return new SideNavMain();
    }

    Button myPageBtn;
    Button reserBtn;
    Button petInfoBtn;
    Button liveChatBtn;
    Button cunsultBtn;
    Button faqBtn;
    Button newsBtn;
    Button logoutBtn;
    Button revenueBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.sidenav_main_fragment, container, false);

        // onCreateOptionsMenu 승인
        setHasOptionsMenu(true);

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        myPageBtn = (Button)view.findViewById(R.id.myPageBtn);
        myPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(MyPage.newInstance());
            }
        });
        reserBtn = (Button)view.findViewById(R.id.reserListBtn);
        reserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(ReserStatus.newInstance());
            }
        });
        petInfoBtn = (Button)view.findViewById(R.id.petInfoBtn);
        petInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(PetInfo.newInstance());
            }
        });
        liveChatBtn = (Button)view.findViewById(R.id.liveChatBtn);
        liveChatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(LiveChat.newInstance());
            }
        });
        cunsultBtn = (Button)view.findViewById(R.id.cunsultBtn);
        cunsultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(Cunsult.newInstance());
            }
        });
        faqBtn = (Button)view.findViewById(R.id.faqBtn);
        faqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(FAQ.newInstance());
            }
        });
        newsBtn = (Button)view.findViewById(R.id.newsBtn);
        newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(News.newInstance());
            }
        });
        logoutBtn = (Button)view.findViewById(R.id.logOutBtn);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(Logout.newInstance());
            }
        });
        revenueBtn = (Button)view.findViewById(R.id.revenueBtn);
        revenueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragment(PayGraph.newInstance());
            }
        });


    }

    // 툴바 메뉴만들기
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.side_nav, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//            callSide();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
