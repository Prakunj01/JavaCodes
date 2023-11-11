import java.util.*;
//                                     ARRAY
public class class_10{



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
            // arr1[i] = i;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr1[i]);
        }
    }
}