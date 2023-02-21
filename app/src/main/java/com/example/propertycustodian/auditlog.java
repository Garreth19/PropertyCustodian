package com.example.propertycustodian;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class auditlog extends AppCompatActivity {


    EditText edUsername, edpassword;
    Button btn;
    TextView tv;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auditlog);

        edUsername = findViewById(R.id.editTextloginUsername);
        edpassword = findViewById(R.id.editTextloginPassword);
        btn = findViewById(R.id.auditlogin);
        tv = findViewById(R.id.backaudit);
        tv1= findViewById(R.id.auditlogin);

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
                startActivity(new Intent(auditlog.this,MainActivity.class));
            }
        });

    }
}