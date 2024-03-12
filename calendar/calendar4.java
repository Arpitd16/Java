import java.util.*;
public class calendar4{
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Calendar : " + c.getTime());

        System.out.println("The hashcode for this calendar is : "+ c.hashCode());
    }
}