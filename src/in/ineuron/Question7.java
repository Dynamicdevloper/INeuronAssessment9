package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printPermutation("ABC");
		
	}

	private static void printPermutation(String str) {
		// TODO Auto-generated method stub
		char[] arr= str.toCharArray();
		int n=str.length();
		
		generatePermutation(arr, 0, n-1);
		
	}

	private static void generatePermutation(char[] arr, int i, int j) {
		
		if(i==j) {
			System.out.println(new String(arr));
		}else {
			for(int k=i; k<=j; k++) {
				swap(arr, i, k);
				generatePermutation(arr, i+1, j);
				swap(arr, i, k);
			}
		}
		
	}

	private static void swap(char[] arr, int i, int k) {
		
		char temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
		
	}

}
