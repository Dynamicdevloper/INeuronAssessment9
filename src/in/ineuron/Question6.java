package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		int d=6;
		int n=5;
		int result= nthTerm(a,d,n);
		System.out.println(result);

	}

	private static int nthTerm(int a, int d, int n) {
		return a+nthTermHelper(a, d, n);

}

	private static int nthTermHelper(int a, int d, int n) {
		
		if(n==1) return 0;
		
		return d+nthTermHelper(a,d,n-1);
	}
}
