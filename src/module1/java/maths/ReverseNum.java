package module1.java.maths;
public class ReverseNum {
    public static int reverse(int x) {
        long rev=0;
       if(x<0){
           
           while(x<0){
            int rem=x%10;
            rev=rev*10-rem;
          if(rev==0){
                x=x/10;
          }else{
                x=x/10;
          }
           }
           if(rev<Math.pow(-2,31) || rev>Math.pow(2,31) )
            return 0;
        else 
            return (int)(-1*rev);
       }else{
            while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
             if(rev==0){
                x=x/10;
          }else{
                x=x/10;
          }
        }
             if(rev<Math.pow(-2,31) || rev>Math.pow(2,31) )
            return 0;
        else 
            return (int)rev;
       }
    }  
    
    public static void main(String [] args) {
    	
    	System.out.println(reverse(123));
    	System.out.println(reverse(-123));
    	
    	
    }
   
}