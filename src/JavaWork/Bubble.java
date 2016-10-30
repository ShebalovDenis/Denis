package JavaWork;

public class Bubble {
	public static void doAlgoritm(int[] arr)
    {	
	for(int i = 0; i < arr.length-1; i++){
		for(int j = i+1 ; j < arr.length-1; j++){
			if (arr[i]>arr[j]){
			arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);			
			}
		}
		System.out.print(arr[i]+ " ");
	}
	
		
	}
}
