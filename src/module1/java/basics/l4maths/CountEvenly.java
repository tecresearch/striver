package module1.java.basics.l4maths;
//{ Driver Code Starts
//Initial Template for Java


import java.io.*;

class CountEvenly
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution7 ob = new Solution7();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends

//User function Template for Java


class Solution7{
    static int evenlyDivides(int N){
    	
    	
        // code here
        int count=0;
        int temp=N;
        try {
        while(N>0){
        	
            int rem=N%10;
            if(rem==0) {
            	  N=N/10;
            	continue;
            }
            if(temp%rem==0){
                 count++;
            }
            N=N/10;
            System.out.println(rem+" "+N);
        }
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
        return count;
    }
}