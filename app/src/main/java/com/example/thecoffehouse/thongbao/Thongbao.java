package com.example.thecoffehouse.thongbao;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.thecoffehouse.MainActivity;
import com.example.thecoffehouse.R;

public class Thongbao extends AppCompatActivity {

    ImageView tmvclose440,tmvdialog440;
    Button btnback440;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        tmvclose440=(ImageView) findViewById(R.id.img_close_440);
        tmvdialog440=(ImageView) findViewById(R.id.img_dialog_440);
        btnback440=(Button) findViewById(R.id.btn_back_440);

        tmvclose440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        btnback440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        tmvdialog440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
            }
        });
    }

    public void back(){
        Intent intent=new Intent(Thongbao.this, MainActivity.class);
        startActivity(intent);
    }

    public void Dialog(){
       DialogTb dialogTb=new DialogTb();
        dialogTb.show(getSupportFragmentManager(), "example dialog");
    }
}