import java.util.*;
class factorial{

    static int factorial(int n){
        // if(n==1 || n==0){
        //     return 1;
        // }
        // return (n * n-1);


        int ans =1;
        for(int i=1; i<=n; i++){
          ans = i * ans;  
        }
        return ans;

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int result = factorial(n);
        System.out.print(n);
    }
}