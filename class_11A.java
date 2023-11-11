import java.util.*;
//                                     2D ARRAY search
public class class_11A{



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr2d[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            arr2d[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // System.out.print(arr2d[i][j]+" ");
                if(key == arr2d[i][j]){
                    System.out.print(i + " , " + j);
                }
            }
            System.out.println("");
        }
    }
}