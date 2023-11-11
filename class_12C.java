import java.util.*;
//                                     reverse STRING function
public class class_12C{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       
        StringBuilder sb = new StringBuilder("hello");
        System.out.println( sb);

        int n = sb.length();        
        for(int i=0; i<n/2; i++){

            int front =i;
            int back = n-1-i;

            char frontChar =sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);

    }
} 