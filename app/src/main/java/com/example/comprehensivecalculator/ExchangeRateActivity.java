package com.example.comprehensivecalculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExchangeRateActivity extends AppCompatActivity {
    Common common =new Common();
    private Button back_btn;
    private Button num1_btn,num2_btn,num3_btn,
                   num4_btn,num5_btn,num6_btn,
                   num7_btn,num8_btn,num9_btn,
                   num0_btn,ac_btn,del_btn;
    private Button point_btn;
    private TextView cny_text;
    private TextView usd_text;
    private TextView eur_text;
    double usd=0.1386;
    double eur=0.1276;
    int max_length=9;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exchange);
        back_btn=(Button)findViewById(R.id.back_btn);
        cny_text=(TextView)findViewById(R.id.cny_text);
        usd_text=(TextView)findViewById(R.id.usd_text);
        eur_text=(TextView)findViewById(R.id.eur_text);
        point_btn=(Button)findViewById(R.id.point_btn);
//        返回功能
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
//        点击数字按键的功能
        num1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,1);
            }
        });
        num2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,2);
            }
        });
        num3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,3);
            }
        });
        num4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,4);
            }
        });
        num5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,5);
            }
        });
        num6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,6);
            }
        });
        num7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,7);
            }
        });
        num8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,8);
            }
        });
        num9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,9);
            }
        });
        num0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(cny_text,0);
            }
        });
//        点击删除按钮
        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=common.delClick(cny_text,max_length,num1_btn,
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
                cny_text.setText("0");
                usd_text.setText("0");
                eur_text.setText("0");
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
                String str=cny_text.getText().toString();
                if(str.indexOf('.')==-1)
                {
                    str+='.';
                    cny_text.setText(str);
                    point_btn.setEnabled(false);
                }
            }
        });

    }
//    计算函数calculate
    public void calculate(TextView cny_text, int num) {
        String str=common.calculate(cny_text,num,max_length,num1_btn,num2_btn,
                num3_btn,num4_btn,num5_btn,num6_btn, num7_btn,
                num8_btn,num9_btn, num0_btn,point_btn);
        numChange(str);
    }

//    数值转换
        public void numChange(String cny_str) {
            cny_text.setText(cny_str);
            String usd_str=common.numChange(cny_str,usd);
            usd_text.setText(usd_str);
            String eur_str=common.numChange(cny_str,eur);
            eur_text.setText(eur_str);
}
}
