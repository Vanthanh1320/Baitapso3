package com.example.thecoffehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.thecoffehouse.fragment.CuahangFragment;
import com.example.thecoffehouse.fragment.DathangFragment;
import com.example.thecoffehouse.fragment.TaikhoanFragment;
import com.example.thecoffehouse.fragment.TintucFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        BottomNavigationView navView = findViewById(R.id.nav_view_440);
        navView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_440,new TintucFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.navigation_tintuc:
                            selectedFragment = new TintucFragment();
                            break;
                        case R.id.navigation_dathang:
                            selectedFragment = new DathangFragment();
                            break;
                        case R.id.navigation_cuahang:
                            selectedFragment=new CuahangFragment();
                            break;
                        case R.id.navigation_taikhoan:
                            selectedFragment=new TaikhoanFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_440, selectedFragment).commit();
                    return true;
                }
            };
}