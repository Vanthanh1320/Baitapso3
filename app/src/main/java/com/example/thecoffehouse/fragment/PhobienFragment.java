package com.example.thecoffehouse.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.adapter.PhobienAdapter;
import com.example.thecoffehouse.model.Phobien;

import java.util.ArrayList;

public class PhobienFragment extends DialogFragment  {

    private GridView gridView440;
    Context context440;
    private ArrayList<Phobien> phobienList440;
    private PhobienAdapter phobienAdapter440;
    private Phobien phobien440;
    Button close440;


    public PhobienFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context440=getActivity();
        View root =inflater.inflate(R.layout.fragment_phobien, container, false);
        gridView440 = root.findViewById(R.id.grv_data_440);
        phobienList440 = new ArrayList<>();

        listphobien();
        phobienAdapter440=new PhobienAdapter(context440,phobienList440);
        gridView440.setAdapter(phobienAdapter440);

        Dialog();
        return root;
    }

    private void Dialog(){
        gridView440.setOnItemClickListener((parent, view, position, id) -> {
            Dialog dialog = new Dialog(PhobienFragment.this.getActivity());
            dialog.setContentView(R.layout.dialog_item);

            dialog.show();
        });
    }

    private void listphobien(){

        phobien440=new Phobien();
        phobien440.setId(1);
        phobien440.setImage(R.drawable.phobien1);
        phobien440.setTen("Cà phê Lúa Mạch đá");
        phobien440.setGia("69.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(2);
        phobien440.setImage(R.drawable.phobien2);
        phobien440.setTen("Cà phê Lúa Mạch nóng");
        phobien440.setGia("69.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(3);
        phobien440.setImage(R.drawable.phobien3);
        phobien440.setTen("Socola Lúa Mạch đá");
        phobien440.setGia("69.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(4);
        phobien440.setImage(R.drawable.phobien4);
        phobien440.setTen("Socola Lúa Mạch nóng");
        phobien440.setGia("69.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(5);
        phobien440.setImage(R.drawable.phobien5);
        phobien440.setTen("Macca Phủ Socola");
        phobien440.setGia("45.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(6);
        phobien440.setImage(R.drawable.phobien6);
        phobien440.setTen("Cà phê sữa đá");
        phobien440.setGia("32.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(7);
        phobien440.setImage(R.drawable.phobien7);
        phobien440.setTen("Trà sữa Mắc Trân Châu");
        phobien440.setGia("45.000 đ");
        phobienList440.add(phobien440);

        phobien440=new Phobien();
        phobien440.setId(8);
        phobien440.setImage(R.drawable.phobien8);
        phobien440.setTen("Trà đào Cam Sả-Đá");
        phobien440.setGia("45.000 đ");
        phobienList440.add(phobien440);

    }


}
