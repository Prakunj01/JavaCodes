import java.util.*;
public class class_03{

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Check number even or odd : ");

        int num = sc.nextInt();

        if(num %2==0){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");

        }
    }    
}