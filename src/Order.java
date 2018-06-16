// Class to simply show how an order is executed in our system
public class Order {
	
  private final int orderNumber;
  private final Item item;
  
  public Order(int orderNumber, Item item) {
	this.orderNumber = orderNumber;
	this.item = item;
  }
  
  void executeOrder() {
	  System.out.println("Item: "+ item+" with order number: "+ orderNumber+" has been successfully ordered");
  }
}
