import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter{
            public static void main(String[] args) {

                        LocalDateTime dt = LocalDateTime.now();
                        System.out.println("The current date is : " + dt);

DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
DateTimeFormatter df4 = DateTimeFormatter.ISO_LOCAL_DATE;
String myDate = dt.format(df); // Creating date string using date and format
System.out.println(myDate);


DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format
String myDate1 = dt.format(df1); // Creating date string using date and format
                        System.out.println("Date in ISO format : "+ myDate1);

DateTimeFormatter df2 = DateTimeFormatter.ISO_WEEK_DATE;// 
String myDate2 = dt.format(df2); 
System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate2);


                    }
}