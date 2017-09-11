import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int numOfStrings = sc.nextInt();
        String underConsideration;
        HashMap<String ,Integer> hm =  new HashMap<String, Integer>();
        
        for(int i=0; i < numOfStrings; i++){
            underConsideration = sc.next();
            
            if(hm.containsKey(underConsideration)){
                hm.put(underConsideration, hm.get(underConsideration)+1);
            }else{
                hm.put(underConsideration, 1);
            }
        }
        
        int numOfQueries = sc.nextInt();
        
        for(int i = 0; i < numOfQueries; i++){
            underConsideration = sc.next();
            
            if(hm.containsKey(underConsideration)){
                System.out.println(hm.get(underConsideration));
            }else{
                System.out.println(0);
            }
        }
    }
}