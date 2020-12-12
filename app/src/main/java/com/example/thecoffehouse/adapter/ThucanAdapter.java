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
import com.example.thecoffehouse.model.Phobien;
import com.example.thecoffehouse.model.Thucan;
import com.example.thecoffehouse.model.Tieude;

import java.util.ArrayList;
import java.util.List;

public class ThucanAdapter extends BaseAdapter {

    Context context440;
    LinearLayout ln;
    ArrayList<Thucan> thucanList440;
    LayoutInflater layoutInflater440;
    Thucan thucan440;


    public ThucanAdapter(Context context440, ArrayList<Thucan> thucanList440) {
        this.context440 = context440;
        this.thucanList440 = thucanList440;
        layoutInflater440 = (LayoutInflater) context440.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return thucanList440.size();
    }

    @Override
    public Object getItem(int i) {
        return thucanList440.get(i);
    }

    @Override
    public long getItemId(int i) {
        return thucanList440.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1 = view;

        if (view1 == null) {
            view1 = layoutInflater440.inflate(R.layout.item_thucan, null, true);
        }

        ImageView image = view1.findViewById(R.id.img_thucan_440);
        TextView tvten = view1.findViewById(R.id.tv_tenthucan_440);
        TextView  tvgia= view1.findViewById(R.id.tv_giathucan_440);


        thucan440 = thucanList440.get(position);

        image.setImageResource(thucan440.getImage());
        tvten.setText(thucan440.getTen());
        tvgia.setText(thucan440.getGia());

        return view1;
    }
}
