package com.example.sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

public class Home extends AppCompatActivity {
    Button out,drop,deliver;
    FirebaseAuth mfire;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        out=findViewById(R.id.logout);
        drop=findViewById(R.id.dbs);
        deliver=findViewById(R.id.dlv);

        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent toLogin=new Intent(Home.this,Login.class);
                startActivity(toLogin);
            }
        });

        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,dropbyself.class);
                startActivity(intent);

            }
        });

        deliver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Home.this, deliver.class);
                startActivity(j);
            }
        });

    }
}
