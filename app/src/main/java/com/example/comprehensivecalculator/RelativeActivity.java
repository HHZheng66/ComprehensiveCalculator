package com.example.comprehensivecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {
    RelativeFun relativeFun=new RelativeFun();
    private Button back_btn,husband_btn,wife_btn,
                   dad_btn,mom_btn,elderBro_btn,
                   youngerBro_btn,elderSis_btn,youngerSis_btn,
                   son_btn,daughter_btn,ac_btn,del_btn,equal_btn;
//    字符串存放称呼编号
    String number="";
    int number_length=0;
    int max_length=10;//字符串最大长度
    TextView relative_text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        relative_text=(TextView)findViewById(R.id.relative_text);
//        返回功能
        back_btn=(Button)findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
//        点击“夫”按钮
        husband_btn=(Button)findViewById(R.id.husband_btn);
        husband_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的丈夫";
                char c='0';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“妻”按钮
        wife_btn=(Button)findViewById(R.id.wife_btn);
        wife_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的妻子";
                char c='1';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击父按钮
        dad_btn=(Button)findViewById(R.id.dad_btn);
        dad_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的父亲";
                char c='2';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“母”按钮
        mom_btn=(Button)findViewById(R.id.mom_btn);
        mom_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的母亲";
                char c='3';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“哥”按钮
        elderBro_btn=(Button)findViewById(R.id.elderBro_btn);
        elderBro_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的哥哥";
                char c='4';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“弟”按钮
        youngerBro_btn=(Button)findViewById(R.id.youngerBro_btn);
        youngerBro_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的弟弟";
                char c='5';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“姐”按钮
        elderSis_btn=(Button)findViewById(R.id.elderSis_btn);
        elderSis_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的姐姐";
                char c='6';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“妹”按钮
        youngerSis_btn=(Button)findViewById(R.id.youngerSis_btn);
        youngerSis_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的妹妹";
                char c='7';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“子”按钮
        son_btn=(Button)findViewById(R.id.son_btn);
        son_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的儿子";
                char c='8';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击“女”按钮
        daughter_btn=(Button)findViewById(R.id.daughter_btn);
        daughter_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
                String addStr="的女儿";
                char c='9';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
            }
        });
//        点击AC按钮
        ac_btn=(Button)findViewById(R.id.ac_btn);
        ac_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str="";
                String addStr="我";
                char c=' ';
                if(str.length()<max_length){
                    textChange(relative_text,str,addStr,c);//修改显示内容
                    number=changeNumber(number,number_length,c);//修改存放的编号
                }
                if(number_length==0){
                    btnEnabled(true,husband_btn,wife_btn,
                            dad_btn,mom_btn,elderBro_btn,
                            youngerBro_btn,elderSis_btn,youngerSis_btn,
                            son_btn,daughter_btn,del_btn,equal_btn);
                }
            }
        });
//        点击删除按钮
        del_btn=(Button)findViewById(R.id.del_btn);
        del_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str=relative_text.getText().toString();
//                出现"孙子","外孙女","自己/哥哥/弟弟","这关系我也搞不清楚诶!"时,删除一整段
                if(str.length()==1||str.length()==2||str.length()==3||str.length()==8||str.length()==11) { //有计算结果时
                    number_length=0;
                    number="";
                    relative_text.setText("我");
                } else {
                    int length=str.length();
                    int index=length-3;
                    str=str.substring(0,index);
                    number_length--;
                    number=number.substring(0,number_length);
                    relative_text.setText(str);
                }
            }
        });
//        点击等于号
        equal_btn=(Button)findViewById(R.id.equal_btn);
        equal_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String result=getResult();
                relative_text.setText(result);
            }
        });
    }
//    修改显示内容
    public void textChange(TextView text,String str,String addStr,char c){
            str+=addStr;
            text.setText(str);
    }
//    修改编号
    public String changeNumber(String str,int index,char c){
//        AC时，传递空格字符串，
        if(c==' '){
            number="";
            number_length=0;
            return number;
        }
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.insert(index,c);
        str=stringBuffer.toString();
        number_length++;
        return str;
    }

//    计算结果
    public String getResult(){
        String result="";
//        层数多于2时，无法计算
        if(number_length>2){
            result+="我也算懵了";
            number="";
            number_length=0;
//            禁用大部分键盘(除于AC)
            btnEnabled(false,husband_btn,wife_btn,
                           dad_btn,mom_btn,elderBro_btn,
                           youngerBro_btn,elderSis_btn,youngerSis_btn,
                           son_btn,daughter_btn,del_btn,equal_btn);

        }else {
            result+=relativeFun.getRelative(number,number_length);
        }
        return result;
    }
//    是否禁用大部分键盘(除于AC)
    public void btnEnabled(boolean tof,Button num0_btn,Button num1_btn,Button num2_btn,
                           Button num3_btn, Button num4_btn,Button num5_btn,Button num6_btn,
                           Button num7_btn,Button num8_btn,Button num9_btn,
                           Button del_btn,Button equal_btn) {
        num0_btn.setEnabled(tof);
        num1_btn.setEnabled(tof);
        num2_btn.setEnabled(tof);
        num3_btn.setEnabled(tof);
        num4_btn.setEnabled(tof);
        num5_btn.setEnabled(tof);
        num6_btn.setEnabled(tof);
        num7_btn.setEnabled(tof);
        num8_btn.setEnabled(tof);
        num9_btn.setEnabled(tof);
        del_btn.setEnabled(tof);
        equal_btn.setEnabled(tof);
    }
}
