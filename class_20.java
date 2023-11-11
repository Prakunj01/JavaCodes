import java.util.*;
//                            BACK TRACKING
//                             O( n*n! )
public class class_20{
    public static void prtPermutation(String str, String permutation ,int index){
        
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);

            prtPermutation(newstr,permutation + currchar,index+1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String str = sc.next();
        prtPermutation(str,"",0);
    }
}