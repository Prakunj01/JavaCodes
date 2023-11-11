import java.util.*;

//                               Recursion part 3
//                        Print all Permutation of the String
//                                 O ( n! )
public class class_19{
 
    public static void PermutationStr(String str, String permutation){

        if(str.length()== 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
                char curr = str.charAt(i);
                //  "abc"-> "ab"
                String newstr = str.substring(0,i)+ str.substring(i+1);
                PermutationStr(newstr,permutation+curr);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        PermutationStr(n,"");        


    
    }
}