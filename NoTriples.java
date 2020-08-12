import java.util.Arrays;

//Given an array of ints, we'll say that a triple is a value 
//appearing 3 times in a row in the array. Return true if the 
//array does not contain any triples.
//
//noTriples([1, 1, 2, 2, 1]) → true
//noTriples([1, 1, 2, 2, 2, 1]) → false
//noTriples([1, 1, 1, 2, 2, 2, 1]) → false


public class NoTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoTriples start = new NoTriples();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] input = { {1, 1, 2, 2, 1}, {1, 1, 2, 2, 2, 1}, {1, 1, 1, 2, 2, 2, 1} };
		for (int[] nums : input) {
			System.out.printf("nums = %s : %b\n", Arrays.toString(nums), noTriples(nums));
		}
	}

	private boolean noTriples(int[] nums) {
		// TODO Auto-generated method stub
		
		for ( int i = 0; i < nums.length - 2; i++ ) {
			if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
				return false;
			}
		}
		return true;
	}

}
