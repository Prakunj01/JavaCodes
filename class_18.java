import java.util.*;

//                               Recursion part 2
//                                Tower of Hanoi 
//                                 O (2^n - 1)
public class class_18{

    public static void TowerofHanoi(int n , String sour , String helper, String dest ,int step){
            // int 
            if(n==1){
            System.out.println("transfer disk "+ n +" from "+ sour + " to "+ dest);
            step++;
            System.out.println(step);
            return;                
            }
            TowerofHanoi(n-1,sour, dest,helper,step);
            System.out.println("transfer disk "+n +" from "+ sour+ " to "+ dest);
            step++;
            TowerofHanoi(n-1, helper,sour , dest,step);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int step=0;
        TowerofHanoi(n,"S","H","D",step);

    }
}