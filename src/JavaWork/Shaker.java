package JavaWork;

public class Shaker {
	
	public static void Shaker1(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while (r > l) {
		for(int i = 0; i < r; i++) {
			if (arr[i] >= arr[i+1]) 
			arr[i]=arr[i]+arr[i+1]-(arr[i+1]=arr[i]);
		}
		r--;
		for(int j = r ; j > l; j--) {
			if (arr[j-1] >= arr[j]) 
				arr[j-1]=arr[j-1]+arr[j]-(arr[j]=arr[j-1]);
		}
		l++;
		}
}
}
