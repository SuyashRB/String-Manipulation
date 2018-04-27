
public class Palindrome {

	
	public static boolean palindromeChecker(String word) {
		
		boolean palindrome = false;
		
		String invertedWord = "";
		
		char[] chars = word.toCharArray();
		
		for(int i = word.length() - 1; i >= 0; i--) {
			invertedWord += chars[i];
		}
		
		if(invertedWord.equalsIgnoreCase(word)) {
			palindrome = true;
		}
		else {
			palindrome = false;
		}
		
		return palindrome;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Palindrome.palindromeChecker("racecar"));
		System.out.println(Palindrome.palindromeChecker("Hannah"));
		
	}
	
}
