// Memento Pattern
// This class creates and stores the state of an object in a memento
public class Originator {
  private String state;

  public void setState(String state){
	this.state = state;
  }

  public String getState(){
	return state;
  }

  public Memento saveAsMemento(){
	return new Memento(state);
  }

  public void restoreState(Memento memento){
	state = memento.getState();
  }
}
