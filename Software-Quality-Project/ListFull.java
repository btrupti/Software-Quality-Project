import java.util.ArrayList;
import java.util.List;

/**
 * It creates a list to store String objects and then adds strings in an infinite loop and generates OutOfMemoryError.
 *
 */

public class ListFull {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();

		int counter = 0;
		boolean flag = true;
		while (flag) {

			String value = "This is a leaky String " + counter++;

			strList.add(value);

		}

		System.out.println(strList.size());

	}

}
