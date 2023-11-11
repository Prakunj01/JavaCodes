import java.util.*;

//                               Recursion part 2
//                              Strictly Increasing Array
//                                 O (n)
public class class_18C{
 
    public static int first = -1;
    public static int last = -1;
    
    public static boolean Strictlysort(int arr[],int index){
            
            if(index == arr.length-1){
                return true;
            }

            if(arr[index] < arr[index +1]){

                return Strictlysort(arr,index+1);
            }
            else{
                return false;
            }
              
            // if(arr[index] >= arr[index +1]){
            //     return false
            // }
            // 
            // return Strictlysort(arr,index+1);
            
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Strictlysort(arr,0));

    }
}