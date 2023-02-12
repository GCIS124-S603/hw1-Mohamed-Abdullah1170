package homework1;

public class Athlete {
	private String name;
	private double weight;
	private double height;
	final float WC = 0.45f;
	final float HC = 0.025f;

	public Athlete() {
		name = "Unknown";
		weight = 0.0;
		height = 0.0;
	}

	public Athlete(String n, double w, double h) {
		name = n;
		weight = w;
		height = h;
	}

	public String name() {
		return name;
	}

	public double weight() {
		return weight;
	}

	public double height() {
		return height;
	}

	public void name(String n) {
		this.name = n;
	}

	public void weight(double w) {
		this.weight = w;
	}

	public void height(double h) {
		this.height = h;
	}

	public double bmi() {
		if (height <= 0.0001 && height >= 0.0) {
			double b = -999.00;
			return b;
		} else {
			double b = (weight * WC) / (Math.pow(height * HC, 2));
			return b;
		}
	}

}
