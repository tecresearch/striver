package module1.java.basics.l1basics;

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;

public class CompareToNum {
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t;
      t = Integer.parseInt(br.readLine());
      while(t-- > 0){
          
          int n;
          n = Integer.parseInt(br.readLine());
          
          
          int m;
          m = Integer.parseInt(br.readLine());
          
          Solution2 obj = new Solution2();
          String res = obj.compareNM(n, m);
          
          System.out.println(res);
          
      }
  }
}


//} Driver Code Ends
//User function Template for Java
class Solution2 {
  public static String compareNM(int n, int m) {
      // code here
     if(n<m)
          return "lesser";
  else if(n==m)
          return "equal";
  else
          return "greater";
  }
}

//{ Driver Code Starts.

//} Driver Code Ends