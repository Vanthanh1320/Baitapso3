package com.example.thecoffehouse.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.thecoffehouse.InfoMain;
import com.example.thecoffehouse.R;
import com.example.thecoffehouse.login.Signup;

public class TaikhoanFragment extends Fragment {

    TextView tvtaikhoan440,tvdangxuat440;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View r = inflater.inflate(R.layout.fragment_taikhoan, container, false);

        tvdangxuat440=(TextView) r.findViewById(R.id.tv_dangxuat_440);
        tvdangxuat440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangxuat();
            }
        });

        tvtaikhoan440=(TextView) r.findViewById(R.id.tv_tttaikhoan_440);
        tvtaikhoan440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTK();
            }
        });

        return r;

    }
    public void openTK(){
        Intent intent=new Intent(TaikhoanFragment.this.getActivity(), InfoMain.class);
        startActivity(intent);
    }
    public void dangxuat(){
        Intent intent=new Intent(TaikhoanFragment.this.getActivity(), Signup.class);
        startActivity(intent);
    }
}
