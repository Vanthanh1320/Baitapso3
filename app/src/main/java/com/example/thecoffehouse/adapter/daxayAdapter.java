package com.example.thecoffehouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.model.Thucuong;

import java.util.List;

public class daxayAdapter extends RecyclerView.Adapter<daxayAdapter.ThucuongViewHolder>{

    private List<Thucuong> mListThucuong440;
    private Context context440;

    public daxayAdapter(List<Thucuong> mListThucuong440, Context context440) {
        this.mListThucuong440 = mListThucuong440;
        this.context440 = context440;
    }

    @NonNull
    @Override
    public ThucuongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daxay,parent,false);

        return new daxayAdapter.ThucuongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull daxayAdapter.ThucuongViewHolder holder, int position) {
        Thucuong thucuong=mListThucuong440.get(position);

        holder.img440.setImageResource(thucuong.getImage());
        holder.tvTenthucuongdaxay440.setText(thucuong.getTen());
        holder.tvgiathucuongdaxay440.setText(thucuong.getGia());
    }

    @Override
    public int getItemCount() {
        return  mListThucuong440.size();
    }

    public class ThucuongViewHolder extends RecyclerView.ViewHolder{

        private ImageView img440;
        private TextView tvTenthucuongdaxay440, tvgiathucuongdaxay440;

        public ThucuongViewHolder(@NonNull View itemView) {
            super(itemView);

            img440=itemView.findViewById(R.id.img_thucuong_440);
            tvTenthucuongdaxay440=itemView.findViewById(R.id.tv_tenthucuongdx_440);
            tvgiathucuongdaxay440=itemView.findViewById(R.id.tv_giathucuongdx_440);
        }
    }
}
