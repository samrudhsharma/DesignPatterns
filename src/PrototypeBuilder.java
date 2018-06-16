// This class is responsible for building the prototypes for all the different objects types in our program.
// It uses a HashTable to keep track and attach id's to each object so they can be identified and cloned accordingly
import java.util.Hashtable;

public class PrototypeBuilder {

	private static Hashtable<String, PrototypePatternShape> prototypes = new Hashtable<String, PrototypePatternShape>();

	public static PrototypePatternShape getShape(String objectID) {
		PrototypePatternShape cachedShape = prototypes.get(objectID);
		return (PrototypePatternShape) cachedShape.clone();
	}

	// Initialising and storing each prototype object along with its key to identify by
	public static void initialisePrototypes() {
		PrototypePatternRectangle rectangle = new PrototypePatternRectangle();
		rectangle.setId("1");
		prototypes.put(rectangle.getId(), rectangle);

		PrototypePatternSquare square = new PrototypePatternSquare();
		square.setId("2");
		prototypes.put(square.getId(), square);
	}

}
