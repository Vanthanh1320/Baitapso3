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

public class TraiCayAdapter extends RecyclerView.Adapter<TraiCayAdapter.ThucuongViewHolder>{

    private List<Thucuong> mListThucuong440;
    private Context context440;

    public TraiCayAdapter(List<Thucuong> mListThucuong440, Context context440) {
        this.mListThucuong440 = mListThucuong440;
        this.context440 = context440;
    }
    @NonNull
    @Override
    public TraiCayAdapter.ThucuongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_traicay,parent,false);

        return new TraiCayAdapter.ThucuongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TraiCayAdapter.ThucuongViewHolder holder, int position) {
        Thucuong thucuong=mListThucuong440.get(position);

        holder.img440.setImageResource(thucuong.getImage());
        holder.tvTentraicay440.setText(thucuong.getTen());
        holder.tvgiatraicay440.setText(thucuong.getGia());
    }

    @Override
    public int getItemCount() {
        return  mListThucuong440.size();
    }

    public class ThucuongViewHolder extends RecyclerView.ViewHolder{

        private ImageView img440;
        private TextView tvTentraicay440, tvgiatraicay440;

        public ThucuongViewHolder(@NonNull View itemView) {
            super(itemView);

            img440=itemView.findViewById(R.id.img_traicay_440);
            tvTentraicay440=itemView.findViewById(R.id.tv_tentraicay_440);
            tvgiatraicay440=itemView.findViewById(R.id.tv_giatraicay_440);
        }
    }
}
