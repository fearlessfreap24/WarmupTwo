//Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//
//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"
//stringSplosion("ab") → "aab"


public class StringSplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSplosion start = new StringSplosion();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Code", "abc", "ab" };
		
		for ( String i : strs ) {
			System.out.println(String.format("str = %s : %s", i, stringSplosion(i)));
		}
	}

	private Object stringSplosion(String str) {
		// TODO Auto-generated method stub
		String stringpsplosion = "";
		
		for ( int i = 0; i < str.length(); i++ ) {
			stringpsplosion = stringpsplosion + str.substring(0,i+1);
		}
		return stringpsplosion;
	}

}
