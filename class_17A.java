import java.util.*;
//                            Recursive
//                            Fibonacci                           
public class class_17A{

    public static int fibo(int n){

        if(n==1){
            System.out.print(1);
            return 1;
        }
        else if(n==0){
            System.out.print(0);
            return 0;
        }
        // System.out.print(0);
        int sum = (fibo(n-1)) + (fibo(n-2));
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // fibo(n);
        System.out.println(fibo(n));
        

    }
}