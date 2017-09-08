import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner reader = new Scanner(System.in);
        int leng = reader.nextInt();
        reader.nextLine();
        int[] input = new int[leng];
        for(int i =0 ; i < leng; i++){
            input[i] = reader.nextInt();
        }
        
        for(int j=input.length - 1; j>=0;j--){
            System.out.print(input[j]+" ");    
        }    
    }
}