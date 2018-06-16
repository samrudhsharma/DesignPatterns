// A class implementing the abstract class Shape.
public class BuilderPatternCircle extends BuilderShapeClass {
   
   private int x, y, radius;

   public BuilderPatternCircle(int x, int y, int radius, Draw draw) {
      super(draw);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   public void draw() {
      draw.drawCircle(x, y, radius);
   }
}