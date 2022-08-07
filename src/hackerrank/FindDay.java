package hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FindDay {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        return dayName.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 15, 1999));
    }
}
