package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class OpenchatActivity extends AppCompatActivity {
    private ImageView ivbtnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openchat);

        ivbtnsend=findViewById(R.id.buttonsend);
    }
}