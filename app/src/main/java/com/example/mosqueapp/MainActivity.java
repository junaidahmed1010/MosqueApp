package com.example.mosqueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.MosqueApp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_btn = findViewById(R.id.next_btn);

        next_btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.next_btn:
                startActivity(new Intent(MainActivity.this,MainActivity.class));
                break;
        }
    }
}