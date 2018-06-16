// Class to Draw out the red implementation of the shape Circle. This is a concrete bridge implementer class implementing the Draw interface.
public class RedCircle implements Draw {

	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("Drawing a red cricle with radius: "+radius+" and centre co ordinates ("+x+","+y+")");

	}

}
