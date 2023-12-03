package com.example.comprehensivecalculator;

import android.widget.Button;
import android.widget.TextView;

//取消科学计数法，可以使用DecimalFormat类来格式化数字
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Common {
//    是否禁用数字按钮
    public void btnEnabled(boolean tof,Button num1_btn,Button num2_btn,Button num3_btn,
                                       Button num4_btn,Button num5_btn,Button num6_btn,
                                       Button num7_btn,Button num8_btn,Button num9_btn,
                                       Button num0_btn,Button point_btn) {
        num1_btn.setEnabled(tof);
        num2_btn.setEnabled(tof);
        num3_btn.setEnabled(tof);
        num4_btn.setEnabled(tof);
        num5_btn.setEnabled(tof);
        num6_btn.setEnabled(tof);
        num7_btn.setEnabled(tof);
        num8_btn.setEnabled(tof);
        num9_btn.setEnabled(tof);
        num0_btn.setEnabled(tof);
        point_btn.setEnabled(tof);
    }

//    是否禁用小数点
    public void pointClick(TextView text, Button btn) {
        String str=text.getText().toString();
        if(str.indexOf('.')==-1)
        {
            str+='.';
            text.setText(str);
            btn.setEnabled(false);
        }
    }

//    点击AC按钮
    public void acClick(TextView text1, TextView text2) {
        text1.setText("0");
        text2.setText("0");
    }

//    点击删除按钮
    public String delClick(TextView text,int max_length,Button num1_btn,Button num2_btn,
                         Button num3_btn,Button num4_btn,Button num5_btn,
                         Button num6_btn,Button num7_btn,Button num8_btn,
                         Button num9_btn,Button num0_btn,Button point_btn) {
        String str=text.getText().toString();
//        只有一个数时，删除变为0
        if(str.length()==1){
            str="0";
            return str;
        }
        if(str.length()==max_length) { //判断数字长度是否达到最大，最大的话开启数字按钮，因为随后删除最后一个字符
//                    是否禁用数字按钮
            btnEnabled(true,num1_btn,num2_btn,num3_btn,
                           num4_btn,num5_btn,num6_btn,
                           num7_btn,num8_btn,num9_btn,
                           num0_btn,point_btn);
        }
//      如果删去的是小数点，小数点按钮恢复启用
        if (str.charAt(str.length()-1) =='.'){
            point_btn.setEnabled(true);
        }
        str=str.substring(0,str.length()-1);
        return str;
    }

//      计算
    public String calculate(TextView text,int num,int max_length,Button num1_btn,
                            Button num2_btn, Button num3_btn,Button num4_btn,
                            Button num5_btn, Button num6_btn,Button num7_btn,
                            Button num8_btn, Button num9_btn,Button num0_btn,
                            Button point_btn) {
        String str=text.getText().toString();
        if(str.length()==max_length) { //数字长度太长，禁用数字按钮
//            是否禁用数字按钮
            btnEnabled(false,num1_btn,num2_btn,num3_btn,
                    num4_btn,num5_btn,num6_btn,
                    num7_btn,num8_btn,num9_btn,
                    num0_btn,point_btn);
            return str;
        }
        if(str.length()==1&&str.charAt(0)=='0') {
            str=String.valueOf(num);
        }
        else {
            str+=num;
        }
        return str;
    }

//    数值转换
    public String numChange(String str,double ratio) {
        DecimalFormat df = new DecimalFormat("#.####");// 设置格式
        df.setRoundingMode(RoundingMode.HALF_UP);// 四舍五入
        double meter_num=Double.parseDouble(str);
        double num=meter_num*ratio;
        String change_str=df.format(num);// 格式化数字
        return change_str;
    }
}
