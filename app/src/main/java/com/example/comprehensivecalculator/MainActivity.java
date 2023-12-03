package com.example.comprehensivecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button exchangeRate_btn,length_btn,digital_btn,relative_btn,
                   area_btn,volume_btn,speed_btn,time_btn,weight_btn,temperature_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exchangeRate_btn=(Button)findViewById(R.id.exchangeRate_btn);
//        点击汇率转换按钮并跳转
        exchangeRate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ExchangeRateActivity.class);
                startActivity(intent);
            }
        });
        length_btn=(Button)findViewById(R.id.length_btn);
//        点击长度转换按钮并跳转
        length_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,LengthActivity.class);
                startActivity(intent);
            }
        });
        digital_btn=(Button)findViewById(R.id.digital_btn);
//        点击数字计算器按钮并跳转
        digital_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,DigitalActivity.class);
                startActivity(intent);
            }
        });
//        点击亲戚按钮
        relative_btn=(Button)findViewById(R.id.relative_btn);
        relative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });
//        点击面积按钮
        area_btn=(Button)findViewById(R.id.area_btn);
        area_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,AreaActivity.class);
                startActivity(intent);
            }
        });
//        点击体积按钮
        volume_btn=(Button)findViewById(R.id.volume_btn);
        volume_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,VolumeActivity.class);
                startActivity(intent);
            }
        });
//        点击速度按钮
        speed_btn=(Button)findViewById(R.id.speed_btn);
        speed_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SpeedActivity.class);
                startActivity(intent);
            }
        });
//        点击时间按钮
        time_btn=(Button)findViewById(R.id.time_btn);
        time_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,TimeActivity.class);
                startActivity(intent);
            }
        });
//        点击重量按钮
        weight_btn=(Button)findViewById(R.id.weight_btn);
        weight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,WeightActivity.class);
                startActivity(intent);
            }
        });
//        点击温度按钮
        temperature_btn=(Button)findViewById(R.id.temperature_btn);
        temperature_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,TemperatureActivity.class);
                startActivity(intent);
            }
        });
    }
}