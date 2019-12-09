package com.study.android.myapplication2222.Reser;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.study.android.myapplication2222.MainActivity;
import com.study.android.myapplication2222.R;

import java.util.ArrayList;
import java.util.List;

import static android.support.annotation.Dimension.DP;

public class HomeReserMain extends Fragment {

    Button setFilter, searchSeoul, searchGyeongGi, searchInCheon;
    private ArrayList<Integer> imageList;
    private List<ReserItem> siterList;

    public static HomeReserMain newInstance() {
        return new HomeReserMain();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.reser_home_fragment, container, false);

//        viewPager = (ViewPager) v.findViewById(R.id.picturePager);
//        viewPager.setClipToPadding(false);
//
//        float density = getResources().getDisplayMetrics().density;
//        int margin = (int) (DP * density);
//        viewPager.setPadding(margin, 0, margin, 0);
//        viewPager.setPageMargin(margin / 2);
//
//        viewPager.setAdapter(new ReserPageAdapter(getContext(), imageList));

        ReserItem reserItem = new ReserItem(initializeData());
        siterList = new ArrayList();
        siterList.add(reserItem);
        siterList.add(reserItem);
        siterList.add(reserItem);
        siterList.add(reserItem);
        siterList.add(reserItem);
        siterList.add(reserItem);
        siterList.add(reserItem);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.siterList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        ReserListAdapter listAdapter = new ReserListAdapter(siterList, getContext());
        recyclerView.setAdapter(listAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);


        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setFilter = (Button) view.findViewById(R.id.setFilterBtn);
        setFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).replaceFragment(SearchFilter.newInstance());
                ((MainActivity) getActivity()).hideActionBar();
            }
        });

        searchSeoul = (Button) view.findViewById(R.id.searchSeoulBtn);
        searchSeoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog seoulDial = new Dialog(getContext());
                seoulDial.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                seoulDial.setContentView(R.layout.reser_search_seoul_dialog);

                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(seoulDial.getWindow().getAttributes());

                ImageButton closeDial1 = (ImageButton) seoulDial.findViewById(R.id.closeDialog1);
                closeDial1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        seoulDial.hide();
                    }
                });

                seoulDial.show();
            }
        });

        searchGyeongGi = (Button) view.findViewById(R.id.searchGyeongGiBtn);
        searchGyeongGi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog GyeongGiDial = new Dialog(getContext());
                GyeongGiDial.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                GyeongGiDial.setContentView(R.layout.reser_search_gyeonggi_dialog);

                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(GyeongGiDial.getWindow().getAttributes());

                ImageButton closeDial2 = (ImageButton) GyeongGiDial.findViewById(R.id.closeDialog2);
                closeDial2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        GyeongGiDial.hide();
                    }
                });

                GyeongGiDial.show();
            }
        });

        searchInCheon = (Button) view.findViewById(R.id.searchIncheonBtn);
        searchInCheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog InCheonDial = new Dialog(getContext());
                InCheonDial.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                InCheonDial.setContentView(R.layout.reser_search_incheon_dialog);

                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(InCheonDial.getWindow().getAttributes());

                ImageButton closeDial3 = (ImageButton) InCheonDial.findViewById(R.id.closeDialog3);
                closeDial3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        InCheonDial.hide();
                    }
                });

                InCheonDial.show();
            }
        });
    }

    public ArrayList<Integer> initializeData() {
        imageList = new ArrayList();

        imageList.add(R.drawable.intro);
        imageList.add(R.drawable.intro5);
        imageList.add(R.drawable.title_intro);
        imageList.add(R.drawable.top_logo);
        imageList.add(R.drawable.naver_login_btn);

        return imageList;
    }
}
