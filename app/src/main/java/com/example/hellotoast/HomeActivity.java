package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvhome;
    private TextView tvcount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String name = getIntent().getExtras().getString("nkey");
        tvhome=findViewById(R.id.tvhome);
        tvhome.setText(name);
        String count = getIntent().getExtras().getString("ckey");
        tvcount=findViewById(R.id.tvcount);
        tvcount.setText(count);
    }
}