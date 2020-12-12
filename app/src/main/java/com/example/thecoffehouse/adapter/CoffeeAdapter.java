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
import com.example.thecoffehouse.model.Coffee;
import com.example.thecoffehouse.model.Uudai;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>{

    private List<Coffee> mListCoffee440;
    private Context context440;

    public CoffeeAdapter(List<Coffee> mListCoffee440, Context context440) {
        this.mListCoffee440 = mListCoffee440;
        this.context440 = context440;
    }

    @NonNull
    @Override
    public CoffeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coffe,parent,false);
        return new CoffeeAdapter.CoffeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeAdapter.CoffeeViewHolder holder, int position) {
        Coffee coffee=mListCoffee440.get(position);

        holder.img440.setImageResource(coffee.getImage());
        holder.tvTencoffee440.setText(coffee.getTencoffee());
        holder.tvMotacoffee440.setText(coffee.getMotacoffee());
    }

    @Override
    public int getItemCount() {
        return mListCoffee440.size();
    }

    public class CoffeeViewHolder extends RecyclerView.ViewHolder{
        private ImageView img440;
        private TextView tvTencoffee440, tvMotacoffee440;

        public CoffeeViewHolder(@NonNull View itemView) {
            super(itemView);

            img440=itemView.findViewById(R.id.img_coffe_440);
            tvTencoffee440=itemView.findViewById(R.id.tv_tencoffe_440);
            tvMotacoffee440=itemView.findViewById(R.id.tv_motacoffe_440);
        }
    }
}
