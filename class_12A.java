import java.util.*;
//                                     STRING Compare function
public class class_12A{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
       String name1 = "tony";
       String name2 = "tony";

        // name1 > name  : +ve value
        // name1 = name  : 0 value
        // name1 < name  : -ve value

       if(name1 .compareTo(name2) == 0){
            System.out.println(" String are equal ");
       }
       else{
             System.out.println(" NOT equal ");
       }
        

    // it will fail in same cases
    // if(name1 == name2){   
    //         System.out.println(" String are equal ");
    //    }
    // else{
    //          System.out.println(" NOT equal ");
    //    }


    // more in String builder    (example of fail case)
    // if(new String ("TONy") == new String ("TONy")){
    //         System.out.println(" String are equal ");
    //    }
    // else{
    //          System.out.println(" NOT equal ");
    //    }

    }
} 