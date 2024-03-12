import java.util.*;
public class calendar extends Thread{
public static void main(String [] args){
Calendar c=Calendar.getInstance();
System.out.println(c.getCalendarType());
System.out.println("current year is:"+c.get(Calendar.YEAR));
System.out.println("current month is:"+c.get(Calendar.MONTH));
System.out.println("current day is:"+c.get(Calendar.DAY_OF_WEEK));
System.out.println("current hour is:"+c.get(Calendar.HOUR_OF_DAY));
System.out.println("current min is:"+c.get(Calendar.MINUTE));
System.out.println("current second is:"+c.get(Calendar.SECOND));
}}