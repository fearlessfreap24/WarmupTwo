//Given a string, return a new string made of every other 
//char starting with the first, so "Hello" yields "Hlo".
//
//
//stringBits("Hello") → "Hlo"
//stringBits("Hi") → "H"
//stringBits("Heeololeo") → "Hello"


public class StringBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBits start = new StringBits();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "Hi", "Heeololeo" };
		
		for ( String i : strs ) {
			System.out.println(String.format("str = %s : %s", i, stringBits(i)));
		}
	}

	private String stringBits(String str) {
		// TODO Auto-generated method stub
		String stringbits = "";
		
		for ( int i = 0; i < str.length(); i++) {
			if ( i % 2 == 0 ) {
				stringbits = stringbits + str.charAt(i);
			}
		}
		return stringbits;
	}

}
