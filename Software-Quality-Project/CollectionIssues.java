import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * It creates two Map objects stringMap and collisionMap. stringMap stores String as key and list of Integer as value 
 * and collisionMap stores custom key and object as value. 
 *
 */

public class CollectionIssues {

	public static void main(String[] args) throws InterruptedException {

		Map<String, List<Integer>> stringMap = new HashMap<String, List<Integer>>();

		Map<TestKey, Object> collisionMap = new HashMap<TestKey, Object>();

		String key = "Collection_Issue key";

		int counter = 0;
		while (true) {
			List<Integer> list = new ArrayList<Integer>();

			stringMap.put(new String(key + counter), list);
			collisionMap.put(new TestKey(key + counter), new Object());

			//Every fifth entry of Map has a list of 1000 integers.
			if (counter++ % 5 == 0)
				for (int i = 0; i < 1000; i++) {
					list.add(i);
				}
			Thread.sleep(1000);

			System.out.println(counter);
		}
	}

	//Here we are generating a custom key which will be stored in collisionMap
	//hashCode will always generate same value to simulate collision of keys hashcode
	static class TestKey {
		private String keyString;

		public TestKey(String str) {
			keyString = str;
		}

		public String getKeyString() {
			return keyString;
		}

		@Override
		public int hashCode() {
			return 1;
		}

		@Override
		public boolean equals(Object arg0) {
			TestKey key = (TestKey) arg0;
			return keyString.equals(key.getKeyString());
		}
	}
}
