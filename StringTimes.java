//Given a string and a non-negative int n, return a larger 
//string that is n copies of the original string.
//
//
//stringTimes("Hi", 2) → "HiHi"
//stringTimes("Hi", 3) → "HiHiHi"
//stringTimes("Hi", 1) → "Hi"


public class StringTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTimes start = new StringTimes();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1 };
		String str = "Hi";
		
		for ( int i : nums ) {
			System.out.println(String.format("num = %d : %s", i, stringTimes("Hi", i)));
		}
	}

	private String stringTimes(String str, int n) {
		// TODO Auto-generated method stub
		String strtimes = "";
		
		for ( int i = 0; i < n; i++ ) {
			strtimes = strtimes + str;
		}
		return strtimes;
	}

}
