import java.util.Arrays;

//Given an array of ints, return true if the sequence of 
//numbers 1, 2, 3 appears in the array somewhere.
//
//
//array123([1, 1, 2, 3, 1]) → true
//array123([1, 1, 2, 4, 1]) → false
//array123([1, 1, 2, 1, 2, 3]) → true


public class Array123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array123 start = new Array123();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] nums = { {1, 1, 2, 3, 1}, {1, 1, 2, 4, 1}, {1, 1, 2, 1, 2, 3} };
		for ( int[] i : nums ) {
			System.out.printf("Nums = %s : %b\n", Arrays.toString(i), array123(i));
		}
	}

	private boolean array123(int[] nums) {
		// TODO Auto-generated method stub
		if (nums.length < 3) return false;
		
		for ( int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
				return true;
			}
		}
		return false;
	}

}
