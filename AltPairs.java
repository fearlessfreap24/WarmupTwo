//Given a string, return a string made of the chars at indexes 
//0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//
//altPairs("kitten") → "kien"
//altPairs("Chocolate") → "Chole"
//altPairs("CodingHorror") → "Congrr"


public class AltPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AltPairs start = new AltPairs();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "kitten", "Chocolate", "CodingHorror" };
		
		for (String str : strs) {
			System.out.printf("str = %s : %s\n", str, altPairs(str));
		}
	}

	private Object altPairs(String str) {
		// TODO Auto-generated method stub
		String altpairs = "";
		
		String[] strSplit = str.split("");
		
		for ( int i = 0; i < strSplit.length; i++) {
			if ( i % 4 == 0 || i % 4 == 1 ) {
				altpairs = altpairs + strSplit[i];
			}
		}
		return altpairs;
	}

}
