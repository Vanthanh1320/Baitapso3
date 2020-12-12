package com.example.thecoffehouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.model.Thucan;
import com.example.thecoffehouse.model.Thucuong;
import com.example.thecoffehouse.model.Uudai;

import java.util.ArrayList;
import java.util.List;

public class ThucuongAdapter extends RecyclerView.Adapter<ThucuongAdapter.ThucuongViewHolder> {


    private List<Thucuong> mListThucuong440;
    private Context context440;

    public ThucuongAdapter(List<Thucuong> mListThucuong440, Context context440) {
        this.mListThucuong440 = mListThucuong440;
        this.context440 = context440;
    }

    @NonNull
    @Override
    public ThucuongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thucuong,parent,false);
        return new ThucuongAdapter.ThucuongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThucuongViewHolder holder, int position) {
        Thucuong thucuong=mListThucuong440.get(position);

        holder.img440.setImageResource(thucuong.getImage());
        holder.tvTenthucuong440.setText(thucuong.getTen());
        holder.tvgiathucuong440.setText(thucuong.getGia());
    }

    @Override
    public int getItemCount() {
        return mListThucuong440.size();
    }

    public class ThucuongViewHolder extends RecyclerView.ViewHolder{
        private ImageView img440;
        private TextView tvTenthucuong440, tvgiathucuong440;

        public ThucuongViewHolder(@NonNull View itemView) {
            super(itemView);

            img440=itemView.findViewById(R.id.img_thucuong_440);
            tvTenthucuong440=itemView.findViewById(R.id.tv_tenthucuong_440);
            tvgiathucuong440=itemView.findViewById(R.id.tv_giathucuong_440);

        }
    }
}
