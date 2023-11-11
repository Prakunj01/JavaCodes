import java.util.*;

//                               Recursion part 2
//                                1st and last occurance of an element String 
//                                 O (n)
public class class_18B{
 
    public static int first = -1;
    public static int last = -1;
    
    public static void find(String n ,int index, char key){
            
        if(index == n.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = n.charAt(index);
        if( currChar == key){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
          }
            
            find(n,index+1,key);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int index = 0; 
        char key = sc.next().charAt(0);
        
        find(n,index,key);

    }
}