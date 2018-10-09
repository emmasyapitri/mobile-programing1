package com.example.mul09.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCall extends MainActivity {
    private Button mBtn_call, mBtn_menu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        mBtn_call = (Button) findViewById(R.id.btn_call);
        mBtn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCall.this, MainActivity.class);
                MainCall.this.startActivity(intent);
                MainCall.this.finish();
            }
        });
    }
}