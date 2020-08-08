import java.util.Arrays;

//Given an array of ints, return the number of 9's in the array.
//
//
//arrayCount9([1, 2, 9]) → 1
//arrayCount9([1, 9, 9]) → 2
//arrayCount9([1, 9, 9, 3, 9]) → 3


public class ArrayCount9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCount9 start = new ArrayCount9();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] nums = { {1, 2, 9}, {1, 9, 9}, {1, 9, 9, 3, 9} };
		
		for ( int[] i : nums ) {
			String output = String.format("nums = %s : %d", Arrays.toString(i), arrayCount9(i));
			System.out.println(output);
		}
	}

	private Object arrayCount9(int[] nums) {
		// TODO Auto-generated method stub
		int count9 = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == 9 ) count9++;
		}
		return count9;
	}

}
