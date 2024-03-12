class nagativeradius extends Exception{
@Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class throws{
public static double area(int r) throws nagativeradius{
if(r<0){
throw new negativeradius();
}
double result=Math.PI*r*r;
return result;
}
public static int divide(int a, int b) throws ArithmeticException{
        // Made By Harry
        int result = a/b;
        return result;
    }
public static void main(String [] args){
try{
int c=divide(6,0);
System.out.println(c);
}
catch(Exception e){
System.out.println("exception");
}
}
}