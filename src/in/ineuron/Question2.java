package in.ineuron;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1
		int n=100;
		System.out.println(n*(n+1)/2);
		
		//method2
		System.out.println(sumOfNaturalNumbes(100));
	}
	
	public static int sumOfNaturalNumbes(int n) {
		if(n==0) return 0;
		
		return n+sumOfNaturalNumbes(n-1);
	}

}
