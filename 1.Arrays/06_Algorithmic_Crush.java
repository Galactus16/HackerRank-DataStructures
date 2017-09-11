import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] al = new long[n];
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            al = update(al,a-1,b,k);
        }
        in.close();
        
        System.out.println(findMax(al));
    }
    
    private static long[] update(long[] al, int a, int b, int k){
        
        /*Instead of storing the actual values in the array, you store the difference between the current element and the previous element. So you add sum to a[p] showing that a[p] is greater than its previous element by sum. You subtract sum from a[q+1] to show that a[q+1] is less than a[q] by sum (since a[q] was the last element that was added to sum). By the end of all this, you have an array that shows the difference between every successive element. By adding all the positive differences, you get the value of the maximum element*/
        al[a] += k;
        
        if(b < al.length){
            al[b] -= k;
        }
        
        return al;
    }
    
    private static long findMax(long[] al){
       long sum = 0;
       long max = Long.MIN_VALUE;
        
       for(long x : al){
           sum += x;
           if(max <= sum)
               max = sum;
       }
        
       return max;
    } 
    
}
