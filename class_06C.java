import java.util.*;
public class class_06C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m=2*n;
        int k=1;
        for(int i=1 ; i<=n; i++){
            
            for(int j =1; j<=n-i; j++){
                System.out.print(" "); 
            }
            k=i;
            for(int j=1; j<=i; j++){    
                System.out.print(k); 
                k--;
            }
            k++;
            for(int j=1; j<=i-1; j++){    
                System.out.print(++k); 
            }
            System.out.println(); 

        }
  
    }
}

//         1
//        212
//       32123
//      4321234
//     543212345
//    65432123456
//   7654321234567
//  876543212345678
// 98765432123456789                                                