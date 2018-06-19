// Interpreter Pattern
// Interface to represent the types of expressions allowed in our grammar
public interface Expression {
  public String interpret(Interpreter expressionType);
}
