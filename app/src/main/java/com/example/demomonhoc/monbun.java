package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class monbun extends AppCompatActivity {
    ImageButton image1,image2, image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monbun);
        ImageButton image1 = (ImageButton)findViewById(R.id.image1);
        ImageButton image2 = (ImageButton)findViewById(R.id.image2);
        ImageButton image3 = (ImageButton)findViewById(R.id.image3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn bún cua Gia Lai",Toast.LENGTH_LONG).show();
                openbuncua();
            }
           private void openbuncua() {
               Intent intent = new Intent(monbun.this, buncua.class);
               startActivity(intent);
           }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn bún bò huế",Toast.LENGTH_LONG).show();
                openbunbohue();
            }
            private void openbunbohue() {
                Intent intent = new Intent(monbun.this, bunbohue.class);
                startActivity(intent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn bún Thái",Toast.LENGTH_LONG).show();
                openbunthai();
            }
            private void openbunthai() {
                Intent intent = new Intent(monbun.this, bunthai.class);
                startActivity(intent);
            }
        });
    }
}