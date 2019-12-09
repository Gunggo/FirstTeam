package com.study.android.myapplication2222.Reser;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.study.android.myapplication2222.R;

import java.util.ArrayList;
import java.util.List;


public class ReserListAdapter extends RecyclerView.Adapter<ReserListAdapter.Holder> {

    private List<ReserItem> rList;
    private ArrayList<Integer> imageList;
    Context context;
    // 좋아요 테스트용
    int i = 0;

    public ReserListAdapter(List<ReserItem> rList, Context context) {
        this.rList = rList;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.reser_pet_siter_list_item, viewGroup, false);
        final Holder viewHolder = new Holder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, int position) {

        ReserPageAdapter adapter = new ReserPageAdapter(context, rList.get(position).getImageList());

        // 뷰페이저 어댑터
        holder.viewPager.setAdapter(adapter);

        // 좋아요 버튼
        holder.likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1 - i;

                if (i==0) {
                    holder.likeBtn.setImageResource(R.drawable.like);
                }
                else {
                    holder.likeBtn.setImageResource(R.drawable.empty_like);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return rList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ViewPager viewPager;
        private ImageButton likeBtn;

        public Holder(@NonNull View itemView) {
            super(itemView);
            viewPager = (ViewPager)itemView.findViewById(R.id.picturePager);
            likeBtn = (ImageButton)itemView.findViewById(R.id.likeBtn);
        }
    }
}
