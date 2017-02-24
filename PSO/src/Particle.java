import particleattributes.BestPosition;
import particleattributes.Location;
import particleattributes.ObjectiveFuncion;
import particleattributes.Velocity;

public class Particle {
	private Velocity velocity;
	private Location location;
	private BestPosition bestPosition;
	private ObjectiveFuncion objectiveFunction;

	public Particle() {

	}

	public Particle(BestPosition bestPosition, Velocity velocity, Location location,
			ObjectiveFuncion objectiveFunction) {

	}

	public Velocity getVelocity() {
		return velocity;
	}

	public Location getLocation() {
		return location;
	}

	public BestPosition getBestPosition() {
		return bestPosition;
	}

	public ObjectiveFuncion getObjectiveFunction() {
		return objectiveFunction;
	}

	public void setVelocity(Velocity velocity) {
		this.velocity = velocity;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setBestPosition(BestPosition bestPosition) {
		this.bestPosition = bestPosition;
	}

	public void setObjectiveFunction(ObjectiveFuncion objectiveFunction) {
		this.objectiveFunction = objectiveFunction;
	}
}
