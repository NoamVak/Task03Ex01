package com.example.task03ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Button btn1;
    Button btn2;
    Random rnd=new Random();
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        tv1=(TextView)findViewById(R.id.tv1);
    }

    public void click(View view) {
        x=rnd.nextInt(100)+1;
        tv1.setText("Number="+" "+x);
    }

    public void click2(View view) {
        tv1.setText("Number not found");
    }
}
