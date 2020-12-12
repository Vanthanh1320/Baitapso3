package com.example.thecoffehouse.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.model.Capnhat;
import com.example.thecoffehouse.model.Uudai;

import java.util.List;

public class CapnhatAdapter extends RecyclerView.Adapter<CapnhatAdapter.CapnhatViewHolder>{

    private List<Capnhat> mListCapnhat440;
    private Context context440;

    public CapnhatAdapter(List<Capnhat> mListCapnhat440, Context context440) {
        this.mListCapnhat440 = mListCapnhat440;
        this.context440 = context440;
    }


    @NonNull
    @Override
    public CapnhatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_capnhatnha,parent,false);
        return new CapnhatAdapter.CapnhatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CapnhatAdapter.CapnhatViewHolder holder, int position) {
       Capnhat capnhat=mListCapnhat440.get(position);

        holder.img440.setImageResource(capnhat.getImage());
        holder.tvTencapnhat440.setText(capnhat.getTencapnhat());
        holder.tvMotacapnhat440.setText(capnhat.getMotacapnhat());
    }

    @Override
    public int getItemCount() {
        return mListCapnhat440.size();
    }

    public class CapnhatViewHolder extends RecyclerView.ViewHolder{

        private ImageView img440;
        private TextView tvTencapnhat440, tvMotacapnhat440;

        public CapnhatViewHolder(@NonNull View itemView) {
            super(itemView);

            img440=itemView.findViewById(R.id.img_capnhatnha_440);
            tvTencapnhat440=itemView.findViewById(R.id.tv_tencapnhat_440);
            tvMotacapnhat440=itemView.findViewById(R.id.tv_motacapnhat_440);
        }
    }
}
