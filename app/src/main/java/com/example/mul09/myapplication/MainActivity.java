package com.example.mul09.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // deklarasi tombol
    private Button mBtn_call, mBtn_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        mBtn_call = (Button)findViewById(R.id.btn_call);
        mBtn_menu=(Button)findViewById(R.id.btn_menu);

        // function tombol
        mBtn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainCall.class);
                startActivity(i);
            }
        });

        mBtn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainMenu.class);
                startActivity(i);
            }
        });
    }
}