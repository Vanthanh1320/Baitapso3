package com.example.thecoffehouse.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.thongbao.Thongbao;
import com.example.thecoffehouse.adapter.CapnhatAdapter;
import com.example.thecoffehouse.adapter.CoffeeAdapter;
import com.example.thecoffehouse.adapter.TieudeAdapter;
import com.example.thecoffehouse.adapter.UudaiAdapter;
import com.example.thecoffehouse.model.Capnhat;
import com.example.thecoffehouse.model.Coffee;
import com.example.thecoffehouse.model.Tieude;
import com.example.thecoffehouse.model.Uudai;

import java.util.ArrayList;
import java.util.List;

public class TintucFragment extends Fragment {

    private RecyclerView rcvtieude440,rcvuudai440,rcvcapnhat440,rcvcoffee440;
    Context context;
    List<Tieude> tieudeList440;
    List<Uudai> uudaiList440;
    List<Capnhat> capnhatList440;
    List<Coffee> coffeeList440;
    ImageView imvtb440;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View r = inflater.inflate(R.layout.fragment_tintuc, container, false);

        rcvtieude440=r.findViewById(R.id.rcv_tieude_440);
        rcvuudai440=r.findViewById(R.id.rcv_uudai_440);
        rcvcapnhat440=r.findViewById(R.id.rcv_capnhat_440);
        rcvcoffee440=r.findViewById(R.id.rcv_coffee_440);

        imvtb440=r.findViewById(R.id.imv_tb_440);
        imvtb440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTb();
            }
        });

        //Tieu de
        tieudeList440=new ArrayList<>();

        tieudeList440.add(new Tieude(R.drawable.tichdiem,"Tích điểm"));
        tieudeList440.add(new Tieude(R.drawable.dathang,"Đặt hàng"));
        tieudeList440.add(new Tieude(R.drawable.coupu,"Coupon"));
        tieudeList440.add(new Tieude(R.drawable.rewards,"Rewards"));


        GridLayoutManager manager1 = new GridLayoutManager(TintucFragment.this.getActivity(),1);
        manager1.setOrientation(GridLayoutManager.HORIZONTAL);
        rcvtieude440.setLayoutManager(manager1);

        TieudeAdapter adapter1 = new TieudeAdapter(tieudeList440, TintucFragment.this.getActivity());
        rcvtieude440.setAdapter(adapter1);

        //Uu dai
        uudaiList440 =new ArrayList<>();

        uudaiList440.add(new Uudai("Giáng sinh Nhà giao, nơi nào cũng tới","Mở app và nhân mã MERRY 40,Nhà mời Ưu đãi 40%",R.drawable.uu1));
        uudaiList440.add(new Uudai("Mua 3 Tặng 1 - Mời nhóm mình chung vui","Chỉ cần nhập mã CUNGVUI qua app. Nhà mới ngay ưu đãi",R.drawable.uu2));
        uudaiList440.add(new Uudai("Nhà mới 20% PICKUP nha", "Trải ngiệm ngay tính năng PICKUP của Nhà với ưu đãi Giảm 20% cho đơn hàng ...",R.drawable.uu3));
        uudaiList440.add(new Uudai("Bánh ngon Nhà mời , chỉ 19.000đ","Cuối năm bận rộn thi cử, chạy số, chiến deadline nhưng không được bỏ bữa",R.drawable.uu4));

        GridLayoutManager manager2 = new GridLayoutManager(TintucFragment.this.getActivity(),1);
        manager2.setOrientation(GridLayoutManager.HORIZONTAL);
        rcvuudai440.setLayoutManager(manager2);

        UudaiAdapter adapter2 = new UudaiAdapter(uudaiList440, TintucFragment.this.getActivity());
        rcvuudai440.setAdapter(adapter2);

        //Capnhat
        capnhatList440 =new ArrayList<>();

        capnhatList440.add(new Capnhat("Nhà Reverside Vũ Tông Phan - Hà Nội vui khai trương","Người ta dậy thì thành công, còn chúng mình dậy thì nhớ mang chiếc áo",R.drawable.capnhat1));
        capnhatList440.add(new Capnhat("Trời se lạnh, thưởng thức ngay những món nóng của...","Chớm đầu Đông, những cơn mưa bất chợt làm trời se lạnh là thời điểm tuyệt vời",R.drawable.capnhat2));
        capnhatList440.add(new Capnhat("Khám phá không gian nhà mói: Hiện đại, Sang trọng,..", "Mô hình thiết kế mới tại Nhà mang đến không gian xinh đẹp vừa quen vừa lạ,",R.drawable.capnhat3));
        capnhatList440.add(new Capnhat("Taste of Xmas-Chạm vị Giáng sinh","Năm nay tại Nhà,'vị' Giáng sinh mà bạn yêu thích, mong chờ từ trước đến nay vẫn sẽ ...",R.drawable.capnhat4));

        GridLayoutManager manager3 = new GridLayoutManager(TintucFragment.this.getActivity(),1);
        manager3.setOrientation(GridLayoutManager.HORIZONTAL);
        rcvcapnhat440.setLayoutManager(manager3);

        CapnhatAdapter adapter3 = new CapnhatAdapter(capnhatList440, TintucFragment.this.getActivity());
        rcvcapnhat440.setAdapter(adapter3);

        //Coffee
        coffeeList440 =new ArrayList<>();

        coffeeList440.add(new Coffee("Bản sắc nơi đất trồng, một hành trình tìm về nguyên...","Cùng nhà bắt đầu hành trình đầu tiên cùng Travel blogger Nhị Đặng lên đường",R.drawable.coffe1));
        coffeeList440.add(new Coffee("Hương vị Cà phê mới tại nhà Signature.","Nhà Signature-nơi những hương vị nguyên bản tạo nên trải nghiệm khác biệt",R.drawable.coffe2));
        coffeeList440.add(new Coffee("Cảm ơn bạn, vì đã luôn là 1 bản nguyên khác biệt...", "Tạo khác biệt từ chất nguyên bản Thước phim 'Khác biệt' dưới đây là món quà",R.drawable.coffe3));
        coffeeList440.add(new Coffee("Nhà gửi bạn, vụ mùa của những bản sắc","Nhà gửi bạn vụ mùa của những bản sắc tháng 6 này, The Coffee House ...",R.drawable.coffe4));

        GridLayoutManager manager4 = new GridLayoutManager(TintucFragment.this.getActivity(),1);
        manager4.setOrientation(GridLayoutManager.HORIZONTAL);
        rcvcoffee440.setLayoutManager(manager4);

        CoffeeAdapter adapter4 = new CoffeeAdapter(coffeeList440, TintucFragment.this.getActivity());
        rcvcoffee440.setAdapter(adapter4);

        return r;
    }

    public void openTb(){
        Intent intent=new Intent(TintucFragment.this.getActivity(), Thongbao.class);
        startActivity(intent);
    }
}
