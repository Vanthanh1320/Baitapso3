package com.example.thecoffehouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.model.Phobien;

import java.util.ArrayList;
import java.util.List;

public class PhobienAdapter extends BaseAdapter {

    Context context440;
    LinearLayout ln;
    ArrayList<Phobien> phobienList440;
    LayoutInflater layoutInflater440;
    Phobien phobien440;

    public PhobienAdapter(Context context440, ArrayList<Phobien> phobienList440) {
        this.context440 = context440;
        this.phobienList440 = phobienList440;
        layoutInflater440 = (LayoutInflater) context440.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return phobienList440.size();
    }

    @Override
    public Object getItem(int i) {
        return phobienList440.get(i);
    }

    @Override
    public long getItemId(int i) {
        return phobienList440.get(i).getId();
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1 = view;

        if (view1 == null) {
            view1 = layoutInflater440.inflate(R.layout.item_phobien, null, true);

        }

        ImageView image = view1.findViewById(R.id.img_phobien_440);
        TextView tvten = view1.findViewById(R.id.tv_tenphobien_440);
        TextView  tvgia= view1.findViewById(R.id.tv_giaphobien_440);

        phobien440 = phobienList440.get(position);

        image.setImageResource(phobien440.getImage());
        tvten.setText(phobien440.getTen());
        tvgia.setText(phobien440.getGia());

        return view1;
    }
}
