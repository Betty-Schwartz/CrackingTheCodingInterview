package chapter1;

public class ReplaceSpacesWithString {
	
	public void  replaceSpaces (char[] originalStringasCharArray, int length){
		
		int spaceCount = 0;
		int newLength;
		int i = 0;
		
		for (i = 0; i < length; i++){
			if (originalStringasCharArray[i] == ' ') {
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount * 3;
		
		char[] newCharArray = new char[newLength];  // must create a new Array in Java as they do not automatically grow
		
		newCharArray[newLength - 1] = '\0';
		newLength = newLength - 1;
		for ( i = length - 1; i >= 0; i--){
			if (originalStringasCharArray[i] == ' '){
				newCharArray[newLength - 1]=  '0';
				newCharArray[newLength - 2] = '2';
				newCharArray[newLength - 3] = '%';
				newLength = newLength - 3;
			}else {
				newCharArray[newLength - 1] = originalStringasCharArray[i];
				newLength = newLength - 1;
			}	
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String originalString = "Cracking the Coding Interview by Gayle Laakmann McDowell";
		char [] stringArray = originalString.toCharArray();
		int stringLength = originalString.length();
		ReplaceSpacesWithString replaceTheSpaces = new ReplaceSpacesWithString();
		replaceTheSpaces.replaceSpaces (stringArray, stringLength);
		

	}

}
