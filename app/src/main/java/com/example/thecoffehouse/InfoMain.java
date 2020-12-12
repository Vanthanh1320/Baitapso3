package com.example.thecoffehouse;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.thecoffehouse.fragment.TaikhoanFragment;

public class InfoMain extends AppCompatActivity {

    ImageButton imgback440;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        imgback440=(ImageButton) findViewById(R.id.im_back_440);
        imgback440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });


    }

    public void back(){
        Intent intent=new Intent(InfoMain.this, MainActivity.class);
        startActivity(intent);
    }
}