import java.util.Arrays;

/*
 *  In this class we will test to see if two words are anagrams i.e. contain the exact same letters
 */

public class Anagram {

	public static boolean AnagramChecker(String word, String anagram) {

		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();

		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);

	}

	public static boolean isAnagram(String word, String anagram) {

		if (word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();

		for (char c : chars) {

			int index = anagram.indexOf(c);

			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			}

			else {
				return false;
			}
		}

		return anagram.isEmpty();
	}

public static void main(String[] args) {
	
	System.out.println(Anagram.AnagramChecker("mary", "army"));
	System.out.println(Anagram.AnagramChecker("tops", "stop"));
	
	System.out.println(Anagram.isAnagram("mary", "army"));
}

}