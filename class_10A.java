import java.util.*;
//                                     ARRAY
public class class_10A{



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        for(int i=0; i<arr1.length; i++){
            if(key == arr1[i]){
                System.out.print(i);
                break;
            }
        }
    }
}