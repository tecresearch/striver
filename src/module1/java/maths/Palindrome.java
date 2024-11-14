package module1.java.maths;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
       while(x>0){
           int rem=x%10;
           sum=sum*10+rem;
           x=x/10;
       }
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String [] agr) {
    	System.out.println(isPalindrome(123));
    	System.out.println(isPalindrome(121));
    	System.out.println(isPalindrome(-121));
    }
}