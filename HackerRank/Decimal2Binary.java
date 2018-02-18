package Day30Code;
/**Today, we're working with binary numbers. 
Task 
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format
A single integer, .
Constraints
Output Format
Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of n.

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Sample Case 1: 
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2: 
The binary representation of  is , so the maximum number of consecutive 's is .
**/

import java.io.*;
import java.util.*;

public class Decimal2Binary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Integer.toBinaryString(n) 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String st = Integer.toBinaryString(num);
        
        char[] ar = st.toCharArray();
        int count = 0, s =0, next =0;
        int[] result = new int[ar.length];
        
        for(int l = 0; l<ar.length; l++) // memory tip: length property of char array has no brackets!!
        {   
            if(ar[l] == '0')
                {
                    result[s] = count;
                    count = 0;
                    s++;
                }
            else
                {
                    count++;
                }
        }
       // find the max num in this array
        int ans = result[0];// first element to be compared with
        for(int i=1; i< result.length; i++)
        {
             if(result[i] > ans)
                    ans = result[i];
        }
        System.out.println(ans);
        
    }
}