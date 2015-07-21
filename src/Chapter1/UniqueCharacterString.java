package Chapter1;

/* Implement an algorithm to determine if an ASCII string contains unique characters. 
 * This assumes there are only 256 unique characters which might not be true in some 
 * languages. 
 * What if you cannot use additional data structures? */

public class UniqueCharacterString {
	
	public boolean doesStringContainUniqueCharacters(String testString){
		if (testString.length() > 256){
			return false;
		}
		boolean [] charSet = new boolean[256];
		for ( int i = 0; i < testString.length(); i++){
			int val = testString.charAt(i);
			if (charSet[val]){ //This one was found previously
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UniqueCharacterString uniqueString = new UniqueCharacterString();
		boolean unique = uniqueString.doesStringContainUniqueCharacters("abcdefc");
		System.out.println ("Did the string contain unique characters? " + unique);
		

	}

}
