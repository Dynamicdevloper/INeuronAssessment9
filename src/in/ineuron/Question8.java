package in.ineuron;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4, 5};
		System.out.println(product(arr, 0));
	}
	
	public static int product(int[] arr, int i) {
		if(i==arr.length) return 1;
		
		return arr[i] * product(arr, i+1);
	}

}
