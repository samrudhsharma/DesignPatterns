// Interpreter Pattern
// This is the actual interpreter. It is responsible for interpreting the statement and calling the appropriate method to handle it.
public class Interpreter {
  public String convertToBinary(int hexNumber) {
	return Integer.toBinaryString(hexNumber);
  }
  
  public String convertToHex(int binNumber) {
	return Integer.toHexString(binNumber);
  }
}
