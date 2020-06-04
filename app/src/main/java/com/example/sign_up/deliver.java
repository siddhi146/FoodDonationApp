package com.example.sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
public class deliver extends AppCompatActivity {
    Spinner spn; TextView tv11, tv12; Button nxt;
    ImageView im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliver);
        spn=(Spinner)findViewById(R.id.spin);
        nxt=(Button)findViewById(R.id.next);
        im=(ImageView)findViewById(R.id.imgv1);
        tv11=(TextView)findViewById(R.id.textv11);
        tv12=(TextView)findViewById(R.id.textv12);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nxt.setVisibility(View.INVISIBLE);
                String str= String.valueOf(spn.getSelectedItem());
                if (str.equals("Select Your Area")){
                    tv11.setText("");
                    tv12.setText("");

                }
                if (str.equals("Wadala")){
                    tv11.setText("Your food will be picked up in 50 mins!");
                    tv12.setText("Mr. Arjun is on the way to pick up the food");
                    im.setVisibility(View.VISIBLE);
                    nxt.setVisibility(View.VISIBLE);
                }
                if (str.equals("Khar")){
                    tv11.setText("Your food will be picked up in 10 mins!");
                    tv12.setText("Mr. Jay is on the way to pick up the food");
                    im.setVisibility(View.VISIBLE);
                    nxt.setVisibility(View.VISIBLE);
                }
                if (str.equals("Bandra")){
                    tv11.setText("Your food will be picked up in 15 mins!");
                    tv12.setText("Mr. Anurag is on the way to pick up the food");
                    im.setVisibility(View.VISIBLE);
                    nxt.setVisibility(View.VISIBLE);
                }
                if (str.equals("Vile Parle")){
                    tv11.setText("Your food will be picked up in 20 mins!");
                    tv12.setText("Mr. Gaurav is on the way to pick up the food");
                    im.setVisibility(View.VISIBLE);
                    nxt.setVisibility(View.VISIBLE);
                }
                if (str.equals("Andheri")){
                    tv11.setText("Your food will be picked up in 30 mins!");
                    tv12.setText("Mr. Nimesh is on the way to pick up the food");
                    im.setVisibility(View.VISIBLE);
                    nxt.setVisibility(View.VISIBLE);
                }
                if (str.equals("Santacruz")){
                    tv11.setText("Your food will be picked up in 45 mins");
                    tv12.setText("Mr. Neeraj is on the way to pick up the food");
                    im.setVisibility(View.VISIBLE);
                    nxt.setVisibility(View.VISIBLE);
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });


        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(deliver.this, Thankyou.class));
            }

        });
    }
}
