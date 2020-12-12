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

public class ChocoAdapter extends RecyclerView.Adapter<ChocoAdapter.ThucuongViewHolder>{

    private List<Thucuong> mListThucuong440;
    private Context context440;

    public ChocoAdapter(List<Thucuong> mListThucuong440, Context context440) {
        this.mListThucuong440 = mListThucuong440;
        this.context440 = context440;
    }

    @NonNull
    @Override
    public ChocoAdapter.ThucuongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_choco, parent, false);
        return new ChocoAdapter.ThucuongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChocoAdapter.ThucuongViewHolder holder, int position) {
        Thucuong thucuong=mListThucuong440.get(position);

        holder.img440.setImageResource(thucuong.getImage());
        holder.tvTenchoco440.setText(thucuong.getTen());
        holder.tvgiachoco440.setText(thucuong.getGia());
    }

    @Override
    public int getItemCount() {
        return mListThucuong440.size();
    }

    public static class ThucuongViewHolder extends RecyclerView.ViewHolder {

        private ImageView img440;
        private TextView tvTenchoco440, tvgiachoco440;

        public ThucuongViewHolder(@NonNull View itemView) {
            super(itemView);

            img440 = itemView.findViewById(R.id.img_choco_440);
            tvTenchoco440 = itemView.findViewById(R.id.tv_tenchoco_440);
            tvgiachoco440 = itemView.findViewById(R.id.tv_giachoco_440);
        }
    }
}
