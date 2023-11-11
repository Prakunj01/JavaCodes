import java.util.*;
public class class_06B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m=2*n;
        for(int i=1 ; i<=n; i++){
            
            for(int j =1; j<=n-i; j++){
                System.out.print(" "); 
            }

            for(int j=1; j<=i; j++){    
                System.out.print(i+" "); 
                
            }
            
            // for(int j=1; j<=n; j++){    
            //     System.out.print(" * "); 
            // }
            System.out.println(); 

        }
  
    }
}

//          1 
//         2 2
//        3 3 3
//       4 4 4 4
//      5 5 5 5 5 
//     6 6 6 6 6 6
//    7 7 7 7 7 7 7
//   8 8 8 8 8 8 8 8 
//  9 9 9 9 9 9 9 9 9                                                  