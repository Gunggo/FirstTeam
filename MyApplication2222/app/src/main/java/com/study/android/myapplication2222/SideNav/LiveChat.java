package com.study.android.myapplication2222.SideNav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.android.myapplication2222.R;


public class LiveChat extends Fragment {

    public static LiveChat newInstance() {
        return new LiveChat();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.live_chat_fragment, container, false);

        return v;
    }

}
