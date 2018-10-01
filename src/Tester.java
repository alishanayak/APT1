
public class Tester {

	public static void main(String[] args) {
		char[] str1Array = new char[26];
		for (char c : str1Array) {
			if (c == '\u0000') {
				System.out.println("hellop");
			}
		}
	}

}
