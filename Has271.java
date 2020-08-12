import java.util.Arrays;

//Given an array of ints, return true if it contains a 2, 7, 1 
//pattern: a value, followed by the value plus 5, followed by 
//the value minus 1. Additionally the 271 counts even if the "1" 
//differs by 2 or less from the correct value.
//
//has271([1, 2, 7, 1]) → true
//has271([1, 2, 8, 1]) → false
//has271([2, 7, 1]) → true


public class Has271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has271 start = new Has271();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] input = { {1, 2, 7, 1}, {1, 2, 8, 1}, {1, 2, 8, 1},
				{2, 7, -1}, {4, 5, 3, 8, 0}};
		for ( int[] nums : input ) {
			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), has271(nums));
		}
	}

	private boolean has271(int[] nums) {
		// TODO Auto-generated method stub
		for ( int i = 0; i < nums.length - 2; i++ ) {
			
			int plus5 = nums[i] + 5;
			int minus1 = nums[i] - 1;
			if ( nums[i+1] == plus5 
					&& nums[i+2] <= minus1 + 2
					&& nums[i+2] >= minus1 - 2) {
				return true;
			}
		}
		return false;
	}

}

// i = 2; i - 1 = 1