import java.util.*;
public class class_03A{

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        int num = sc.nextInt();

        switch (num){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            default : System.out.println("Invalid");
        }
    }    
}