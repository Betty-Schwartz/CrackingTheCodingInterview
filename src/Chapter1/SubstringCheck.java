package chapter1;


// This is problem 8.1 in the Fifth Edition

public class SubstringCheck {
	
	public static boolean  isRotation(String s1,String s2) {
	    return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		String [][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}

}
