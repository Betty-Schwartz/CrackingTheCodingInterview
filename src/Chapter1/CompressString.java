package chapter1;

// Problem 1.5 Cracking the Coding Interview Fifth Edition

public class CompressString {
	
	private String compress (String str){
		// check if compression would create a longer string
		int size = countCompression(str);
		if (size >= str.length()){
			return str;
		}
		
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for ( int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) { // Found repeated char
				count++;
			} else { // Insert char count, and update last char
			  mystr.append(last);  // Insert char
			  mystr.append(count); // INsert count
			  last = str.charAt(i);
			  count = 1;
			}
		}
		mystr.append(last);     // Insert char
	    mystr.append(count);    // Insert count
		return mystr.toString();
	}
	
	private int countCompression (String str){
		char last = str.charAt(0);
		int size  = 0;
		int count = 1;
		for ( int i = 1; i < str. length(); i++) {
			if (str.charAt(i) == last) {
				count++;		
			}else{
				last  = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;				
			}				
		}		
		size += 1 + String.valueOf(count).length();
		return size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompressString compressString = new CompressString();
		String newString = compressString.compress("aabbaccbbbaaaaa");
		System.out.println ("String after compression: " + newString);

	}

}
