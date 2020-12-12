package com.example.thecoffehouse.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thecoffehouse.MainActivity;
import com.example.thecoffehouse.R;

public class Signup extends AppCompatActivity {

    EditText sdt440;
    DBHelper DB440;
    Button btnlogin440;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        sdt440=(EditText) findViewById(R.id.edt_sdt_440);
        btnlogin440=(Button) findViewById(R.id.btn_lg_440);
        DB440=new DBHelper(this);


        btnlogin440.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = sdt440.getText().toString();

                if (user.equals(""))
                    Toast.makeText(Signup.this, "Vui lòng nhập thông tin đầy đủ", Toast.LENGTH_SHORT).show();
                else {
                    if (user.equals(user)) {
                        Boolean checkuser = DB440.checkusername(user);
                        if (checkuser == false) {
                            Boolean insert = DB440.insertData(user);
                            if (insert == true) {
                                Toast.makeText(Signup.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        }
                    }
                }
            }
        });
    }
}
