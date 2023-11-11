import java.util.*;

//                                Recursion part 3
//                        Count total paths in maze to move from (0,0) to (n,m)
//                                 O ( 2^(n*m) )
public class class_19A{
 
    public static int countPath(int i,int j,int n,int m ){

        if(i==n || j==n){
            return 0;
        }
        if(i==n-1 && j==n-1){
            return 1;
        }    
            int downPaths = countPath(i+1, j,n,m); 
            int rigthPath = countPath(i,j+1,n,m);
         
         return downPaths + rigthPath;
          
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(countPath(0,0,n,m));
    }
}