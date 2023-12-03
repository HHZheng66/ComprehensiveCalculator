package com.example.comprehensivecalculator;

public class RelativeFun {
    public String getRelative(String str,int length){
        String relative="";
        if(length==0){
            relative+="我";
        }
        else if(length==1){
            relative+=getOneRelative(str);
        }else if(length==2){
            relative+=getTwoRelative(str);
        }
        return relative;
    }

//    两层关系
    public String getTwoRelative(String str){
        String relative="";
//        0
        if(str.charAt(0)=='0'){
            if(str.equals("00")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("01")){
                relative+="自己";
            } else if(str.equals("02")){
                relative+="公公";
            } else if(str.equals("03")){
                relative+="婆婆";
            } else if(str.equals("04")){
                relative+="大伯";
            } else if(str.equals("05")){
                relative+="小叔";
            } else if(str.equals("06")){
                relative+="大姑";
            } else if(str.equals("07")){
                relative+="小姑";
            } else if(str.equals("08")){
                relative+="儿子";
            } else if(str.equals("09")){
                relative+="女儿";
            }
        }
//        1
        else if(str.charAt(0)=='1'){
            if(str.equals("10")){
                relative+="自己";
            } else if(str.equals("11")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("12")){
                relative+="岳父";
            } else if(str.equals("13")){
                relative+="岳母";
            } else if(str.equals("14")){
                relative+="大舅";
            } else if(str.equals("15")){
                relative+="小舅";
            } else if(str.equals("16")){
                relative+="答疑";
            } else if(str.equals("17")){
                relative+="小姨";
            } else if(str.equals("18")){
                relative+="儿子";
            } else if(str.equals("19")){
                relative+="女儿";
            }
        }
//        2
        else if(str.charAt(0)=='2'){
            if(str.equals("20")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("21")){
                relative+="妈妈";
            } else if(str.equals("22")){
                relative+="爷爷";
            } else if(str.equals("23")){
                relative+="奶奶";
            } else if(str.equals("24")){
                relative+="伯父";
            } else if(str.equals("25")){
                relative+="叔叔";
            } else if(str.equals("26")){
                relative+="姑母";
            } else if(str.equals("27")){
                relative+="姑母";
            } else if(str.equals("28")){
                relative+="自己/哥哥/弟弟";
            } else if(str.equals("29")){
                relative+="自己/姐姐/妹妹";
            }
        }
//        3
        else if(str.charAt(0)=='3'){
            if(str.equals("30")){
                relative+="爸爸";
            } else if(str.equals("31")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("32")){
                relative+="外公";
            } else if(str.equals("33")){
                relative+="外婆";
            } else if(str.equals("34")){
                relative+="大舅";
            } else if(str.equals("35")){
                relative+="小舅";
            } else if(str.equals("36")){
                relative+="大姨";
            } else if(str.equals("37")){
                relative+="小姨";
            } else if(str.equals("38")){
                relative+="自己/哥哥/弟弟";
            } else if(str.equals("39")){
                relative+="自己/姐姐/妹妹";
            }
        }
//        4
        else if(str.charAt(0)=='4'){
            if(str.equals("40")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("41")){
                relative+="嫂子";
            } else if(str.equals("42")){
                relative+="爸爸";
            } else if(str.equals("43")){
                relative+="妈妈";
            } else if(str.equals("44")){
                relative+="哥哥";
            } else if(str.equals("45")){
                relative+="自己/哥哥/弟弟";
            } else if(str.equals("46")){
                relative+="姐姐";
            } else if(str.equals("47")){
                relative+="自己/姐姐/妹妹";
            } else if(str.equals("48")){
                relative+="侄子";
            } else if(str.equals("49")){
                relative+="侄女";
            }
        }
//        5
        else if(str.charAt(0)=='5'){
            if(str.equals("50")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("51")){
                relative+="弟妹";
            } else if(str.equals("52")){
                relative+="爸爸";
            } else if(str.equals("53")){
                relative+="妈妈";
            } else if(str.equals("54")){
                relative+="自己/哥哥/弟弟";
            } else if(str.equals("55")){
                relative+="弟弟";
            } else if(str.equals("56")){
                relative+="自己/姐姐/妹妹";
            } else if(str.equals("57")){
                relative+="妹妹";
            } else if(str.equals("58")){
                relative+="侄子";
            } else if(str.equals("59")){
                relative+="侄女";
            }
        }
//        6
        else if(str.charAt(0)=='6'){
            if(str.equals("60")){
                relative+="姐夫";
            } else if(str.equals("61")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("62")){
                relative+="爸爸";
            } else if(str.equals("63")){
                relative+="妈妈";
            } else if(str.equals("64")){
                relative+="哥哥";
            } else if(str.equals("65")){
                relative+="自己/哥哥/弟弟";
            } else if(str.equals("66")){
                relative+="姐姐";
            } else if(str.equals("67")){
                relative+="自己/姐姐/妹妹";
            } else if(str.equals("68")){
                relative+="外甥";
            } else if(str.equals("69")){
                relative+="外甥女";
            }
        }
//        7
        else if(str.charAt(0)=='7'){
            if(str.equals("70")){
                relative+="妹夫";
            } else if(str.equals("71")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("72")){
                relative+="爸爸";
            } else if(str.equals("73")){
                relative+="妈妈";
            } else if(str.equals("74")){
                relative+="自己/哥哥/弟弟";
            } else if(str.equals("75")){
                relative+="弟弟";
            } else if(str.equals("76")){
                relative+="自己/姐姐/妹妹";
            } else if(str.equals("77")){
                relative+="妹妹";
            } else if(str.equals("78")){
                relative+="外甥";
            } else if(str.equals("79")){
                relative+="外甥女";
            }
        }
//        8
        else if(str.charAt(0)=='8'){
            if(str.equals("80")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("81")){
                relative+="儿媳妇";
            } else if(str.equals("82")){
                relative+="老公/自己";
            } else if(str.equals("83")){
                relative+="自己/老婆";
            } else if(str.equals("84")){
                relative+="儿子";
            } else if(str.equals("85")){
                relative+="儿子";
            } else if(str.equals("86")){
                relative+="女儿";
            } else if(str.equals("87")){
                relative+="女儿";
            } else if(str.equals("88")){
                relative+="孙子";
            } else if(str.equals("89")){
                relative+="孙女";
            }
        }
//        9
        else if(str.charAt(0)=='9'){
            if(str.equals("90")){
                relative+="女婿";
            } else if(str.equals("91")){
                relative+="这关系我也搞不清楚诶!";
            } else if(str.equals("92")){
                relative+="老公/自己";
            } else if(str.equals("93")){
                relative+="自己/老婆";
            } else if(str.equals("94")){
                relative+="儿子";
            } else if(str.equals("95")){
                relative+="儿子";
            } else if(str.equals("96")){
                relative+="女儿";
            } else if(str.equals("97")){
                relative+="女儿";
            } else if(str.equals("98")){
                relative+="外孙";
            } else if(str.equals("99")){
                relative+="外孙女";
            }
        }
        return relative;
    }
//    一层关系
    public String getOneRelative(String str){
        String relative="";
        if(str.equals("0")){
            relative+="老公";
        } else if(str.equals("1")){
            relative+="老婆";
        } else if(str.equals("2")){
            relative+="爸爸";
        } else if(str.equals("3")){
            relative+="妈妈";
        } else if(str.equals("4")){
            relative+="哥哥";
        } else if(str.equals("5")){
            relative+="弟弟";
        } else if(str.equals("6")){
            relative+="姐姐";
        } else if(str.equals("7")){
            relative+="妹妹";
        } else if(str.equals("8")){
            relative+="儿子";
        } else if(str.equals("9")){
            relative+="女儿";
        }
        return relative;
    }
}
