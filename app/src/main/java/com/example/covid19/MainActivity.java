package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    public void button1(View view){
    Intent in=new Intent(MainActivity.this,first.class);
    startActivity(in);
    }
    public void button2(View view){
        Intent in=new Intent(MainActivity.this,second.class);
        startActivity(in);
    }
    public void button3(View view){
        Intent in=new Intent(MainActivity.this,third.class);
        startActivity(in);
    }
    public void button4(View view){
        Intent in=new Intent(MainActivity.this,fourth.class);
        startActivity(in);
    }
    public void button5(View view){
       Intent i=new Intent(Intent.ACTION_VIEW);
       i.setData(Uri.parse("https://covid19responsefund.org/"));
       startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button2);
        btn4=(Button)findViewById(R.id.button2);
    }
}
