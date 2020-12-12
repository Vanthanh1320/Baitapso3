package com.example.thecoffehouse;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.thecoffehouse.fragment.DoanFragment;
import com.example.thecoffehouse.fragment.PhobienFragment;
import com.example.thecoffehouse.fragment.ThucuongFragment;

public class ViewPageAdapter extends FragmentStatePagerAdapter {

    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm,behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PhobienFragment();
            case 1:
                return new ThucuongFragment();
            case 2:
                return new DoanFragment();
            default:
                return new PhobienFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:
                title="Phổ biến";
                break;
            case 1:
                title="Thức uống";
                break;
            case 2:
                title="Đồ ăn";
                break;
        }
        return title;
    }
}
