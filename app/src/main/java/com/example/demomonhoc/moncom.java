package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class moncom extends AppCompatActivity {
    ImageButton image1,image2, image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moncom);
        ImageButton image1 = (ImageButton)findViewById(R.id.image1);
        ImageButton image2 = (ImageButton)findViewById(R.id.image2);
        ImageButton image3 = (ImageButton)findViewById(R.id.image3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn cơm sườn",Toast.LENGTH_LONG).show();
                openActivity_comsuon();
            }

            private void openActivity_comsuon() {
                Intent intent = new Intent(moncom.this, comsuon.class);
                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn cơm tấm",Toast.LENGTH_LONG).show();
                openActivity_comsuon();
            }

            private void openActivity_comsuon() {
                Intent intent = new Intent(moncom.this, comtam.class);
                startActivity(intent);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bạn đã chọn cơm gia đình",Toast.LENGTH_LONG).show();
                openActivity_comsuon();
            }

            private void openActivity_comsuon() {
                Intent intent = new Intent(moncom.this, comgiadinh.class);
                startActivity(intent);
            }
        });
    }
}