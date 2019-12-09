package com.study.android.myapplication2222.Community;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.Home.Home;
import com.study.android.myapplication2222.R;


public class CommunityMain extends Fragment {

    public static CommunityMain newInstance() {
        return new CommunityMain();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.commnunity_main_fragment, container, false);

        return v;
    }
}
