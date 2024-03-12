import java.util.Scanner;
public  class nestedtry{
public static void main(String [] args){
int [] marks=new int[3];
marks[0]=5;
marks[1]=45;
marks[2]=68;
Scanner sc=new Scanner(System.in);
boolean flag=true;
while(flag){
System.out.println("Enter the value of index");
            int ind = sc.nextInt();
try{
System.out.println("welcome to level1");
try{
System.out.println(marks[ind]);
flag=false;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Sorry this index does not exist");
System.out.println("Exception in level 2");
}
}
catch(Exception e){
System.out.println("exception  in level 1");
}

}
System.out.println("thanks for using this program");
}}