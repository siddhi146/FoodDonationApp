package com.example.sign_up;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity{
    EditText email, pass;
    Button bt2;
    TextView txt2,fgtpwd;
    FirebaseAuth mfire;

    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onStart() {
        super.onStart();
        mfire.addAuthStateListener(mAuthStateListener);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        mfire = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pwd);
        bt2=findViewById(R.id.signin);
        txt2=findViewById(R.id.next_up);
        fgtpwd=findViewById(R.id.forgot);

        SharedPreferences preferences=getSharedPreferences("checkbox",MODE_PRIVATE);
        String checkbox=preferences.getString("remember","");
        if (checkbox.equals(true)){
            Intent i=new Intent(Login.this,Home.class);
            startActivity(i);

        }else if (checkbox.equals(false)){
            Toast.makeText(this, "Please Sign In", Toast.LENGTH_SHORT).show();
        }


        mAuthStateListener=new FirebaseAuth.AuthStateListener() {            
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFireuser=mfire.getCurrentUser();

            }
        };


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String mail = email.getText().toString();
                final String pw = pass.getText().toString();
                if (pw.isEmpty() && mail.isEmpty()) {
                    Toast.makeText(Login.this, "Please enter details!", Toast.LENGTH_SHORT).show();
                } else if (mail.isEmpty()) {
                    email.setError("Please enter Email!");
                    email.requestFocus();
                } else if (pw.isEmpty()) {
                    pass.setError("Please enter Password");
                    pass.requestFocus();
                } else if (!(pw.isEmpty() && mail.isEmpty())) {
                    mfire.signInWithEmailAndPassword(mail,pw).addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(Login.this, "Login Error, Please Try Again", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Intent toHome=new Intent(Login.this,Home.class);
                                startActivity(toHome);
                                                           }
                        }
                    });
                }

                else {
                    Toast.makeText(Login.this, "Error Occurred!", Toast.LENGTH_SHORT).show();
                }
            }

        });

        fgtpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty()){
                    Toast.makeText(Login.this, "Enter email address", Toast.LENGTH_SHORT).show();
                }else{
                mfire.sendPasswordResetEmail(email.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Login.this, "Password sent to your Email", Toast.LENGTH_SHORT).show();
                        }else if (!task.isSuccessful()){
                            Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }}
        });



        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
