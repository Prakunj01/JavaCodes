import java.util.*;
//                            Recursive
//                            O (log n )                       
public class class_17D{

    public static int calPower(int x,int n){

        if(n==1){
            return x;
        }else if(x==0){
            return 0;
        }
        
        if(n%2==0){
        return ((calPower(x,n/2)) * (calPower(x,n/2)));

        }
        else{
        return ((calPower(x,n/2)) * (calPower(x,n/2)) * x);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
       
        // calPower(x,n);
        System.out.println(calPower(x,n));
    
    }
}