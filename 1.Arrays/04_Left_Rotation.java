import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int inputSize = scan.nextInt();
        
        int numRotate = scan.nextInt();
        
        int start = numRotate ;
        int[] arr = new int[inputSize];
        int[] res = new int[inputSize];
        scan.nextLine();
        
        for(int i =0; i< inputSize; i++){
            arr[i] = scan.nextInt();
        }
        
        int k = 0;
        while(k  < inputSize){
            res[k] = arr[start];
            k++;
            start = (start + 1)%inputSize;
        }
        
        for(int i =0; i< inputSize; i++){
            System.out.print(res[i]+" ");
        }
    }
}