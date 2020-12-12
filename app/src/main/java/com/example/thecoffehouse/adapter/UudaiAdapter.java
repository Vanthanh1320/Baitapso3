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
import com.example.thecoffehouse.model.Tieude;
import com.example.thecoffehouse.model.Uudai;

import java.util.List;

public class UudaiAdapter extends RecyclerView.Adapter<UudaiAdapter.UudaiViewHolder>{

    private List<Uudai> mListUudai440;
    private Context context440;

    public UudaiAdapter(List<Uudai> mListUudai440, Context context440) {
        this.mListUudai440 = mListUudai440;
        this.context440 = context440;
    }

    @NonNull
    @Override
    public UudaiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_uudai,parent,false);
        return new UudaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UudaiAdapter.UudaiViewHolder holder, int position) {
        Uudai uudai=mListUudai440.get(position);

        holder.img440.setImageResource(uudai.getImage());
        holder.tvTenuudai440.setText(uudai.getTen());
        holder.tvMotauudai440.setText(uudai.getMota());
    }

    @Override
    public int getItemCount() {
            return mListUudai440.size();
    }

    public class UudaiViewHolder extends RecyclerView.ViewHolder{

        private ImageView img440;
        private TextView tvTenuudai440, tvMotauudai440;

        public UudaiViewHolder(@NonNull View itemView) {
            super(itemView);

            img440=itemView.findViewById(R.id.img_uudai_440);
            tvTenuudai440=itemView.findViewById(R.id.tv_tenuudai_440);
            tvMotauudai440=itemView.findViewById(R.id.tv_mota_440);
        }
    }
}
