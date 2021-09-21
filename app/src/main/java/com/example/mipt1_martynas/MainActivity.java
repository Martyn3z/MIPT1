package com.example.mipt1_martynas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.TextForButton);
    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("What have you done..");
    }
}