import java.util.*;
public class class_06D{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=0 ; i<n; i++){

            System.out.print("          "); 
            for(int j =1; j<=n-i+1; j++){
                System.out.print("   "); 
            }
            
            for(int j=1; j<=(2*i+1); j++){    
                System.out.print(" % "); 
            }
          
            System.out.println(); 

        }

        for(int i=n ; i>=0; i--){

            System.out.print("          ");
            for(int j=1; j<=n-i+1; j++){
                System.out.print("   "); 
            }
            
            for(int j=1; j<=(2*i+1); j++){    
                System.out.print(" % "); 
            }
          
            System.out.println(); 

        }
  
    }
}

























            //                  * 
            //               *  *  *
            //            *  *  *  *  *
            //         *  *  *  *  *  *  * 
            //      *  *  *  *  *  *  *  *  *
            //   *  *  *  *  *  *  *  *  *  *  *
            //      *  *  *  *  *  *  *  *  * 
            //         *  *  *  *  *  *  *
            //            *  *  *  *  *
            //               *  *  * 
            //                  *                                              