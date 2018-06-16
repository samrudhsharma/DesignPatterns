
public class PrototypePatternSquare extends PrototypePatternShape {

   public PrototypePatternSquare() {
	 type = "square";	
   }

   @Override
   void draw() {
	 System.out.println("Drawing a square");
   }
}
