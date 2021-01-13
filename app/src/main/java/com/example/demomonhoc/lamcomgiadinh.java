package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class lamcomgiadinh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamcomgiadinh);

        Button bamgio = (Button)findViewById(R.id.bamgio);

        bamgio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"cùng làm bún Thái",Toast.LENGTH_LONG).show();
                openActivity_bamgio();
            }

            private void openActivity_bamgio() {
                Intent intent = new Intent(lamcomgiadinh.this, bamgio.class);
                startActivity(intent);
            }
        });
    }
}