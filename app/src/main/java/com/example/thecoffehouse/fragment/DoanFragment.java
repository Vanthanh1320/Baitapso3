package com.example.thecoffehouse.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.adapter.ThucanAdapter;
import com.example.thecoffehouse.model.Thucan;

import java.util.ArrayList;

public class DoanFragment extends Fragment {

    private GridView gridView440;
    Context context440;
    private ArrayList<Thucan> thucanList440;
    private ThucanAdapter thucanAdapter440;
    private Thucan thucan440;

    public DoanFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context440=getActivity();
        View root =inflater.inflate(R.layout.fragment_doan, container, false);
        gridView440 = root.findViewById(R.id.grv_thucan_440);
        thucanList440 = new ArrayList<>();

        Dialog();
        listthucan();
        thucanAdapter440=new ThucanAdapter(context440,thucanList440);
        gridView440.setAdapter(thucanAdapter440);
        return root;

    }

    private void Dialog(){
        gridView440.setOnItemClickListener((parent, view, position, id) -> {
            Dialog dialog = new Dialog(DoanFragment.this.getActivity());
            dialog.setContentView(R.layout.dialog_itemdoan);

            dialog.show();
        });
    }

    private void listthucan() {

        thucan440 = new Thucan();
        thucan440.setId(1);
        thucan440.setImage(R.drawable.phobien5);
        thucan440.setTen("Macca Phủ Socola");
        thucan440.setGia("45.000 đ");
        thucanList440.add(thucan440);

        thucan440 = new Thucan();
        thucan440.setId(2);
        thucan440.setImage(R.drawable.thucan1);
        thucan440.setTen("Mít sấy");
        thucan440.setGia("20.000 đ");
        thucanList440.add(thucan440);

        thucan440 = new Thucan();
        thucan440.setId(3);
        thucan440.setImage(R.drawable.thucan2);
        thucan440.setTen("Cơm cháy chà bông");
        thucan440.setGia("69.000 đ");
        thucanList440.add(thucan440);
    }
}
