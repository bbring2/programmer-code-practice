package hackkerank.monthKit;

public class TimeConverter {

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        int minute = Integer.parseInt(s.substring(3,5));
        int sec = Integer.parseInt(s.substring(6,8));

        if(s.contains("PM") && hour <= 11) {
            hour = hour + 12;
        }

        if(s.contains("AM") && hour == 12) {
            hour = 0;
        }

        String strHour = String.valueOf(hour);
        String strMinute = String.valueOf(minute);
        String strSec = String.valueOf(sec);

        if(hour<10) {
            strHour = "0"+strHour;
        }

        if(minute<10) {
            strMinute = "0"+strMinute;
        }

        if(sec<10) {
            strSec = "0"+strSec;
        }

        return strHour+":"+strMinute+":"+strSec;
    }

    public static void main(String[] args) {
        String s = "12:00:00AM";
        System.out.println(timeConversion(s));
    }
}
