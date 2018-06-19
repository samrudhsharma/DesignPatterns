// Memento Pattern
// This class uses the Memento class to help restore an objects state

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
  private List<Memento> mementoList = new ArrayList<Memento>();

  public void addMemento(Memento state){
    mementoList.add(state);
  }

  public Memento getMemento(int index){
	return mementoList.get(index);
  }
}
