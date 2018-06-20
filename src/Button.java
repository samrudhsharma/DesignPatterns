// State Pattern
// This class decides what class the object should refer to when a state changes in the system
public class Button {
  private State currentState;
  // We start by turning the button ON 
  public Button() {
    currentState = OffState.returnInstance();
  }

  public void setCurrentState(State state) {
	currentState = state;
  }
  
  public void pressButton() {
    currentState.toggleButton(this);
  }
}
