package chapter1;

public class Permutation {
	
	
	public static boolean isPermutation (String string1, String string2){
		if ( string1.length() != string2.length()){
			return false;
		}
		char [] letters = new char[256];
		
		int num_unique_chars = 0;
		int num_completed_string2 = 0;
		char[] string1_array = string1.toCharArray();
		for (char c: string1_array){  // count number of each characters in string1_array
			if (letters[c] == 0){
				++num_unique_chars;
			}
			++letters[c];
		}
		for (int i = 0; i < string2.length(); ++i) {  // process second string
			int c = (int) string2.charAt(i);
			if (letters[c] == 0) { // Found more of char c in string2 than in string1.
				return false;
			}
			--letters[c];  // decrease count of char c in letters array
			if (letters[c] == 0) {
				++num_completed_string2;
				if (num_completed_string2 == num_unique_chars) {
					// it ’s a match if string2 has been processed completely
					return i == string2.length() - 1;
				}
			}
		}
			
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {String word1 = pair[0];
		String word2 = pair[1];
		boolean permutation = isPermutation(word1, word2);
		System.out.println(word1 + ", " + word2 + ": " + permutation);

	}
	}
}

