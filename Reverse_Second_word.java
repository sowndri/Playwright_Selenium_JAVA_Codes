package test;

public class Reverse_Second_word {

	public static void main(String[] args) {
		 String input = "Testing is complete";
	        String[] words = input.split(" ");

	     // Reverse the second word directly
	        words[1] = new StringBuffer(words[1]).reverse().toString();
	        
	        // Print the result
	        System.out.println(String.join(" ", words));
	}

}
