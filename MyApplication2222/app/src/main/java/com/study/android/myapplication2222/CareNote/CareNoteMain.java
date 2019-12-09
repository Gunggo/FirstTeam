package com.study.android.myapplication2222.CareNote;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.R;


public class CareNoteMain extends Fragment {

    public static CareNoteMain newInstance() {
        return new CareNoteMain();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.carenote_main_fragment, container, false);

        return v;
    }
}
