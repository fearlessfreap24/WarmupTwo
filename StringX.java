//Given a string, return a version where all the "x" have 
//been removed. Except an "x" at the very start or end 
//should not be removed.
//
//
//stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"


public class StringX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringX start = new StringX();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "xxHxix", "abxxxcd", "xabxxxcdx" };
		
		for ( String i : strs ) {
			System.out.printf("str = %s : %s\n", i, stringX(i));
		}
	}

	private String stringX(String str) {
		// TODO Auto-generated method stub
		String stringx = "";
		String[] strSplit = str.split("");
		
		for ( int i = 0; i < str.length(); i++ ) {
			if ( i != 0 && i != str.length() - 1 ) {
				if ( strSplit[i].equals("x")){
					continue;
				}
				else {
					stringx = stringx + strSplit[i];					
				}
			}
			else {
				stringx = stringx + strSplit[i];				
			}
		}
		return stringx;
	}

}
