import java.util.*;
//                            Selection Sort
//                            O (n^2)
public class class_16A{

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

        for(int i=0; i<arr.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[smallest] > arr[j]){
                    smallest =j;
                }
            }
            // Swap
                    int temp = arr[smallest];
                    arr[smallest]=arr[i];
                    arr[i]=temp;
        }

        printarr(arr);
    }
}