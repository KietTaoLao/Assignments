public class WordCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided.");
            return;
        }

        String input = args[0];
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

		if (ch >= '0' && ch <= '9') {
			continue;
		}	
		 else {
                	wordCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
    }
}

