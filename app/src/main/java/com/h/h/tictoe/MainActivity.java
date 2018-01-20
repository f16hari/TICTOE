package com.h.h.tictoe;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView i1;
    private ImageView i2;
    private ImageView i3;
    private ImageView i4;
    private ImageView i5;
    private ImageView i6;
    private ImageView i7;
    private ImageView i8;
    private ImageView i9;
    private int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int a[]=new int[9];
        for(int i=0;i<9;i++)
            a[i]=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView) findViewById(R.id.button1);
        i2=(ImageView) findViewById(R.id.button2);
        i3=(ImageView) findViewById(R.id.button3);
        i4=(ImageView) findViewById(R.id.button4);
        i5=(ImageView) findViewById(R.id.button5);
        i6=(ImageView) findViewById(R.id.button6);
        i7=(ImageView) findViewById(R.id.button7);
        i8=(ImageView) findViewById(R.id.button8);
        i9=(ImageView) findViewById(R.id.button9);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {
                    i1.setImageResource(R.drawable.tic_tac_toe_x);
                    flag=1;
                }
                else
                {
                    i1.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i2.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i2.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i3.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i3.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i4.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i4.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i5.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i5.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }

            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i6.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i6.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i7.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i7.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i8.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i8.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag==0) {
                    i9.setImageResource(R.drawable.tic_tac_toe_x);
                    flag = 1;
                }
                else
                {
                    i9.setImageResource(R.drawable.tic_tac_toe_o);
                    flag=0;
                }


            }
        });


    }
}
