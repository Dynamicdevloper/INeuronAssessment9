package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1, -42, 36, -5, -4,8, 6};
		int ans=maximumElement(arr,0);
		System.out.println(ans);
	}

	private static int maximumElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		
		if(i==arr.length) return 0;
		
		int max=arr[i];
		
		int max2= maximumElement(arr, i+1);
		
		
		return Math.max(max, max2);
	}
	
	

}
