 import java.util.*;
 public class class_19B{
    public static int placeTile(int n , int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vert = placeTile(n-m,m);
        int hort = placeTile(n-1,m);

        return vert + hort;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(placeTile(n,m));

    }
 }