public class tryuse{
public static void main(String [] args){
int a=6000;
int b=0;
//without Try:
//int c=a/b;
//System.out.println("");
//with Try
try{
int c=a/b;
System.out.println("the result is"+c);

}
catch(Exception e){
System.out.println("we failed to divied . resone:");
System.out.println(e);
}
System.out.println("end of the program");
}
}