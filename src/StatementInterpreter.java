// Interpreter Pattern
// This class interprets each statement to decide what type of expression it is before the interpreter class decides what expression to compute.
public class StatementInterpreter {
  public Interpreter expressionType;
	
  public StatementInterpreter(Interpreter i){
    this.expressionType=i;
  }
	
  public String interpret(String statement){
	Expression expression = null;
	// The rules for the types of expression statements allowed in the grammar of the language
	if(statement.contains("Hexadecimal"))
	  expression = new ConvertToHexExpression(Integer.parseInt(statement.substring(0,statement.indexOf(" "))));
	else if(statement.contains("Binary"))
	  expression = new ConvertToBinaryExpression(Integer.parseInt(statement.substring(0,statement.indexOf(" "))));
	else 
	  return statement;
		
	return expression.interpret(expressionType);
  }	
}
