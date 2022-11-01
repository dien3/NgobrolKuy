package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LupaActivity extends AppCompatActivity {
    private CardView cvbtnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);

        cvbtnsubmit=findViewById(R.id.buttonsubmitpass);

        cvbtnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LupaActivity.this, CekemailActivity.class);
            }
        });
    }
}