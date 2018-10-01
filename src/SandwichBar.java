
public class SandwichBar {

	public int whichOrder(String[] available, String[] orders) {
		for (int i = 0; i < orders.length; i++) {
			String[] comps = orders[i].split(" ", -1);
			boolean isPossible = true;
			for (String item : comps) {
				if (!isIn(item, available)) {
					isPossible = false;
				}
			}
			if (isPossible) {
				return i;
			}
		}
		return -1;
	}


	private boolean isIn(String item, String[] available) {
		for (String s : available) {
			if (item.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
}