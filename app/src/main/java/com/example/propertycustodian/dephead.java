package com.example.propertycustodian;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class dephead extends AppCompatActivity {


    EditText edUsername, edpassword;
    Button btn;
    TextView tv;
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dephead);
        edUsername = findViewById(R.id.deploginUsername);
        edpassword = findViewById(R.id.deploginPassword);
        btn = findViewById(R.id.deplog);
        tv = findViewById(R.id.backhead);
        tv1= findViewById(R.id.deplog);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username =edUsername.getText().toString();
                String password =edpassword.getText().toString();
                if(username.length()==0 || password.length()==0){
                    Toast.makeText(getApplicationContext(),"Please fill all details",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Log in Success",Toast.LENGTH_SHORT).show();
                }

            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dephead.this,MainActivity.class));
            }
        });


    }
}