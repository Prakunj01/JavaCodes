 import java.util.*;
//            Print all the subsets of the first n natural number
//                            O ( 2^n )
 public class class_19D{

    public static void PrintSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset){

        if(n==0){
            PrintSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n-1,subset);

        subset.remove(subset.size()-1);
        findSubset(n-1,subset);

        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n,subset);
    }
 }