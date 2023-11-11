 import java.util.*;
//            find the no. of ways in which yucan invite n people to your party ( single or in pair )
//  
 public class class_19C{
    public static int callGuest(int n ){

        if(n<=1){
            return 1;
        }
       
        int way1 = callGuest(n-1);
        int way2 = (n-1) * callGuest(n-2);
        return way1 + way2;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        System.out.println(callGuest(n));

    }
 }