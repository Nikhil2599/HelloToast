package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);


    }




    public void showToast(View view) {

        String msg = "hello";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,msg,duration);
        String count = mShowCount.getText().toString();

        Intent hIntent = new Intent(this, HomeActivity.class);
        hIntent.putExtra("nkey",msg);
        hIntent.putExtra("ckey",count);
        startActivity(hIntent);
    }

    public void countup(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}