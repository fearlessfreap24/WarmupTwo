import java.util.Arrays;

//Given an array of ints, return true if one of the first 4 
//elements in the array is a 9. The array length may be less than 4.
//
//
//arrayFront9([1, 2, 9, 3, 4]) → true
//arrayFront9([1, 2, 3, 4, 9]) → false
//arrayFront9([1, 2, 3, 4, 5]) → false


public class ArrayFront9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayFront9 start = new ArrayFront9();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] nums = { {1, 2, 9, 3, 4}, {1, 2, 3, 4, 9}, {1, 2, 3, 4, 5} };
		
		for ( int[] i : nums ) {
			System.out.printf("num = %s : %b\n", Arrays.toString(i), arrayFront9(i));
		}
	}

	private boolean arrayFront9(int[] nums) {
		// TODO Auto-generated method stub
		for ( int i = 0; i < nums.length; i++ ) {
			if ( i > 3 ) break;
			if ( nums[i] == 9 ) return true;
		}
		
		return false; 
	}

}
