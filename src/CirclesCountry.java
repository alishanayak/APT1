public class CirclesCountry {
	
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
		int borders = 0;
		
		for (int i = 0; i < x.length; i++) {
			if ((isInside(x[i], y[i], r[i], x1, y1)) && !(isInside(x[i], y[i], r[i], x2, y2))) {
				borders = borders + 1;
			}
			
			if (isInside(x[i], y[i], r[i], x2, y2) && !(isInside(x[i], y[i], r[i], x1, y1))) {
				borders = borders + 1;
			}
		}
		
		return borders;
	}
	
	public boolean isInside(int cX, int cY, int cR, int x, int y) {
		
		double distance = Math.sqrt((x - cX) * (x - cX) + (y - cY) * (y - cY));
		
		if (distance < cR) {
			return true;
		}
		
		return false;
	}
	
}