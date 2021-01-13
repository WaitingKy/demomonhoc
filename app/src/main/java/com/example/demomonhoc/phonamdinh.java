package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class phonamdinh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonamdinh);
        Button bamgio = (Button)findViewById(R.id.batdau);

        bamgio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bắt đầu thôi",Toast.LENGTH_LONG).show();
                openActivity_bamgio();
            }

            private void openActivity_bamgio() {
                Intent intent = new Intent(phonamdinh.this, lamphonamdinh.class);
                startActivity(intent);
            }
        });
    }
}