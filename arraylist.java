import java.util.*;
public class arraylist{
public static void main(String [] args){
ArrayList<Integer> l1=new ArrayList<>();
ArrayList<Integer> l2=new ArrayList<>();

l1.add(5);
l1.add(10);
l1.add(15);
l1.add(4);
l1.add(6);
l1.add(5,5);  // inserts 5 at the 5th index in l1

l2.add(11);
l2.add(12);
l2.add(13);
System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);

//l1.remove(0);
//System.out.println("ArrayList after removing the value at index 0 :" + l1);

//System.out.println("Array list : "+ l1);
 //       System.out.println("L1 list contains 7 : " + l1.contains(7));
   //     System.out.println("L1 list contains 4 : " + l1.contains(4));
System.out.println("the element of :"+l1.indexOf(4));
}
}