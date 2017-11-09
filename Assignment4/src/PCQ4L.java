
public class PCQ4L {

	public static void firstInsert(String s, LinkedDeque<String> myDeque) {
		myDeque.insertFirst(s);
		System.out.println(String.format("insertFirst(%s)", s));
		System.out.println(myDeque.toString() + "\n");
	}

	public static void lastInsert(String s, LinkedDeque<String> myDeque) {
		myDeque.insertLast(s);
		System.out.println(String.format("insertLast(%s)", s));
		System.out.println(myDeque.toString() + "\n");
	}

	public static String firstRemove(LinkedDeque<String> myDeque) {
		try {
			String tempString = myDeque.removeFirst().toString() + " ";
			System.out.println("removeFirst()");
			System.out.println(myDeque.toString() + "\n");
			return tempString;
		} catch (EmptyDequeException e) {
			return e.getMessage();
		}
	}

	public static String lastRemove(LinkedDeque<String> myDeque) {
		try {
			String tempString = myDeque.removeLast().toString() + " ";
			System.out.println("removeLast()");
			System.out.println(myDeque.toString() + "\n");
			return tempString;
		} catch (EmptyDequeException e) {
			return e.getMessage();
		}
	}

	public static void main(String[] args) {

		// create string
		String holder = "";

		// create deque
		LinkedDeque<String> myDeque = new LinkedDeque();
		System.out.println("Deque created: LinkedDeque");
		System.out.println(myDeque.toString() + "\n");

		// requirements
		firstInsert("Ireland", myDeque);
		holder += lastRemove(myDeque);
		lastInsert("England", myDeque);
		holder += firstRemove(myDeque);
		lastInsert("Wales", myDeque);
		firstInsert("Scotland", myDeque);
		lastInsert("France", myDeque);
		holder += firstRemove(myDeque);
		holder += lastRemove(myDeque);
		lastInsert("Germany", myDeque);

		// final
		System.out.println("The final deque");
		System.out.println(myDeque.toString() + "\n");
		System.out.println("Countries removed from the deque");
		System.out.println(holder);

	}

}
