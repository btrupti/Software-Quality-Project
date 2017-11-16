
/**
 * This class calculates sum of first n given digits of sequence 0,1,2,3,4....
 * for example if input is 0 then result is 0, for 3 result = 3, for 5 result is 10 and so on.
 * but there is a bug, when input is equal or greater than limit then recursiveAdd method is called
 * Recursively to generate StackOverFlow error
 */
public class FaultyRecurrence {
	
	private static int limit = 10;

	public static void main(String[] args) throws InterruptedException {
		
		int input = 5;
			System.out.println(recursiveAdd(0, input));

	}


	private static int  recursiveAdd(int i, int input) throws InterruptedException {
		
		Thread.sleep(1000);
		
		if(i >= input) {
			if(i>=limit)
				return i + recursiveAdd(i+1, input);
			
			return 0;
		}
			
		return i + recursiveAdd(i+1, input);
		
	}


	//non-recursive implementation..
	private static void loopAdd(int input) {
		

		int result = 0;
		for(int i =0; i <= input; i++) {
			
			result = add(i,result);
			
			if(i == limit) {
				--i;
			}
		}
		
		System.out.println(result);
	}
	
	
	public static int add(int a, int b) {
		return a+b;
	}

}
