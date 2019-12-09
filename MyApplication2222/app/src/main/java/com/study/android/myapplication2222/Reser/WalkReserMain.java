package com.study.android.myapplication2222.Reser;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.R;
import com.study.android.myapplication2222.SideNav.Cunsult;

public class WalkReserMain extends Fragment {

    public static WalkReserMain newInstance() {
        return new WalkReserMain();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.walk_reser_main_fragment, container, false);

        return v;
    }
}
