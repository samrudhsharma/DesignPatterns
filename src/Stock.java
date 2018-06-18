// Command Pattern
// This a class that represents a request i.e. buying or selling stock
public class Stock {
  private String name = "AMZ";
  private int quantity = 5;

  public void buy(){
    System.out.println("Buying "+quantity+" stocks for: "+name);
  }
  
  public void sell(){
	System.out.println("Selling "+quantity+" stocks for: "+name);
  }
}
