package com.study.android.myapplication2222.SideNav;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.R;


public class PetInfo extends Fragment {

    public static PetInfo newInstance() {
        return new PetInfo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.pet_info_fragment, container, false);

        return v;
    }
}
