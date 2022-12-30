package Easy;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Given an array of integers, find the sum of all elements.
		
		int[] arr = {12, 4,5, 45, 6723 ,632};
		int[] arr1 = {14, 6, 67, 2 , 78, 90, 24, 3};
		
		int totalOfArr = totalSumOfArray(arr);
		int totalOfArr1 = totalSumOfArray(arr1);
		
		System.out.println(totalOfArr);
		System.out.println(totalOfArr1);
		
		
		
		
	}

	public static int totalSumOfArray(int[] arrayOfNums) {
		int arrayTotal = 0;
		for(int x: arrayOfNums) {
			 arrayTotal += x;
		}
		return arrayTotal;
		
	}
}
