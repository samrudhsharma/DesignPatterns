// An Adapter for the Shape Line. It implements the interface Shape and an object to this adapter is required to create a Line.
public class LineAdapter implements Shape {

	private Line line;
	public LineAdapter(Line line) {
		this.line = line;
	}
	@Override
	public void create(int x0, int y0, int x1, int y1) {
		// TODO Auto-generated method stub
		line.create(x0, y0, x1, y1);
	}
	
}
