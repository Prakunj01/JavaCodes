import java.util.*;
public class class_05G{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();
        int p=1;
        for(int i=1 ; i<=n; i++){
            for(int j=1; j<=i; j++){  // j=1; j<=n-i; j++
                    // System.out.print( " "+p+" ");
                if((i+j) %2==0){
                    System.out.print(" "+1+" "); 
                    
                }
                else{
                    System.out.print(" "+0+" ");
                    
                }
             
            }
            System.out.print("\n");

        }
    }
}
//  1
//  0  1
//  1  0  1
//  0  1  0  1
//  1  0  1  0  1
//  0  1  0  1  0  1
//  1  0  1  0  1  0  1
//  0  1  0  1  0  1  0  1
//  1  0  1  0  1  0  1  0  1
//  0  1  0  1  0  1  0  1  0  1