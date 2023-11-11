import java.util.*;
//                            Recursive
//                             O( n )                       
public class class_17C{

    public static int calPower(int x,int n){

        if(n==1){
            return x;
        }else if(x==0){
            return 0;
        }
        
        return (x * (calPower(x,n-1)));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
       

        // calPower(x,n);
        System.out.println(calPower(x,n));
        

    }
}