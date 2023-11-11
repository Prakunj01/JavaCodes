import java.util.*;
public class class_05F{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=1 ; i<=n; i++){
            for(int j=1; j<=n; j++){  // j=1; j<=n-i; j++
                    // System.out.print(" * ");
                if(j<=n-i +1){
                    System.out.print(" "+j+" "); 
                }
                else{
                    System.out.print("  ");
                }
             
            }
            System.out.print("\n");

        }
    }
}