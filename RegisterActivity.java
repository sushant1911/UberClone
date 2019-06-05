package com.example.user.uberclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
private EditText Dname ,Demail,Dpassword;
private Button reg;
    DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
     Demail=(EditText)findViewById(R.id.emailedittxt);
        Dpassword=(EditText)findViewById(R.id.password);
        reg=(Button)findViewById(R.id.Search);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Demail.getText().toString();
                String password = Dpassword.getText().toString();
                databaseReference= FirebaseDatabase.getInstance().getReference("Driver");
                Driver dv=new Driver(email,password);
                databaseReference.setValue(dv);
                Intent intent=new Intent(RegisterActivity.this,Homepage.class);
                startActivity(intent);
                finish();
                return;

            }
        });

    }
}
