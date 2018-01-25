package com.h.h.tictoe;

import android.content.Intent;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

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
    private int a[]=new int[9];
    char[][] arr=new char[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                if(a[0]==0) {
                    a[0]=1;
                    if (flag == 0) {
                        i1.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[0][2]='X';
                        flag = 1;
                    } else {
                        i1.setImageResource(R.drawable.tic_tac_toe_o);
                        arr[0][2]='O';
                        flag = 0;
                    }
                }

            int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[1]==0) {
                    a[1]=1;
                    if (flag == 0) {
                        i2.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[0][0]='X';
                        flag = 1;
                    } else {
                        i2.setImageResource(R.drawable.tic_tac_toe_o);
                        arr[0][0]='O';
                        flag = 0;
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }


            }


        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[2]==0) {
                    a[2] = 1;
                    if (flag == 0) {
                        i3.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[2][2]='X';
                        flag = 1;
                    } else {
                        i3.setImageResource(R.drawable.tic_tac_toe_o);
                        arr[2][2]='O';
                        flag = 0;
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }



            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[3]==0) {
                    a[3] = 1;
                    if (flag == 0) {
                        i4.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[2][1]='X';
                        flag = 1;
                    } else {
                        i4.setImageResource(R.drawable.tic_tac_toe_o);
                        arr[2][1]='O';
                        flag = 0;
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }



            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[4]==0) {
                    a[4] = 1;
                    if (flag == 0) {
                        i5.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[2][0]='X';
                        flag = 1;
                    } else {
                        i5.setImageResource(R.drawable.tic_tac_toe_o);
                        arr[2][0]='O';
                        flag = 0;
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }

            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[5]==0) {
                    a[5] = 1;
                    if (flag == 0) {
                        i6.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[1][2]='X';
                        flag = 1;
                    } else {
                        i6.setImageResource(R.drawable.tic_tac_toe_o);
                        flag = 0;
                        arr[1][2]='O';
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }


            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[6]==0) {
                    a[6] = 1;
                    if (flag == 0) {
                        i7.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[1][1]='X';
                        flag = 1;
                    } else {
                        i7.setImageResource(R.drawable.tic_tac_toe_o);
                        flag = 0;
                        arr[1][1]='O';
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }



            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[7]==0) {
                    a[7] = 1;
                    if (flag == 0) {
                        i8.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[1][0]='X';
                        flag = 1;
                    } else {
                        i8.setImageResource(R.drawable.tic_tac_toe_o);
                        flag = 0;
                        arr[1][0]='O';
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }



            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a[8]==0) {
                    a[8] = 1;
                    if (flag == 0) {
                        i9.setImageResource(R.drawable.tic_tac_toe_x);
                        arr[0][1]='X';
                        flag = 1;
                    } else {
                        i9.setImageResource(R.drawable.tic_tac_toe_o);
                        flag = 0;
                        arr[0][1]='O';
                    }
                }
                int x=CheckTicTacToe(arr);
                if (x==1)
                {
                    Toast.makeText(MainActivity.this,"X is winner",Toast.LENGTH_SHORT).show();
                }
                if (x==-1)
                {
                    Toast.makeText(MainActivity.this,"O is the winner",Toast.LENGTH_SHORT).show();
                }



            }
        });


    }
    public int CheckTicTacToe(char[][] board)
    {
        int count = 0;
        int row, col;

        // Check each of 3 rows:
        for(row = 0; row < 3; ++row)
        {
            count = 0;
            for(col=0; col < 3; ++col)
            {
                count += (board[row][col] == 'X')?  1 :
                        (board[row][col] == 'O')? -1 : 0;
            }
            if (count == 3 || count == -3)
            {
                return count / 3; // Return either 1 or -1
            }
        }

        // Check each of 3 columns.
        for(col = 0; col < 3; ++col)
        {
            count = 0;
            for(row=0; row < 3; ++row)
            {
                count += (board[row][col] == 'X')?  1 :
                        (board[row][col] == 'O')? -1 : 0;
            }
            if (count == 3 || count == -3)
            {
                return count / 3; // Return either 1 or -1
            }
        }

        // Check Left-to-Right downward Diagonal:
        count = 0;
        for(col = 0; col < 3; ++col)
        {
            count += (board[col][col] == 'X')?  1 :
                    (board[col][col] == 'O')? -1 : 0;
        }
        if (count == 3 || count == -3)
        {
            return count / 3; // Return either 1 or -1
        }

        // Check Left-to-Right upward Diagonal
        count = 0;
        for(col = 0; col < 3; ++col)
        {
            count += (board[col][2-col] == 'X')?  1 :
                    (board[col][2-col] == 'O')? -1 : 0;
        }
        if (count == 3 || count == -3)
        {
            return count / 3; // Return either 1 or -1
        }

        return 0;
    }
}
