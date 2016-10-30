package JavaWork;

public class Bubble {
	public static void main(String[] args){
		int[] arr = new int[10];
		
		 
		 for(int i = 0; i < arr.length; i++){
		   arr[i] = (int)(Math.random()*100); // это случайными 100
		  // System.out.println(arr[i]);
		}
		
		doAlgoritm(arr);
		
		
		}
	
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
