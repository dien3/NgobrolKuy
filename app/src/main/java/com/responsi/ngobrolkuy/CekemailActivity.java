package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CekemailActivity extends AppCompatActivity {
    private CardView cvbtnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cekemail);

        cvbtnkembali=findViewById(R.id.buttonsubmitpass);

        cvbtnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(CekemailActivity.this, LoginActivity.class);
            }
        });
    }
}