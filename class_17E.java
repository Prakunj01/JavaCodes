import java.util.*;
//                            Recursive
//                            O (log n )                       
public class class_17E{

    public static int calPower(int n,int m){

        // int m = 1; wrong

        if(m==n){
            System.out.println(n);
            return -1;
        }
        System.out.println(m);
        return (calPower(n,m+1));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m=1;                  //right
        calPower(n,m);
    
    }
}