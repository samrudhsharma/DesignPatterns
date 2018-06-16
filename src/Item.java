// The item class is the implementation if the flyweight. This is the class whose objects will be created and called all the time  
public class Item {
 private final String name;

 public Item(String name) {
   this.name = name;
 }

public String toString() {
  return name;
}
 
}
