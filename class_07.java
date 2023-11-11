import java.util.*;

public class class_07{
    public static void printName(String n1){
        System.out.println(n1);
        return;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        // String n1 = sc.nextLine();

        printName(n1);

    }


}