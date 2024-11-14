package module1.java.basics;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class SwitchCase{
 public static void main(String args[])throws IOException
 {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(in.readLine());
     while(t-- > 0){
         int choice = Integer.parseInt(in.readLine());
         String a[] = in.readLine().trim().split("\\s+");
         List<Double> arr = new ArrayList<Double>();
         for(int i = 0;i < choice;i++)
             arr.add(Double.parseDouble(a[i]));
         
         Solution3 ob = new Solution3();
         if(choice == 1)
             System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
         else
             System.out.println((int)ob.switchCase(choice, arr));
     }
 }
}
//} Driver Code Ends


//User function Template for Java

class Solution3{
 
 
 static double switchCase(int choice, List<Double> arr){
     // code here
     double circle=0.0;
     double ractangle=0.0;
    
     switch(choice){
         case 1:
             return (arr.get(0)*arr.get(0)*Math.PI);
         case 2:
             return (arr.get(0)*arr.get(1));
     }
      if(choice==1){
         return circle;
     }else{
         return ractangle;
     }
      
      
//      
//      switch (choice) {
//      case 1:
//          // Area of the circle: π * r^2
//          area = arr.get(0) * arr.get(0) * Math.PI;
//          break;
//      case 2:
//          // Area of the rectangle: length * width
//          area = arr.get(0) * arr.get(1);
//          break;
//      default:
//          System.out.println("Invalid choice");
//          break;
//  }
//
//  return area;
 }
}
