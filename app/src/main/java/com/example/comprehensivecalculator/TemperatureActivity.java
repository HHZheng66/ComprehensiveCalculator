package com.example.comprehensivecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TemperatureActivity extends AppCompatActivity {
    private Button num1_btn,num2_btn,num3_btn,num4_btn,
                   num5_btn,num6_btn,num7_btn,num8_btn,
                   num9_btn,num0_btn,
                   back_btn,ac_btn,del_btn,point_btn;
    private TextView centigrade_text,fahrenheit_text;
    double bs=33.8;
    int max_length=12;
    Common common =new Common();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        centigrade_text=(TextView)findViewById(R.id.centigrade);
        fahrenheit_text=(TextView)findViewById(R.id.fahrenheit);
//        返回功能
        back_btn=(Button)findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
        num1_btn=(Button)findViewById(R.id.num1_btn);
        num2_btn=(Button)findViewById(R.id.num2_btn);
        num3_btn=(Button)findViewById(R.id.num3_btn);
        num4_btn=(Button)findViewById(R.id.num4_btn);
        num5_btn=(Button)findViewById(R.id.num5_btn);
        num6_btn=(Button)findViewById(R.id.num6_btn);
        num7_btn=(Button)findViewById(R.id.num7_btn);
        num8_btn=(Button)findViewById(R.id.num8_btn);
        num9_btn=(Button)findViewById(R.id.num9_btn);
        num0_btn=(Button)findViewById(R.id.num0_btn);
        ac_btn=(Button)findViewById(R.id.ac_btn);
        del_btn=(Button)findViewById(R.id.del_btn);
        point_btn=(Button)findViewById(R.id.point_btn);
//        点击数字按键的功能
        num1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,1);
            }
        });
        num2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,2);
            }
        });
        num3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,3);
            }
        });
        num4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,4);
            }
        });
        num5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,5);
            }
        });
        num6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,6);
            }
        });
        num7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,7);
            }
        });
        num8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,8);
            }
        });
        num9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,9);
            }
        });
        num0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(centigrade_text,0);
            }
        });
//        点击删除按钮
        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=common.delClick(centigrade_text,max_length,num1_btn,
                                           num2_btn,num3_btn, num4_btn,num5_btn,
                                           num6_btn, num7_btn,num8_btn,num9_btn,
                                           num0_btn,point_btn);
                numChange(str);
            }
        });
//        点击AC按钮，重置为0
        ac_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                common.acClick(centigrade_text,fahrenheit_text);
//                是否禁用数字按钮
                common.btnEnabled(true,num1_btn,num2_btn,num3_btn,
                        num4_btn,num5_btn,num6_btn,
                        num7_btn,num8_btn,num9_btn,
                        num0_btn,point_btn);
            }
        });
//        点击小数点
        point_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                common.pointClick(centigrade_text,point_btn);
            }
        });

    }
//    计算函数calculate
    public void calculate(TextView meter_text,int num) {
        String str=common.calculate(meter_text,num,max_length,num1_btn,num2_btn,
                         num3_btn,num4_btn,num5_btn,num6_btn, num7_btn,
                         num8_btn,num9_btn, num0_btn,point_btn);
        numChange(str);
    }

//    是否禁用数字按钮

//    数值转换
        public void numChange(String meter_str) {
            centigrade_text.setText(meter_str);
            String str=common.numChange(meter_str,bs);
            fahrenheit_text.setText(str);
}
}
