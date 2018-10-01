
public class DNAMaxNucleotide {
	public String max(String[] strands, String nuc) {
		int currMax = 0;
		int count;
		String most = "";
		for (String s : strands) {
			count = s.length() - s.replace(nuc, "").length();
			if (count != 0) {
				if (count > currMax) {
					currMax = count;
					most = s;
				} else if (currMax == count) {
					if (most.length() < s.length()) {
						most = s;
					}
				}
			}
		}
		return most;
	}
}