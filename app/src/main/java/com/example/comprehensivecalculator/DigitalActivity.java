package com.example.comprehensivecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DigitalActivity extends AppCompatActivity {
    private Button num1_btn,num2_btn,num3_btn,num4_btn,
                   num5_btn,num6_btn,num7_btn,num8_btn,
                   num9_btn,num0_btn,
                   back_btn,ac_btn,del_btn,point_btn,
                   add_btn,subtract_btn,multiply_btn,
                   divide_btn,percent_btn,equal_btn;
    private TextView digital_text;
    int max_length=20;
    Common common = new Common();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital);
        digital_text=(TextView)findViewById(R.id.digital_text);
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
        add_btn=(Button)findViewById(R.id.add_btn);
        subtract_btn=(Button)findViewById(R.id.subtract_btn);
        multiply_btn=(Button)findViewById(R.id.multiply_btn);
        divide_btn=(Button)findViewById(R.id.divide_btn);
        percent_btn=(Button)findViewById(R.id.percent_btn);
        equal_btn=(Button)findViewById(R.id.equal_btn);
//        点击数字按键的功能
        num1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,1);
            }
        });
        num2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,2);
            }
        });
        num3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,3);
            }
        });
        num4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,4);
            }
        });
        num5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,5);
            }
        });
        num6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,6);
            }
        });
        num7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,7);
            }
        });
        num8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,8);
            }
        });
        num9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,9);
            }
        });
        num0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(digital_text,0);
            }
        });
//        点击删除按钮
        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=common.delClick(digital_text,max_length,num1_btn,
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
                digital_text.setText("0");
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
                String str=digital_text.getText().toString();
                int lastIndex=str.lastIndexOf('.');
//                小数点前是否有+、-、x、÷，有的话不允许加上小数点
                Boolean isChar=isChar(str);
                Boolean isAllNumber=isAllNumber(str,lastIndex);
                if(lastIndex==-1){ //没有出现小数点
                    str+='.';
                } else if(isChar==true) { //小数点前是否有符号，是的话不加.
                    str=str;
                } else if(lastIndex!=-1&&isAllNumber==true) { //前一个小数点前是否全是数字，是的话不加.
                    str=str;
                } else if(lastIndex!=-1&&isAllNumber==false) {
                    str+='.';
                }
               digital_text.setText(str);
            }
        });
//        点击加法按钮
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=digital_text.getText().toString();
                char lastChar=str.charAt(str.length()-1);
//                如果最后一个符号是+、-、x、÷,最后一个符号换成-
                if (lastChar=='+'||lastChar=='-'||lastChar=='x'||lastChar=='÷'){
                    str=str.substring(0,str.length()-1);
                }
                str+='+';
                numChange(str);
            }
        });
//        点击减法按钮
        subtract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=digital_text.getText().toString();
                char lastChar=str.charAt(str.length()-1);
//                如果最后一个符号是+、-、x、÷,最后一个符号换成+
                if (lastChar=='+'||lastChar=='-'||lastChar=='x'||lastChar=='÷'){
                    str=str.substring(0,str.length()-1);
                }
                str+='-';
                numChange(str);
            }
        });

//        点击乘法按钮
        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=digital_text.getText().toString();
                char lastChar=str.charAt(str.length()-1);
//                如果最后一个符号是+、-、x、÷,最后一个符号换成x
                if (lastChar=='+'||lastChar=='-'||lastChar=='x'||lastChar=='÷'){
                    str=str.substring(0,str.length()-1);
                }
                str+='x';
                numChange(str);
            }
        });

//        点击除法按钮
        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=digital_text.getText().toString();
                char lastChar=str.charAt(str.length()-1);
//                如果最后一个符号是+、-、x、÷,最后一个符号换成÷
                if (lastChar=='+'||lastChar=='-'||lastChar=='x'||lastChar=='÷'){
                    str=str.substring(0,str.length()-1);
                }
                str+='÷';
                numChange(str);
            }
        });
//        点击百分号
        percent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=digital_text.getText().toString();
                char lastChar=str.charAt(str.length()-1);
//                如果最后一个符号是+、-、x、÷，%，.,不能加上%
                if (lastChar=='+'||lastChar=='-'||lastChar=='x'||lastChar=='÷'||lastChar=='%'||lastChar=='.'){
                    str=str;
                }
                else{
                    str+="x0.01";
                }
                numChange(str);
            }
        });

//        点击等于号
        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=digital_text.getText().toString();
                int length=str.length();
                Chars[] charsArr=new Chars[20];
                int charsArr_count=0;
                int i;
