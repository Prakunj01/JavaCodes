import java.util.*;
//                            Recursive
//                            Fibonacci series                       
public class class_17B{

    public static void fiboseries(int a,int b,int n){

        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c + " ");
        
        fiboseries(b,c,n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a=0,b=1;
        System.out.print(0+" ");
        System.out.print(1+" ");

        fiboseries(a,b,n);
        // System.out.println(fibo(n));
        

    }
}