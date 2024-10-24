package m1.striver.java.maths;
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class LcmAndHcf {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            LcmHcf ob = new LcmHcf();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class LcmHcf {
     static Long[] lcmAndGcd(Long A , Long B) {
        // Find GCD using Euclidean algorithm
        Long gcd = findGCD(A, B);
        
        // LCM formula: (A * B) / GCD(A, B)
        Long lcm = (A * B) / gcd;
        
        Long arr[] = {lcm, gcd};
        return arr;
    }
    
    // Helper function to calculate GCD using the Euclidean algorithm
    static Long findGCD(Long A, Long B) {
        if (B == 0) {
            return A;
        }
        return findGCD(B, A % B);
    }
};