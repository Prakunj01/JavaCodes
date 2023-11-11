import java.util.*;
//                                     STRING SubString function
public class class_12{

        //    String are Immutable

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
       
        String sentance = "My name is Prakunj";
                    //     0123456789
        // substring function (begging index , ending index)   (less then ending index)
        String substr1 = sentance.substring(0,7);
        String substr2 = sentance.substring(8);
        String substr3 = sentance.substring(3,10);
        String substr4 = sentance.substring(11,sentance.length());

        System.out.println(substr1);            
        System.out.println(substr2);            
        System.out.println(substr3);            
        System.out.println(substr4);            


    }
} 