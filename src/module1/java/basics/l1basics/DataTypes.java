package module1.java.basics.l1basics;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class DataTypes {
 public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     while (T-- > 0) {
         sc.nextLine();
         String s = sc.next();
         Solution obj = new Solution();
         int ans = obj.dataTypeSize(s);
         String Character = "Character";
         if (Character.equals(s) && ans == 2) {
             ans = 1;
         }
         System.out.println(ans);
     }
 }
}

//} Driver Code Ends


//User function Template for Java

class Solution {
 static int dataTypeSize(String str) {
     // code here
     if(str.equals("Character")){
         return 1;
     }else if(str.equals("Integer")){
         return 4;
     }else if(str.equals("Long")){
         return 8;
     }else if(str.equals("Float")){
         return 4;
     }else if(str.equals("Double")){
         return 8;
     }else{
         return -1;
     }
 }
}
