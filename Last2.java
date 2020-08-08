//Given a string, return the count of the number of times that 
//a substring length 2 appears in the string and also as the 
//last 2 chars of the string, so "hixxxhi" yields 1 (we won't 
//count the end substring).
//
//last2("hixxhi") → 1
//last2("xaxxaxaxx") → 1
//last2("axxxaaxx") → 2


public class Last2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Last2 start = new Last2();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
//		String[] strs = { "hixxhi", "xaxxaxaxx", "axxxaaxx", "xxaxxaxxaxx", "xaxaxaxx", "xxxx", "13121312", "11212", "13121311", "1717171", "hi", "h", "" };
		String[] strs = { "xxaxxaxxaxx" };
		
		for ( String i : strs ) {
			System.out.println(String.format("str = %s : %d", i, last2(i)));
		}
	}

	private int last2(String str) {
		// TODO Auto-generated method stub
		int lasttwo = 0;
		if ( str.length() < 2 ) return lasttwo;
		String last2chars = str.substring(str.length()-2);
		if ( str.indexOf(last2chars) == str.length()-2) return lasttwo;
		
		int strlen = str.length() - 2;
		int count = 0;
		while (count < strlen) {
			if ( str.startsWith(last2chars) ) {
				lasttwo++;
			}
			str = str.substring(1);
			count++;
		}
		
		
		return lasttwo;
	}

}
