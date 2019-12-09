package com.study.android.myapplication2222.PetSiter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.R;
import com.study.android.myapplication2222.Reser.HomeReserMain;


public class PayGraph extends Fragment {

    public static PayGraph newInstance() {
        return new PayGraph();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.pay_graph_fragment, container, false);

        return v;
    }
}
