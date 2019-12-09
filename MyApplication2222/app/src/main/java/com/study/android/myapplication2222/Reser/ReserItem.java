package com.study.android.myapplication2222.Reser;

import android.support.v4.view.ViewPager;

import java.util.ArrayList;

public class ReserItem {
    private int score;
    private String address;
    private ArrayList<Integer> imageList;

    public ReserItem(ArrayList<Integer> imageList) {
        this.imageList = imageList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Integer> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<Integer> imageList) {
        this.imageList = imageList;
    }
}
