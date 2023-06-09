package in.ineuron;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int n=2;
		
		int ans= power(x,n);
		System.out.println(ans);
	}

	private static int power(int x, int n) {
		
		if(n==1) return x;
		
		return x*power(x, n-1);
	}

}
