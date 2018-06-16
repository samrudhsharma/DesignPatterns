// An abstract class using the Draw interface. Different types of shapes like circle, rectangle etc can be added by implementing this class.
// When further shapes are added, all the code does not have to be changed simply the implementation of the shape and its types.
public abstract class BuilderShapeClass {
	protected Draw draw;
    protected BuilderShapeClass(Draw draw){
	  this.draw = draw;
	}
	public abstract void draw();	
}
