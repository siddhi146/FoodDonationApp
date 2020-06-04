package com.example.sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class dropbyself extends AppCompatActivity {
    Spinner spn; TextView tv11, tv12,tv13; Button nxt;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropbyself);
    spn=(Spinner)findViewById(R.id.spin);
    nxt=(Button)findViewById(R.id.next);
    im=(ImageView)findViewById(R.id.imgv1);
    tv11=(TextView)findViewById(R.id.textv11);
    tv12=(TextView)findViewById(R.id.textv12);
    tv13=(TextView)findViewById(R.id.textv13);

    spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            nxt.setVisibility(View.INVISIBLE);

            String str=String.valueOf(spn.getSelectedItem());
            if (str.equals("Select Your Area")){
                tv11.setText("");
                tv12.setText("");

            }
            if (str.equals("Wadala")){
                tv11.setText("Annamrita\r\n19,Jaywant Industrial Estate\r\n63 Pandit Madanmohan,Malaviya Marg\r\nWadala-400031.");
                tv12.setText("Adarshmay Charitable Trust\r\nParijat,9,Khardeo Nagar,N.G.Acharya Marg\r\nWadala-400031.");
                tv13.setText("");
                tv11.setVisibility(view.VISIBLE);
                tv12.setVisibility(view.VISIBLE);
                tv13.setVisibility(view.INVISIBLE);
                im.setVisibility(View.INVISIBLE);
                nxt.setVisibility(View.VISIBLE);

                tv11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/PggeLTakfrUzeryK7"));
                        startActivity(i1);
                    }
                });
                tv12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/jDwHTMzUsEFQj9eV8"));
                        startActivity(i2);
                    }
                });


            }
            if (str.equals("Khar")){
                tv11.setText("Shelter Don Bosco\r\n16th Road, Opposite St Joseph High School\r\nKhar-400052.");
                tv12.setText("Midas Trust\r\nF-3 Vaibhav Co-Operative Society\r\nOpposite ImportWare House, Sahar Village\r\nKhar-400099.");
                tv13.setText("");
                tv11.setVisibility(view.VISIBLE);
                tv12.setVisibility(view.VISIBLE);
                tv13.setVisibility(view.INVISIBLE);
                im.setVisibility(View.INVISIBLE);
                nxt.setVisibility(View.VISIBLE);

                tv11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/NW6Qh7cnZsF52tnB6"));
                        startActivity(i1);
                    }
                });
                tv12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/3rYLbK78weLSbSr59"));
                        startActivity(i2);
                    }});
            }
            if (str.equals("Bandra")) {
                tv11.setText("Help Me Serve\r\nWockhardt Towers,Bandra(East)-400051.");
                tv12.setText("Rahat Welfare Trust\r\nUnit 8,Ground Floor, Liberty Shopping Centre,Hill Road,Bandra(West)-400050.");
                tv13.setText("CareChild and Old Age\r\nNew Chapra Bldg,Above Vichare Courier\r\nNear Hindi School,Opp Bandra Talao, Bandra(W)-400050");

                tv11.setVisibility(view.VISIBLE);
                tv12.setVisibility(view.VISIBLE);
                tv13.setVisibility(view.VISIBLE);
                im.setVisibility(View.INVISIBLE);
                nxt.setVisibility(View.VISIBLE);

                tv11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ZVRNCJuMy7bMP4e5A"));
                        startActivity(i1);
                    }
                });
                tv12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/hNNTBhsQdRZZD5yQ7"));
                        startActivity(i2);

                        tv13.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/LtuDPQYWFvhF3uDN7"));
                                startActivity(i3);
                            }
                        });

                    }
                });
            }
            if (str.equals("Vile Parle")){
                tv11.setText("Rehbar Foundation\r\nVinoba Bhave Nagar,Road 5\r\nVile Parle-400070.");
                tv12.setText("Shri Satya Maharaj Foundation\r\n21st Road,Opp Gymkhaana\r\nVile Parle-400052\n");
                tv13.setText("");
                tv11.setVisibility(view.VISIBLE);
                tv12.setVisibility(view.VISIBLE);
                tv13.setVisibility(view.INVISIBLE);
                im.setVisibility(View.INVISIBLE);
                nxt.setVisibility(View.VISIBLE);

                tv11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/FjuUaCLyRNLsrWus6"));
                        startActivity(i1);
                    }});

                tv12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/dgX1bXaHHzokKhHc6"));
                        startActivity(i2);
                    }});

            }


            if (str.equals("Andheri")){
                tv11.setText("Vatsalya Trust\r\nNext to Kanjur Police Station\r\nAndheri");
                tv12.setText("Swasth Foundation\r\nRoyal Palms,Air India Colony\r\nAndheri");
                tv13.setText("");

                tv11.setVisibility(view.VISIBLE);
                tv12.setVisibility(view.VISIBLE);
                tv13.setVisibility(view.INVISIBLE);
                im.setVisibility(View.INVISIBLE);
                nxt.setVisibility(View.VISIBLE);

                tv11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/SyiT6KWc5ky2EVoK7"));
                        startActivity(i2);
                    }});
                tv12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/n45pj2TbmaiX4k3BA"));
                        startActivity(i2);
                    }});
            }


            if (str.equals("Santacruz")){
                tv11.setVisibility(view.VISIBLE);
                tv12.setVisibility(view.VISIBLE);
                tv13.setVisibility(view.VISIBLE);
                im.setVisibility(View.INVISIBLE);
                nxt.setVisibility(View.VISIBLE);

                tv11.setText("Muktangan\r\nParagon Charitable Trust, Paragon Centre, Pandurang Budhkar Marg\r\nSanta Cruz");
                tv12.setText("Prem Daan\r\nSector 18,Opp Citi Plaza,Santa Cruz");
                tv13.setText("The Akshaya Patra Foundation\r\nDheeraj Heritage,203\r\nSV Road,Santacruz(W),Mumbai-64");

                tv11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/BcqK9FC1HyZ6ovgM7"));
                        startActivity(i2);
                    }});
                tv12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/6CuSDEnXgARfnx4X9"));
                        startActivity(i2);
                    }});
                tv13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/TAPRM3WWNBBRPGoCA"));
                        startActivity(i2);
                    }});
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

    nxt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(dropbyself.this,Thankyou.class);
            startActivity(i);
        }
    });
    }}