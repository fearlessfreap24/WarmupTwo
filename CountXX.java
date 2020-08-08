//Count the number of "xx" in the given string. We'll say that 
//overlapping is allowed, so "xxx" contains 2 "xx".
//
//
//countXX("abcxx") → 1
//countXX("xxx") → 2
//countXX("xxxx") → 3


public class CountXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountXX start = new CountXX();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "abcxx", "xxx", "xxxx" };
		
		for ( String i : strs ) {
			System.out.println(String.format("str = %s : %d", i, countXX(i)));
		}
	}

	private int countXX(String str) {
		// TODO Auto-generated method stub
		int countxx = 0;
		
		if ( str.length() < 2 ) return countxx;
		
		for ( int i = 0; i < str.length() - 1; i++ ) {
			if ( str.charAt(i) == 'x' && str.charAt(i+1) == 'x' ) {
				countxx++;
			}
		}
		
		return countxx;
	}

}
