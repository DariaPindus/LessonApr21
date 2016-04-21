package ua.od.pindus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by User on 21.04.2016.
 */
public class DateTimeTest {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-");
        String result=dateFormat.format(date);

        System.out.println(result);

        Calendar calendar=Calendar.getInstance();
        int hours=calendar.get(Calendar.HOUR_OF_DAY);


    }

}
