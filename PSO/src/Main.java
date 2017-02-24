import java.util.Random;

public class Main {
	public double bestPositionGloba[];
	public double bestObjectiveFunctionGlobal[];
	final double w = 0.8;
	final double c1 = 2;
	final double c2 = 2;
	public static Random random = new Random();
	double s = 0;

	public static void main(String[] args) {
		PSOProcess.starProcess(5, 2);
	}
}
