import java.util.*;
public class class_05B{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=1 ; i<=n; i++){
            for(int j=n; j>=i; j--){  // j=1; j<=n-i; j++
                    System.out.print(" * ");
             
            }
            System.out.print("\n");

        }
    }
}