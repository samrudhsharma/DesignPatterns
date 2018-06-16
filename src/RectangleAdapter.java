// An Adapter for the Shape Rectangle. It implements the interface Shape and an object to this adapter is required to create a rectangle.
public class RectangleAdapter implements Shape {

	Rectangle rect;
	
	public RectangleAdapter(Rectangle rect) {
		this.rect = rect;
	}
	@Override
	public void create(int x0, int y0, int x1, int y1) {
		// Creating a rectangle requires finding the height and width from the coordinates. This adapter allows us to utilise the given coordinates to compute them.
		// Allowing the user to use the interface Shape without any changes to it.
		int height = Math.abs(x1- x0);
		int width = Math.abs(y1 - y0);
		
		int startingX = Math.min(x0, x1);
		int startingY = Math.min(y0, y1);
		
		rect.create(startingX, startingY, width, height);
		}

}
