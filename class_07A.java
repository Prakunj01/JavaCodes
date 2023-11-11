import java.util.*;

public class class_07A{
    public static int factorial(int n){
        // System.out.println(n1);
        if(n==1){
            return 1;
        }
        return (n * (factorial(n-1)));
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(factorial(n));

        System.out.println(n);
        

    }


}