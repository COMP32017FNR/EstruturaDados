import java.util.Random;

public class PSOprocess {
	public static double w = 0.8;
	public static double c1 = 2, c2 = 2;

	public static void start(int np, int nd) {
		Random random = new Random();
		int cont = 0;
		Particle particles[] = new Particle[np];
		double position[] = new double[nd];
		double velocity[] = new double[nd];
		for (int p = 0; p < np; p++) {
			particles[p] = new Particle();
			for (int d = 0; d < nd; d++) {
				position[d] = -10.0 + random.nextDouble() * 20.0;
				;
			}
			particles[p].setPosition(position);
			particles[p].setBestLocalPosition(position);

			if (particles[p].ObjectiveFunctionBestPosition() < Main.gBestObjectiveFunction) {
				Main.gBestPosition = particles[p].getBestLocalPosition();

			}
			for (int d = 0; d < nd; d++) {
				velocity[d] = 0;
			}
			particles[p].setVelocity(velocity);
		}
		while (cont < 100) {
			for (int p = 0; p < np; p++) {
				for (int d = 0; d < nd; d++) {
					double rp = random.nextDouble(), rg = random.nextDouble();
					velocity[d] = w * particles[p].getVelocity()[d]
							+ c1 * rp * (particles[p].getBestLocalPosition()[d] - particles[p].getPosition()[d])
							+ c2 * rg * (Main.gBestPosition[d] - particles[p].getPosition()[d]);
					position[d] = particles[p].getPosition()[d] + particles[p].getVelocity()[d];
				}
				particles[p].setVelocity(velocity);
				particles[p].setPosition(position);
				if (particles[p].ObjectiveFunctionPosition() < particles[p].ObjectiveFunctionBestPosition()) {
					particles[p].setBestLocalPosition(particles[p].getPosition());
					if (particles[p].ObjectiveFunctionBestPosition() < Main.gBestObjectiveFunction) {
						Main.gBestPosition = particles[p].getBestLocalPosition();
					}
				}

			}
			cont++;
		}
	}

}
