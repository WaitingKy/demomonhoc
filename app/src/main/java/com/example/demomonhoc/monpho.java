package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class monpho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monpho);

        ImageButton image1 = (ImageButton)findViewById(R.id.image1);
        ImageButton image2 = (ImageButton)findViewById(R.id.image2);
        ImageButton image3 = (ImageButton)findViewById(R.id.image3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn phở khô Gia Lai",Toast.LENGTH_LONG).show();
                openbuncua();
            }
            private void openbuncua() {
                Intent intent = new Intent(monpho.this, phokhoGiaLai.class);
                startActivity(intent);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn phở Nam Định",Toast.LENGTH_LONG).show();
                openbunbohue();
            }
            private void openbunbohue() {
                Intent intent = new Intent(monpho.this, phonamdinh.class);
                startActivity(intent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn phở Hà Nội",Toast.LENGTH_LONG).show();
                openbunthai();
            }
            private void openbunthai() {
                Intent intent = new Intent(monpho.this, phohanoi.class);
                startActivity(intent);
            }
        });
    }
}