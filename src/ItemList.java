// This class acts as the factory and cache for the generated item fly weight objects

import java.util.HashMap;
import java.util.Map;

public class ItemList {
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Item lookup(String itemName) {
		if(!items.containsKey(itemName)) 
			items.put(itemName, new Item(itemName));
		return items.get(itemName);	
	}
	
	public int totalItemsCreated() {
		return items.size();
	}
}
