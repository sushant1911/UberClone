package com.example.alquilarcoche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Button btreg =(Button)findViewById(R.id.btnRegistration);
         btreg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent  intent = new Intent(LoginPage.this,RegistrationActivity.class);
                 startActivity(intent);
             }
         });
    }
}
