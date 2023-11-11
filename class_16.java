import java.util.*;
//                            Bubble Sort
//                            O (n^2)

public class class_16{

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

        for(int j=0; j<arr.length-1; j++){
            for(int i=0; i<arr.length-j-1; i++){

                if(arr[i] > arr[i+1]){
                    // Swap
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        printarr(arr);
    }
}