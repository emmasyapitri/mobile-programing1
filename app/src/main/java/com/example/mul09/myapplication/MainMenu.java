package com.example.mul09.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenu extends MainActivity {
    // deklarasi tombol
    private Button mBtn_call, mBtn_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //inisial tombol
        mBtn_call = (Button)findViewById(R.id.btn_call);
        mBtn_menu=(Button)findViewById(R.id.btn_menu);

        // function tombol
        mBtn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),MainCall.class);
                startActivity(iLogin);
            }
        });

        mBtn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iRegister = new Intent(getApplicationContext(),MainMenu.class);
                startActivity(iRegister);
            }
        });
    }
}