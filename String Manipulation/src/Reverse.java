/*
 *  In this class I am going to create various methods which reverse a String (a singl word) entered by the user.
 */

public class Reverse {
	
	//In this first method we will simply loop through the String and concatenate our new reversed word
	
	public String reverseWordMethod1(String word) {
		
		String reversedWord = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}
		
		return reversedWord;
	}
	
	//In this second method we will use the string builder class as it has its own reverse function
	public void reverseWordMethod2(String word){
		
		StringBuilder sb = new StringBuilder();
		 
        // append a string into StringBuilder sb
        sb.append(word);
 
        // reverse StringBuilder sb
        sb = sb.reverse();
 
        // print reversed String
        System.out.println(sb);
	}
	
	//In this third method we will use a char[] array to reverse the String
	public String reverseWordMethod3(String word) {
		
		String reversedWord = "";
		
		char[] charOfWord = word.toCharArray();
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += charOfWord[i];
		}
		
		return reversedWord;
	}
	
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverseWordMethod1("Hello"));
		reverse.reverseWordMethod2("Goodbye");
		System.out.println(reverse.reverseWordMethod3("My name is Jack"));
		
	}

}
