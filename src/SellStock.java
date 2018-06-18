// Command Pattern
public class SellStock implements CommandOrder {
  private Stock stock;
	  
  public SellStock(Stock stock){
	this.stock = stock;
  }

  @Override
  public void executeCommand() {
	stock.sell(); 
  }
}
