import java.time.*;
public class clock extends Thread{
public static void main(String [] args){
Clock c1=Clock.systemDefaultZone();
System.out.println(c1.getZone());
Clock c2=Clock.systemUTC();
System.out.println(c2.instant());
}}
