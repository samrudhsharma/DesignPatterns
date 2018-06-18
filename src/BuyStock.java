// Command Pattern
public class BuyStock implements CommandOrder {
  private Stock stock;
  
  public BuyStock(Stock stock){
	this.stock = stock;
  }

  @Override
  public void executeCommand() {
	 stock.buy(); 
  }
}
