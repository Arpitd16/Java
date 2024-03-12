import java.util.*;
public class calendar1{
public static void main(String [] args){
Calendar c=Calendar.getInstance();
System.out.println(c.getWeeksInWeekYear());
System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));
System.out.println("Cureent date is :"+c.getTime());
c.add(Calendar.YEAR,4);
System.out.println("Cureent date is :"+c.getTime());
c.add(Calendar.YEAR,-12);
System.out.println("Cureent date is :"+c.getTime());
c.add(Calendar.MONTH,2);
System.out.println("Cureent date is :"+c.getTime());

}

}