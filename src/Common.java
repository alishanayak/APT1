
public class Common {
	public int count (String a, String b) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			char ca = a.charAt(i);
			for (int j = 0; j < b.length(); j++) {
				char cb = b.charAt(j);
				if (ca == cb) {
					int intA = ca;
					intA = intA - 97;
					if (alphabet[intA] != '1') {
						int totalA = a.length() - a.replace("" + ca, "").length();
						int totalB = b.length() - b.replace("" + cb, "").length();
						int occurrences;
						if (totalA < totalB) {
							occurrences = totalA;
						} else {
							occurrences = totalB;
						}
						count = count + occurrences;
						alphabet[intA] = '1';
					}
				}
			}
		}
		return count;
	}
}