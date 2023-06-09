package in.ineuron;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		boolean ans=false;
		ans=isPowerOfTwo(num);
		System.out.println(ans);
			
	}

	private static boolean isPowerOfTwo(int num) {
		int ans=2;
		while(ans<num) {
			ans*=2;
		}
		
		if(ans==num) return true;
		return false;
	}

}
