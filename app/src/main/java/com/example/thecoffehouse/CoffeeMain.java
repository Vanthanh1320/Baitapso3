package com.example.thecoffehouse;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.example.thecoffehouse.login.Signup;

public class CoffeeMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        CountDownTimer countDownTimer=new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();

        Thread bamgio=new Thread(){
            public void run()
            {
                try {
                    sleep(8000);
                } catch (Exception e) {

                }
                finally
                {
                    Intent activitymoi=new Intent(CoffeeMain.this, Signup.class);
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }

    protected void onPause(){
        super.onPause();
        finish();
    }
}