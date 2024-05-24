package Practise;

public class LargestNumber {

	public static void main(String[] args) {
		
		//intialized the array
		int arr []= {24,73,102,55,23};
		
		//intialize the max value with first element of the array
		int max = arr [0];
		// loop
		for (int i = 0;i<arr.length;i++) {
		
         
		if (arr[i] > max)
        	 max = arr[i];
		}
		
		
		System.out.println("largest number is :" + max);

		
		// TODO Auto-generated method stub

	}
	

}
