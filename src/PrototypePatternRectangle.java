
public class PrototypePatternRectangle extends PrototypePatternShape {

	public PrototypePatternRectangle() {
	  type = "rectangle";	
	}

	@Override
	void draw() {
	  System.out.println("Drawing a rectangle");
	}

}
