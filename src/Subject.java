// Observer Pattern
// TThis is the object class that has the one-to-many relation. Changes made in this class will affect the listener classes 
import java.util.ArrayList;
import java.util.List;

public class Subject {
  private List<Observer> observerList = new ArrayList<>();
  private int state;

  public void addListener(Observer observer) {
	  observerList.add(observer);
  }

  public int getState() {
    return state;
  }

  public void setState(int value) {
    this.state = value;
    changeState();
  }

  private void changeState() {
    for(Observer observer : observerList)  
       observer.updateListener();     
  }
}
