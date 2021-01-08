package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class buncua extends AppCompatActivity {
Button batdau ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buncua);
        Button batdau=(Button)findViewById(R.id.batdau);

        batdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cùng nhau thực hiện bún cua Gia Lai nha",Toast.LENGTH_LONG).show();
                openlambuncua();
            }

            private void openlambuncua() {
                Intent intent = new Intent(buncua.this, lambuncua.class);
                startActivity(intent);
            }
        });
    }
}