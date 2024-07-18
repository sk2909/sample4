package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1=(EditText) findViewById(R.id.email);
        EditText e2=(EditText) findViewById(R.id.password);
        Button b1=(Button) findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "admin@example.com";
                String password = "admin123";
                String str=e1.getText().toString();
                String sub =e2.getText().toString();
                String successMsg = "Login Sucessfull";
                String failureMsg = "Invalid Credentials";
                if(str.equals(username) && sub.equals(password)){
                    Toast.makeText(getApplicationContext(),successMsg, Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),failureMsg, Toast.LENGTH_LONG).show();
                }
            }
        });
    }}
