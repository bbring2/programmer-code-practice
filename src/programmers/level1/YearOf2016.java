package programmers.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class YearOf2016 {
    public static String find2016(int a, int b) {
        String tmp = "";
        //2016 년의  월과 일을 받아서 무슨요일인지
        LocalDate settedDate = LocalDate.of(2016, a, b);

        DayOfWeek dayOfWeek = settedDate.getDayOfWeek();

        tmp = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        String answer = tmp.toUpperCase(Locale.ROOT);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(find2016(1,1));
    }
}
