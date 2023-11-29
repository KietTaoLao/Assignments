public class SumArray {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided.");
            return;
        }

        String input = args[0];
        int sum = 0;
        int number=0;
        boolean isNegative = false;

        for (int i = 0; i < input.length(); i++) {
    	    	
		//retrieve character i from the string input
		char ch = input.charAt(i);

            	if (ch == '-') {
                	isNegative = true;
            	
		} else if (ch >= '0' && ch <= '9') {
                	//Convert char --> int 
			int convert  = ch - '0';
				
                	number = convert;
            	
		} else if (ch == ',') {
                	if (isNegative) {
                    	number = -number;
                    	isNegative = false;
                	}
		sum += number;
                number = 0;
            	}
        }
	
	System.out.println("number : " + number);
	
        //Process the last number
        if (isNegative) {
            number = -number;
        }
        sum += number;

        System.out.println("Sum of the numbers: " + sum);
    }
}

