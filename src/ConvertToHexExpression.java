// Interpreter Pattern
// Class to handle a integer to binary expression
public class ConvertToHexExpression implements Expression {

  private int integer ;
		
  public ConvertToHexExpression(int integer){
	this.integer=integer;
  }
		
  @Override
  public String interpret(Interpreter hexExpression) {
    return hexExpression.convertToHex(integer);
  }
}
