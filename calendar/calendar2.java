import java.util.*;

public class calendar2 extends Thread{

    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));

    }
}