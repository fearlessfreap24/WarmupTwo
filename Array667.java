import java.util.Arrays;

//Given an array of ints, return the number of times that 
//two 6's are next to each other in the array. Also count 
//instances where the second "6" is actually a 7.
//
//array667([6, 6, 2]) → 1
//array667([6, 6, 2, 6]) → 1
//array667([6, 7, 2, 6]) → 1


public class Array667 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array667 start = new Array667();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] numss = { {6, 6, 2}, {6, 6, 2, 6}, {6, 6, 2, 6} };
		for (int[] nums : numss) {
			System.out.printf("nums = %s : %d\n", Arrays.toString(nums), array667(nums));
		}
	}

	private int array667(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		for ( int i = 0; i < nums.length - 1; i++ ) {
			if ( nums[i] == 6 && ( nums[i + 1] == 6 || nums[i + 1] == 7 ) ) {
				count++;
			}
		}
		return count;
	}

}
