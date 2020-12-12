package com.example.thecoffehouse.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.adapter.ThucuongAdapter;
import com.example.thecoffehouse.model.Thucuong;

import java.util.ArrayList;
import java.util.List;

public class ThucuongFragment extends Fragment {

    private RecyclerView rcvthucuong440,rcvdaxay440,rcvtra440,rcvtraicay440,rcvmaccha440,rcvchoco440;
    Context context;
    List<Thucuong> thucuongList440;

    public ThucuongFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View r = inflater.inflate(R.layout.fragment_thucuong, container, false);

        rcvthucuong440=r.findViewById(R.id.rcv_cafe_440);
        rcvdaxay440=r.findViewById(R.id.rcv_daxay_440);
        rcvtra440=r.findViewById(R.id.rcv_tratraicay_440);
        rcvtraicay440=r.findViewById(R.id.rcv_tutraicay_440);
        rcvmaccha440=r.findViewById(R.id.rcv_macchiato_440);
        rcvchoco440=r.findViewById(R.id.rcv_choco_440);

        //cafe
        thucuongList440=new ArrayList<>();

       thucuongList440.add(new Thucuong(R.drawable.phobien6,"Cà phê sữa đá","32.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe1,"Bạc xỉu","32.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe2,"Cà phê đá xay-lạnh","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe3,"Latte đá","50.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe4,"Cold Brew truyền thống","45.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe5,"Cold Brew sữa tươi","45.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe6,"Americano đá","40.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe7,"Cppuchino nóng","50.000 đ"));

        GridLayoutManager manager1 = new GridLayoutManager(ThucuongFragment.this.getActivity(),2);
        manager1.setOrientation(GridLayoutManager.VERTICAL);
        rcvthucuong440.setLayoutManager(manager1);

        ThucuongAdapter adapter1 = new ThucuongAdapter(thucuongList440, ThucuongFragment.this.getActivity());
        rcvthucuong440.setAdapter(adapter1);

        //daxay
        thucuongList440=new ArrayList<>();

        thucuongList440.add(new Thucuong(R.drawable.daxay,"Phúc bồn tử cam đá xay","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.cafe2,"Cà phê đá xay-lạnh","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.daxay2,"Cookie đá xay","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.daxay3,"Đào việt quất đá xay","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.daxay4,"Chocolate đá xay","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.daxay5,"Matcha đá xay","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.daxay6,"Chanh sả đá xay","49.000 đ"));

        GridLayoutManager manager2 = new GridLayoutManager(ThucuongFragment.this.getActivity(),2);
        manager2.setOrientation(GridLayoutManager.VERTICAL);
        rcvdaxay440.setLayoutManager(manager2);

        ThucuongAdapter adapter2 = new ThucuongAdapter(thucuongList440, ThucuongFragment.this.getActivity());
        rcvdaxay440.setAdapter(adapter2);

        //tra
        thucuongList440=new ArrayList<>();

        thucuongList440.add(new Thucuong(R.drawable.tratc1,"Trà phúc bồn tử","50.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.phobien8,"Trà đào cam sả-đá","45.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.tratc2,"Trà bưởi mật ong","50.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.tratc3,"Oolong hạt sen-nóng","52.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.tratc4,"Trà bưởi mật ong","55.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.tratc5,"Oolong vải-đá","45.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.phobien8,"Trà đào cam sả-nóng","52.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.tratc5,"Oolong vải-nóng","52.000 đ"));

        GridLayoutManager manager3 = new GridLayoutManager(ThucuongFragment.this.getActivity(),2);
        manager3.setOrientation(GridLayoutManager.VERTICAL);
        rcvtra440.setLayoutManager(manager3);

        ThucuongAdapter adapter3 = new ThucuongAdapter(thucuongList440, ThucuongFragment.this.getActivity());
        rcvtra440.setAdapter(adapter3);

        //Trai cay
        thucuongList440=new ArrayList<>();

        thucuongList440.add(new Thucuong(R.drawable.traicay1,"Sinh tố cam xoài","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.traicay2,"Sinh tố việt quất","59.000 đ"));


        GridLayoutManager manager4 = new GridLayoutManager(ThucuongFragment.this.getActivity(),2);
        manager4.setOrientation(GridLayoutManager.VERTICAL);
        rcvtraicay440.setLayoutManager(manager4);

        ThucuongAdapter adapter4 = new ThucuongAdapter(thucuongList440, ThucuongFragment.this.getActivity());
        rcvtraicay440.setAdapter(adapter4);

        //Macchiato
        thucuongList440=new ArrayList<>();

        thucuongList440.add(new Thucuong(R.drawable.phobien7,"Trà sửa mắc ca trân châu","45.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.machiato1,"Trà đen Macchiato","42.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.machiato2,"Matcha Macchiato","45.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.machiato3,"Trà xoài Macchiato-đá","50.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.machiato4,"Trà lài Macchiato-lạnh","42.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.machiato5,"Trà sữa khoai môn","42.000 đ"));

        GridLayoutManager manager5 = new GridLayoutManager(ThucuongFragment.this.getActivity(),2);
        manager5.setOrientation(GridLayoutManager.VERTICAL);
        rcvmaccha440.setLayoutManager(manager5);

        ThucuongAdapter adapter5 = new ThucuongAdapter(thucuongList440, ThucuongFragment.this.getActivity());
        rcvmaccha440.setAdapter(adapter5);

        //choco
        thucuongList440=new ArrayList<>();

        thucuongList440.add(new Thucuong(R.drawable.phobien3,"Socola lúa mạch đá xay","69.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.phobien4,"Socola lúa mạch nóng","69.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.matcha1,"Trà Matcha Latte đá","59.000 đ"));
        thucuongList440.add(new Thucuong(R.drawable.matcha2,"Socola đá","59.000 đ"));

        GridLayoutManager manager6 = new GridLayoutManager(ThucuongFragment.this.getActivity(),2);
        manager6.setOrientation(GridLayoutManager.VERTICAL);
        rcvchoco440.setLayoutManager(manager6);

        ThucuongAdapter adapter6 = new ThucuongAdapter(thucuongList440, ThucuongFragment.this.getActivity());
        rcvchoco440.setAdapter(adapter6);


        return r;
    }


}