//                存字符信息
                for(i=0;i<length;i++){
                    char c=str.charAt(i);
                    int order,priority,position;
                    if(c=='+'||c=='-'||c=='x'||c=='÷'){
                        if(c=='+'||c=='-'){
                            priority=1;
                        }else {
                            priority=2;
                        }
                        position=i;
                        order=charsArr_count;
                        charsArr[charsArr_count]=new Chars(c,order,priority,position);
                        charsArr_count++;
                    }
                    if(i==length-1){
                        c='=';
                        priority=0;
                        position=length;
                        order=charsArr_count;
                        charsArr[charsArr_count]=new Chars(c,order,priority,position);
                        charsArr_count++;
                    }
                }
//                存放数字
                double[] nums=new double[20];
                int nums_length=0;
                int startIndex=0;
                for(i=0;i<charsArr_count;i++){
                    int endIndex=charsArr[i].position;
                    if(startIndex!=endIndex){
                        String nums_str=str.substring(startIndex,endIndex);
                        double num=Double.parseDouble(nums_str);
                        nums[nums_length++]=num;
                        startIndex=endIndex+1;
                    }

                }
//                +、-、*、\后无数字的情况
                if(str.charAt(length-1)=='+'||str.charAt(length-1)=='-'){
                    nums[nums_length++]=0;
                }else if(str.charAt(length-1)=='x'||str.charAt(length-1)=='÷'){
                    nums[nums_length++]=1;
                }
//                求结果
                double result=getResult(nums,nums_length,charsArr,charsArr_count);
                DecimalFormat df =new DecimalFormat("#.####");// 设置格式
                df.setRoundingMode(RoundingMode.HALF_UP);// 四舍五入
                String result_str=df.format(result);
                digital_text.setText(result_str);
            }

        });
    }


//    计算函数calculate
    public void calculate(TextView text,int num) {
        String str=common.calculate(text,num,max_length,num1_btn,num2_btn,
                         num3_btn,num4_btn,num5_btn,num6_btn, num7_btn,
                         num8_btn,num9_btn, num0_btn,point_btn);
        numChange(str);
    }

//    是否禁用数字按钮

//    数值转换
        public void numChange(String str) {
            digital_text.setText(str);
}

//        判断是否全是数字
        public Boolean isAllNumber(String str,int index) {
            if(index==-1){
                return false;
            }
            int length=str.length();
            int i;
            for(i=index+1;i<length;i++){
                if(str.charAt(i)!='1'&&str.charAt(i)!='2'&&str.charAt(i)!='3'&&
                   str.charAt(i)!='4'&&str.charAt(i)!='5'&&str.charAt(i)!='6'&&
                   str.charAt(i)!='7'&&str.charAt(i)!='8'&&str.charAt(i)!='9'&&str.charAt(i)!='0'
                ){
                    return false;
                }
            }
            return true;
}
        public Boolean isChar(String str) {
            return str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||
                   str.charAt(str.length()-1)=='x'||str.charAt(str.length()-1)=='÷';

        }
//        求结果
        public double getResult(double[] nums,int nums_length,Chars[] charsArr,int charsArr_count){
            int i;
            for(i=0;i<charsArr_count;i++){
                if(charsArr[i].priority==2){
                    int index=charsArr[i].order;
                    char c=charsArr[i].c;
                    if(c=='x'){
                        nums[index+1]=nums[index]*nums[index+1];
                    }else {
                        nums[index+1]=nums[index]/nums[index+1];
                    }
                    nums[index]=0;
                    charsArr[i].priority=1;
                    charsArr[i].c='+';
                }
                if(charsArr[i].priority==0){
                    charsArr[i].priority=1;
                    charsArr[i].c='+';
                }
            }
            double result=nums[0];
            for(i=0;i<charsArr_count;i++){
                if(charsArr[i].priority!=0){
                    char c=charsArr[i].c;
                    if(c=='+'||c=='='){
                        result+=nums[i+1];
                    }else {
                        result-=nums[i+1];
                    }
                }
            }
            return result;
        }

//        存放字符信息的类
        public class Chars {
            char c; //字符
            int order; //字符的次序
            int priority; //字符的优先级 0:'=' 1:'+,-' 2:'*、\'
            int position; //字符的在字符串的位置
            public Chars(char c,int order,int priority,int position) {
                this.c=c;
                this.order=order;
                this.priority=priority;
                this.position=position;
            }
    }
}
