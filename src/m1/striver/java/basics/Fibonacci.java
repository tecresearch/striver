package m1.striver.java.basics;

public class Fibonacci {
	
	public static int fib(int n){
		int a=0;
		int b=1;
		int next = 0;
		
		if(n==1 || n==2){
			return 1;
		}else {
			for(int i=2; i<=n; i++) {
				next=a+b;
				a=b;
				b=next;
			}
			return next;

		}
//		return fib(n-1)+fib(n-2);

				
		
		


	}
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		int ans=fib(n);
		System.out.println(ans);



		
	}
}
