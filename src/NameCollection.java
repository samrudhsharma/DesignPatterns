// Iterator Pattern
public class NameCollection implements IteratorContainer {
  public String storedNames[] = {"Samrudh", "Calum", "Siddharth"};
  @Override
  public Iterator getNameIterator() {
	return new NameIterator();
  }
  
  // A class to define the name iterator which implements the methods of the iterator interface
  public class NameIterator implements Iterator{
    int index;

    @Override
    public boolean hasNext() {
      if(index < storedNames.length)
         return true;
      
      return false;
    }
    
    @Override
    public Object getNext() {
       if(this.hasNext())
         return storedNames[index++];
         
       return null;
    }		
  }
}
