import java.util.*;
public class class_05D{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=1 ; i<=n; i++){
            for(int j=1; j<=n; j++){ 
                    // System.out.print(" * ");
                if(j<=n-i){
                    System.out.print("   "); 
                }
                else{
                    System.out.print(" * ");
                }
             
            }
            System.out.print("\n");

        }
    }
}
//              * 
//           *  * 
//        *  *  * 
//     *  *  *  * 
//  *  *  *  *  * 