import java.util.*;
public class class_06A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m=2*n;
        for(int i=1 ; i<=n; i++){
            // loop for space
            for(int j=(n-i+1); j>=1; j--){    
                System.out.print("   "); 
            }
            // loop for star
            for(int j=1; j<=n; j++){    
                System.out.print(" * "); 
            }
            System.out.println(); 

        }
  
    }
}

    //                            *  *  *  *  *  *  *  *  *  * 
    //                         *  *  *  *  *  *  *  *  *  *    
    //                      *  *  *  *  *  *  *  *  *  * 
    //                   *  *  *  *  *  *  *  *  *  *    
    //                *  *  *  *  *  *  *  *  *  *       
    //             *  *  *  *  *  *  *  *  *  * 
    //          *  *  *  *  *  *  *  *  *  * 
    //       *  *  *  *  *  *  *  *  *  * 
    //    *  *  *  *  *  *  *  *  *  *    
    // *  *  *  *  *  *  *  *  *  *                                                     