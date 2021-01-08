package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MENU extends AppCompatActivity {
ImageButton image1,image2, image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_e_n_u);
        ImageButton image1 = (ImageButton)findViewById(R.id.image1);
        ImageButton image2 = (ImageButton)findViewById(R.id.image2);
        ImageButton image3 = (ImageButton)findViewById(R.id.image3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Những món bún ngon",Toast.LENGTH_LONG).show();
                openmonbun();
            }
            private void openmonbun() {
                Intent intent = new Intent(MENU.this, monbun.class);
                startActivity(intent);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Những món cơm ngon",Toast.LENGTH_LONG).show();
                openmoncom();
            }

            private void openmoncom() {
                Intent intent = new Intent(MENU.this, moncom.class);
                startActivity(intent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Những món phở ngon",Toast.LENGTH_LONG).show();
            }
        });
    }
}