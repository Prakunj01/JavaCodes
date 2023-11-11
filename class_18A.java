import java.util.*;

//                               Recursion part 2
//                                Reverse String 
//                                 O (n)
public class class_18A{
 
    public static void Reverse(String n ,int index){
            // int 
            if(index==0){
            System.out.println(n.charAt(index));
            return;                
            }
            System.out.println(n.charAt(index));
            Reverse(n,index-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int index = n.length()-1; 
        Reverse(n,index);

    }
}