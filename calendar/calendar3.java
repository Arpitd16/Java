import java.util.*;
public class calendar3{
public static void main(String [] args){
GregorianCalendar c=new GregorianCalendar();
System.out.println("date before rolling :"+c.getTime());
c.roll(Calendar.MONTH,true);
c.roll(Calendar.DATE,false);
c.roll(Calendar.YEAR,true);
System.out.println("Date after rolling:"+c.getTime());
}}