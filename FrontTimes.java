//Given a string and a non-negative int n, we'll say that the front 
//of the string is the first 3 chars, or whatever is there if the 
//string is less than length 3. Return n copies of the front;
//
//
//frontTimes("Chocolate", 2) → "ChoCho"
//frontTimes("Chocolate", 3) → "ChoChoCho"
//frontTimes("Abc", 3) → "AbcAbcAbc"


public class FrontTimes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontTimes start = new FrontTimes();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 3 };
		String[] strs = { "Chocolate", "Chocolate", "Abc" };
		
		for ( int i = 0; i < nums.length; i++ ) {
			System.out.println(String .format("str = %s : %s", strs[i], frontTimes(strs[i], nums[i])));
		}
		
	}

	private String frontTimes(String str, int n) {
		// TODO Auto-generated method stub
		String fronttimes = "";
		if ( str.length() > 2 ) {
			str = str.substring(0,3);
		}
		
		for ( int i = 0; i < n; i++ ) {
			fronttimes = fronttimes + str;
		}
		
		return fronttimes;
	}

}
