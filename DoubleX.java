//Given a string, return true if the first instance of "x" 
//in the string is immediately followed by another "x".
//
//
//doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true


public class DoubleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleX start = new DoubleX();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "axxbb", "axaxax", "xxxxx", "xaxxx", "aaaax", "", "abc", "x", "xx", "xax", "xaxx" };
		
		for (String i : strs) {
			System.out.println(String.format("str = %s : %b", i, doubleX(i)));
		}
	}

	private Object doubleX(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 2 ) return false;
		int wheresX = str.indexOf('x');
		if ( wheresX < 0 ) return false;
		if ( wheresX + 2 > str.length() ) return false;
		return str.charAt(wheresX) == 'x' && str.charAt(wheresX+1) == 'x';
	}

}
