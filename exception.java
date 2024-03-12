import java.util.Scanner;
public class exception{
public static void main(String [] args){
int [] marks=new int[3];
marks[0]=3;
marks[1]=66;
marks[2]=109;
Scanner sc=new Scanner(System.in);
System.out.println("enter the index");
int ind=sc.nextInt();

System.out.println("enter the number you want to divied");
int num=sc.nextInt();
try{
System.out.println("the value at array index entered is:"+marks[ind]);
System.out.println("the final value:"+marks[ind]/num);
}
catch(ArithmeticException e){
System.out.println("Arithmeticexception occured!");
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("(ArrayIndexOutOfBoundsException occured!");
System.out.println(e);
}
catch(Exception e){
   System.out.println("Some other exception occured!");
            System.out.println(e);
}
}
}