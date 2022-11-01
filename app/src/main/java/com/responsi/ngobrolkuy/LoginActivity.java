package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText etuser, etpass;
    private TextView tvlupa, tvbtnbelum;
    private CardView cvbtnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etuser=findViewById(R.id.username);
        etpass=findViewById(R.id.password);
        tvlupa=findViewById(R.id.lupapass);
        tvbtnbelum=findViewById(R.id.buttonbelum);
        cvbtnlogin=findViewById(R.id.buttonlogin);

        cvbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etusername= etuser.getText().toString();
                String etpassword= etpass.getText().toString();

                Intent pindah = new Intent(LoginActivity.this, SplashActivity.class);

                pindah.putExtra("uname",etusername);
                pindah.putExtra("pass",etpassword);

                startActivity(pindah);
            }
        });

        tvbtnbelum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindah);
            }
        });

        tvlupa.setOnClickListener(new View.OnClickListener() { //blm ad view lupa pass
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LoginActivity.this, LupaActivity.class);
                startActivity(pindah);
            }
        });

    }
}