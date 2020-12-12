package com.example.thecoffehouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.model.Thucan;
import com.example.thecoffehouse.model.Thucuong;
import com.example.thecoffehouse.model.Tieude;

import java.util.List;
import java.util.Locale;

public class TieudeAdapter extends RecyclerView.Adapter<TieudeAdapter.TieudeViewHolder> {

    private List<Tieude> mListTieude440;
    private Context context440;

    public TieudeAdapter(List<Tieude> mListTieude440, Context context440) {
        this.mListTieude440 = mListTieude440;
        this.context440 = context440;
    }



    @NonNull
    @Override
    public TieudeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tieude,parent,false);
        return new TieudeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TieudeAdapter.TieudeViewHolder holder, int position) {
        Tieude tieude=mListTieude440.get(position);

        holder.imgTieude440.setImageResource(tieude.getImage());
        holder.tvTentieude440.setText(tieude.getTen());
    }

    @Override
    public int getItemCount() {
            return mListTieude440.size();
    }

    public class TieudeViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgTieude440;
        private TextView tvTentieude440;

        public TieudeViewHolder(@NonNull View itemView) {
            super(itemView);

            imgTieude440=itemView.findViewById(R.id.img_tieude_440);
            tvTentieude440=itemView.findViewById(R.id.tv_ten_440);
        }
    }
}
