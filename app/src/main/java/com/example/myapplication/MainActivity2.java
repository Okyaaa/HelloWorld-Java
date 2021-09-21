package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private  static final String TAG = "MainActivity";

    Button switchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        switchButton = (Button) findViewById(R.id.switchButton2);
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onStart2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy2");
    }

}