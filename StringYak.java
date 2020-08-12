//Suppose the string "yak" is unlucky. Given a string, 
//return a version where all the "yak" are removed, but 
//the "a" can be any char. The "yak" strings will not overlap.
//
//
//stringYak("yakpak") → "pak"
//stringYak("pakyak") → "pak"
//stringYak("yak123ya") → "123ya"


public class StringYak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringYak start = new StringYak();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "yakpak", "pakyak", "yak123ya" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, stringYak(str));
		}
	}

	private String stringYak(String str) {
		// TODO Auto-generated method stub
		String stringyak = "";
		
		String[] strSplit = str.split("");
		
		for ( int i = 0; i < strSplit.length; i++ ) {
			if ( i + 2 < strSplit.length) {
				if (strSplit[i].equals("y") && strSplit[i+2].equals("k")) {
					i += 2;
				}
				else stringyak = stringyak + strSplit[i];
			}
			else stringyak = stringyak + strSplit[i];
				
		}
		
		return stringyak;
	}

}
