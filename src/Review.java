import java.util.Arrays;

public class Review {
	public static void main(String[] args) {
		String sentence = "Hello,  name. I hope you are doing great.";
		//String word = "Maria";
		//String sentence2 = sentence.replace("name", word);
		//System.out.println(sentence2);
		String firstWord = "";
		
		String [] words = sentence.split(" ");
		System.out.println(words[words.length-1]);
		
	}
}
