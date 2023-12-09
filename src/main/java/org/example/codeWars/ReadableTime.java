package org.example.codeWars;

public class ReadableTime {
    public static void main(String[] args) {
        System.out.println(time(343750));
    }
    static String time(int seconds){
        String result = "";
        if(seconds == 0 ) return "00:00:00";
        if(seconds >= 60*60) {
            if(seconds/(60*60) >= 10) {
                result = seconds / (60 * 60) + ":";
            }else{
                result = "0" + seconds / (60*60) +":";
            }
            seconds = seconds % (60 * 60);
        }else{
            result += "00:";
        }if(seconds >= 60) {
            if(seconds/60 >= 10) {
                result += seconds / 60 + ":";
            }else{
                result += "0"+seconds /60 + ":";
            }
            seconds = seconds % 60;
        }else{
            result += "00:";
        }if(seconds >= 10) {
            result += seconds;
        }else {
            result += "0"+seconds;
        }
        return result ;
    }
}
