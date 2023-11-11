import java.util.*;
public class class_13{

    //                       STRING BUILDER

    public static void main(String args[]){
        
        StringBuilder sb = new StringBuilder("ztony");
        System.out.println(sb);

        // char at any index
        System.out.println(sb.charAt(0));

        // set/replace char at any index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insertion of element
        sb.insert(0,'K');
        System.out.println(sb);

        // deletion of element
        sb.delete(3,5);
        System.out.println(sb);

        // Append function
        sb.append("e")

    }
}