import java.util.Arrays;

//Given 2 strings, a and b, return the number of the positions 
//where they contain the same length 2 substring. So "xxcaazz" 
//and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
//substrings appear in the same place in both strings.
//
//
//stringMatch("xxcaazz", "xxbaaz") → 3
//stringMatch("abc", "abc") → 2
//stringMatch("abc", "axc") → 0


public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMatch start = new StringMatch();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] inputs = { {"xxcaazz", "xxbaaz"}, {"abc", "abc"}, {"abc", "axc"} };
		
		for ( String[] i : inputs) {
			System.out.printf("inputs = %s : %d\n", Arrays.toString(i), stringMatch(i[0], i[1]));
		}
	}

	private int stringMatch(String a, String b) {
		// TODO Auto-generated method stub
		int count = 0;
		
		if (a.length() < 2 || b.length() < 2) return count;
		
		String[] aSplit = a.split("");
		String[] bSplit = b.split("");
		
		if ( a.length() < b.length() ) {
			for ( int i = 0; i < a.length() - 1; i++ ) {
				if ( aSplit[i].equals(bSplit[i]) && aSplit[i+1].equals(bSplit[i+1])) count++;
			}
		}
		else {
			for ( int i = 0; i < b.length() - 1; i++ ) {
				if ( aSplit[i].equals(bSplit[i]) && aSplit[i+1].equals(bSplit[i+1])) count++; 
			}
		}
		return count;
	}

}
