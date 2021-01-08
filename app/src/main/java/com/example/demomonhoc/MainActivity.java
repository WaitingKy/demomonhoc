package com.example.demomonhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btndangnhap;
EditText edtPassWorld, edtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndangnhap = (Button)findViewById(R.id.btndangnhap);
        edtUser =(EditText)findViewById(R.id.User);
        edtPassWorld = (EditText)findViewById(R.id.PassWorld);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User = "admin";
                String PassWorld = "admin";
                if(edtUser.getText().toString().equals(User) && edtPassWorld.getText().toString().equals(PassWorld)){
                    Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    openActivity_m_e_n_u();
                }else{
                    Toast.makeText(getApplicationContext(),"đăng nhập không thành công",Toast.LENGTH_LONG).show();
                }
            }

            private void openActivity_m_e_n_u() {
                Intent intent = new Intent(MainActivity.this, MENU.class);
                startActivity(intent);
            }
        });
    }
}