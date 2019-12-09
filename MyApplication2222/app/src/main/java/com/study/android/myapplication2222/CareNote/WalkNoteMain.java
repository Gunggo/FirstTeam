package com.study.android.myapplication2222.CareNote;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.Community.CommunityMain;
import com.study.android.myapplication2222.R;


public class WalkNoteMain extends Fragment {

    public static WalkNoteMain newInstance() {
        return new WalkNoteMain();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.walknote_main_fragment, container, false);

        return v;
    }
}
