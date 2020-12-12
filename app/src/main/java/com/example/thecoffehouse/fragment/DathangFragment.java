package com.example.thecoffehouse.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.thecoffehouse.R;
import com.example.thecoffehouse.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class DathangFragment extends Fragment {

    private ViewPager mView440;
    private TabLayout mTabLayout440;

    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View r = inflater.inflate(R.layout.fragment_dathang, container, false);

        mTabLayout440=r.findViewById(R.id.tab_layout_440);
        mView440=r.findViewById(R.id.view_page_440);

        ViewPageAdapter viewPageAdapter=new ViewPageAdapter(getParentFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mView440.setAdapter(viewPageAdapter);

        mTabLayout440.setupWithViewPager(mView440);


        return r;

    }
    private void Dialog(){
        Dialog dialog=new Dialog(this.getContext());
        dialog.setContentView(R.layout.dialog_item);
        dialog.show();
    }

}
