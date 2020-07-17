package com.example.tclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtemail, edtusername, edtpassword;
    private Button btnsignup, btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtemail=findViewById(R.id.edtemail);
        edtusername=findViewById(R.id.edtusername);
        edtpassword=findViewById(R.id.edtpassword);

        btnsignup=findViewById(R.id.btnsignup);
        btnlogin=findViewById(R.id.btnlogin);
    }
}