import java.util.*;
//                            Insertion Sort
//                            O (n^2)
public class class_16B{

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int arr[] = {7,8,3,1,2};
        printarr(arr);

        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current <arr[j]){

                arr[j+1] = arr[j];
                j--;
            }
            // Swap
                arr[j+1] = current;
        }

        printarr(arr);
    }
}