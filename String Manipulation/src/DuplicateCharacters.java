import java.util.HashMap;
import java.util.Map;

/*
 *  In this class we are going to create a method that tracks characters appearing in a word and prints out any 
 *  characters appearing more than once
 */

public class DuplicateCharacters {
	
	public void printDuplicateCharacters(String word) {
		
		char[] chars = word.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch: chars) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: charMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
	}

	public static void main(String[] args) {
		
		DuplicateCharacters dc = new DuplicateCharacters();
		
		dc.printDuplicateCharacters("Cacophony");
		System.out.println("---------------------");
		dc.printDuplicateCharacters("Exacerbate");
		
	}

}
