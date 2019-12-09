package com.study.android.myapplication2222.Reser;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.R;


public class ReserStatus extends Fragment {

    public static ReserStatus newInstance() {
        return new ReserStatus();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.reser_status_fragment, container, false);

        return v;
    }
}
