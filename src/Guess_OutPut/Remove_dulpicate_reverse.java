package Guess_OutPut;

public class Remove_dulpicate_reverse {

	public static void main(String[] args) {
		String str = "jaya";
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char currentChar = str.charAt(i);

			if (result.indexOf(currentChar) == -1) {
				result += currentChar;
			}
		}

		// Print the result string
		System.out.println(result);
	}
}
