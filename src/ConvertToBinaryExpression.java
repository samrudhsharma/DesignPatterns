// Interpreter Pattern
// Class to handle a integer to binary expression
public class ConvertToBinaryExpression implements Expression {

  private int integer ;
	
  public ConvertToBinaryExpression(int integer){
	this.integer=integer;
  }
	
  @Override
  public String interpret(Interpreter binExpression) {
	return binExpression.convertToBinary(integer);
  }
}
