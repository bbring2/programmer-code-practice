package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class DateDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String date1 = st.nextToken();
        String date2 = st.nextToken();

        int date1Year = Integer.parseInt(date1.substring(0, 4));
        int date1Month = Integer.parseInt(date1.substring(4, 6));
        int date1Day = Integer.parseInt(date1.substring(6, 8));
        int date2Year = Integer.parseInt(date2.substring(0, 4));
        int date2Month = Integer.parseInt(date2.substring(4, 6));
        int date2Day = Integer.parseInt(date2.substring(6, 8));

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        calendar1.set(date1Year, date1Month-1, date1Day);
        calendar2.set(date2Year, date2Month-1, date2Day);

        Date d1 = calendar1.getTime();
        Date d2 = calendar2.getTime();

        long between = d2.getTime() - d1.getTime();

        System.out.println(between/86400000);
    }

}
