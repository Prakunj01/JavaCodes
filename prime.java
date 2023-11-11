import java.util.*;

class prime{

    static boolean isprime(int x){
        
        if(x==1)return false;
        for(int i=2; i<x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    static void printprime(int a,int b){
        for(int i=a; i<=b; i++){
            if(isprime(i)){
                System.out.print(i +" ");
            }
        }
    } 

    public static void main(String[] args){
        // int n=23;
        // Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int n = sc.nextInt();

        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        // boolean result = (isprime(n));
        printprime(a,b);
    }
}