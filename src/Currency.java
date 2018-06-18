// Chain of Responsibility
// A class to store the amount to be divided in notes anx is used by the implementation of the chain
public class Currency {
  public int amount;
  
  public Currency(int amount) {
	this.amount = amount;
  }
  
  public int returnAmount() {
	return amount;
  }
}
