package m1.striver.java.basics;
//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class PassByVR {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution6 obj = new Solution6();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution6 {
    static int[] passedBy(int a, int b) {
        
        int [] arr={a+1,b+2};
        
        
      
        return arr;
    }
}
