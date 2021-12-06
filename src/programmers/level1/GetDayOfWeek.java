package programmers.level1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class GetDayOfWeek {
    public String getDayOfWeek(int a, int b) {
        String answer = "";
        //2016 년의  월과 일을 받아서 무슨요일인지
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a, b);

        Date settedDate = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
        //반환은 MON TUE WED 등 short형태로 반환

        answer = sdf.format(settedDate).toUpperCase(Locale.ROOT);

        //결과값이 제대로안나옴......왜지?????

        return answer;
    }
}
