package particleattributes;

public class BestPosition {
	private double bestPostion[];

	public BestPosition(double[] bestPostion) {

		this.bestPostion = bestPostion;
	}

	public double[] getBestPostion() {
		return bestPostion;
	}

	public void setBestPostion(double bestPostion[]) {
		this.bestPostion = bestPostion;
	}
}
