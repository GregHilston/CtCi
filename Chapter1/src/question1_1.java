public class question1_1 {
	static boolean isStringMadeOfUniqueCharacters(String s) {
		int size = 128; // Number of unique characters in ASCII
		boolean []arr = new boolean[size]; // Initialized to false by default

		if(s.length() > size) {
			return false; // There must be a duplicate if the size is > than the number of unique characters
		}

		// Check each if each char appears in s more than once
		for(char c : s.toCharArray()) {
			if(arr[(int) c] == true) {
				return false; // duplicate found
			}

			arr[(int) c] = true; // Set that this char is in our string s
		}

		return true;
	}

	public static void main(String[] args) {
		String []testWords = {"cat", "door"};

		for(String s : testWords) {
			System.out.println("string " + s + " " + isStringMadeOfUniqueCharacters(s));
		}
	}
}