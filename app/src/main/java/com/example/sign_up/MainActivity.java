package com.example.sign_up;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText email, pass,fn,ln,ph;
Button bt1;
EditText addrs;
TextView txt1;
FirebaseAuth mfire;
DatabaseReference reff;
Details details;

FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfire = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pwd);
        bt1 = findViewById(R.id.signup);
        txt1 = findViewById(R.id.next_in);
        fn = findViewById(R.id.name);
        addrs=findViewById(R.id.add);
        ln = findViewById(R.id.sname);
        ph=findViewById(R.id.phone);
        details=new Details();
        reff= FirebaseDatabase.getInstance().getReference().child("Details");
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString();
                String name=fn.getText().toString();
                String lname=ln.getText().toString();
                String pw = pass.getText().toString();
                String phn=ph.getText().toString();
                String st=addrs.getText().toString();
                 if (pw.isEmpty() && mail.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the details!", Toast.LENGTH_SHORT).show();
                } else if (mail.isEmpty()) {
                    email.setError("Please enter Email!");
                    email.requestFocus();
                } else if (pw.isEmpty()) {
                    pass.setError("Please enter Password");
                    pass.requestFocus();
                }else if (pass.getText().length()<6){
                     Toast.makeText(MainActivity.this, "Password must be at least six characters long", Toast.LENGTH_SHORT).show();
                 }
                 else if (st.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter Address!", Toast.LENGTH_SHORT).show();
                }
                else if(name.isEmpty()){
                    fn.setError("Please enter First Name");
                }
                else if (phn.isEmpty()){
                    ph.setError("Enter Phone Number");
                }
                else if (lname.isEmpty()){
                    ln.setError("Please enter Last Name");
                }
                else if (!(pw.isEmpty() && mail.isEmpty())) {
                    mfire.createUserWithEmailAndPassword(mail, pw).addOnCompleteListener(MainActivity.this, new OnCompleteListener<com.google.firebase.auth.AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<com.google.firebase.auth.AuthResult> task) {
                            if (!task.isSuccessful()) {
                                if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                    Toast.makeText(MainActivity.this, "User with this email already exist.", Toast.LENGTH_SHORT).show();
                                }
                                else{
                                Toast.makeText(MainActivity.this, "Enter valid details!", Toast.LENGTH_SHORT).show();}
                            } else {
                                Toast.makeText(MainActivity.this, "Registration successful, Login to continue.", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(MainActivity.this, Login.class));
                            }
                        }
                    });
                }else {
                    Toast.makeText(MainActivity.this, "Unknown Error", Toast.LENGTH_SHORT).show();
                }


                details.setFirstname(name.trim());
                details.setLastname(lname.trim());
                details.setPhn(Long.parseLong(phn.trim()));
                details.setEmail(mail.trim());
                details.setAddress(addrs.getText().toString().trim());

                reff.push().setValue(details);

            }
        });

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });



    }
}
