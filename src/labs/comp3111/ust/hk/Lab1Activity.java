package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int sum(int[] arr) {
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Sum of the number is " + sum(arr));
		System.out.println("Min = " + min(arr) + "; Max = " + max(arr));
	}
}
