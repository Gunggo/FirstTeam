package com.study.android.myapplication2222.Reser;


import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.study.android.myapplication2222.MainActivity;
import com.study.android.myapplication2222.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SearchFilter extends Fragment {

    TextView startDate, endDate;
    int selYear, selMonth, selDay;
    ToggleButton dosage,field,oldDog,sickDog,cerificate,outPee,noDog,firstAid;
    ImageButton filterCloseBtn;

    public static SearchFilter newInstance() {
        return new SearchFilter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.reser_search_filter, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Calendar cal = Calendar.getInstance();
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

        startDate = (TextView) view.findViewById(R.id.filterStartDate);
        startDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog1 = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                        String msg = String.format("%d년 %d월 %d일", year, month + 1, date);
                        startDate.setText(msg);
                        selYear = year;
                        selMonth = month;
                        selDay = date;
                    }
                }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));

                dialog1.getDatePicker().setMinDate(new Date().getTime());    //입력한 날짜 이후로 클릭 안되게 옵션
                dialog1.show();
            }
        });

        endDate = (TextView) view.findViewById(R.id.filterEndDate);
        endDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog2 = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                        String msg = String.format("%d년 %d월 %d일", year, month + 1, date);
                        endDate.setText(msg);
                    }
                }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));

                Calendar setStartDate = Calendar.getInstance();
                setStartDate.set(selYear, selMonth, selDay);
                dialog2.getDatePicker().setMinDate(setStartDate.getTime().getTime());    //입력한 날짜 이후로 클릭 안되게 옵션
                dialog2.show();
            }
        });

        filterCloseBtn = (ImageButton)view.findViewById(R.id.filterCloseBtn);
        filterCloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(HomeReserMain.newInstance());
                ((MainActivity)getActivity()).showActionBar();
            }
        });
//        dosage.setBackgroundColor(getContext().getResources().getColor(R.color.themeColor));
        dosage = (ToggleButton) view.findViewById(R.id.tagDosage);

        field = (ToggleButton)view.findViewById(R.id.tagField);

        oldDog = (ToggleButton)view.findViewById(R.id.tagOldDog);

        sickDog = (ToggleButton)view.findViewById(R.id.tagSickDog);

        cerificate = (ToggleButton)view.findViewById(R.id.tagCertificate);

        outPee = (ToggleButton)view.findViewById(R.id.tagOutPee);

        noDog = (ToggleButton)view.findViewById(R.id.tagNoDog);

        firstAid = (ToggleButton)view.findViewById(R.id.tagFirstAid);
    }
}
