// A facade class to wrap up and represent all the sub systems using one class. The user only has to create an object of this class to access all the different sub systems.
public class Facade {
	private FacadePatternShape square;
    private FacadePatternShape triangle;
	private FacadePatternShape circle;

	public Facade() {
	 square = new FacadePatternSquare();
	 triangle = new FacadePatternTriangle();
	 circle = new FacadePatternCircle();
	}

	public void drawSquare(){
	 square.draw();
	}
	public void drawTriangle(){
	 triangle.draw();
	}   
	public void drawCircle(){
     circle.draw();
	}
}
