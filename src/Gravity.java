public class Gravity {
	
	private double acc = 9.8;
	
	public double falling(double time, double velo){
		return velo * time + 0.5 * acc * time * time;
	}
}