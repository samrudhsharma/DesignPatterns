// Memento Pattern
// This class creates a memento i.e. stores the state of an object
public class Memento {
  private String state;

  public Memento(String state){
	this.state = state;
  }

  public String getState(){
    return state;
  }	
}
