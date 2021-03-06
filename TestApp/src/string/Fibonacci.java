package string;
import java.util.Arrays;
import java.util.Hashtable;


public class Fibonacci {
	static int f[] = new int[8];

	public static void main(String[] args) {
		Arrays.fill(f,-1);
		System.out.println(fib(11));
		System.out.println(findFib(11));
	}
	
	public static int getFib(int n){
		
		if(n<0) return -1;
		else if(n==0) return 0;
		f[0] = 0;
		f[1] = 1;
		if(f[n]!=-1){
			return f[n];
		}
		
		else{
		for(int i = 2; i<=n; i++){
		
//				f[i] = f[i-1] + f[i-2];
				f[i] = getFib(i-1) + getFib(i-2);
			}
		}
		return f[n];
	}
	static int findFib(int n){
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=2; i<=n;i++){
			c = a+b;
			a = b;
			b = c;
		}
		
		return c;
	}
	
	public static int fib(int n){
		if(n<0) return -1;
		else if(n==0) return 0;
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		//f[2]  = 2;
		for(int i = 2; i<=n; i++){
			f[i] = f[i-1] + f[i-2];
			
		}
		return f[n];
	}
	
	
}
