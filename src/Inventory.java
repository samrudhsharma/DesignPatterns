import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory {
  private final ItemList itemList = new ItemList();
  private final List<Order> orderList = new CopyOnWriteArrayList<Order>();
  
  public void carryOutOrder(String itemName, int orderNumber) {
	  Item item = itemList.lookup(itemName);
	  Order order = new Order(orderNumber, item);
	  orderList.add(order);  
  }
  
  public void process() {
	  for(Order order : orderList) {
		  order.executeOrder();
		  orderList.remove(order);
	  }
  }
  
  public String status() {
	  return "The total number of items(objects) created is: "+ itemList.totalItemsCreated();
  }
}
