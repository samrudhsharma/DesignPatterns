// State Pattern
// If the current state is ON this class changes the state to OFF
public class OnState extends State {
  private static OnState currentInstance = new OnState();
  private OnState() {}
	  
  public static State returnInstance() {
	return currentInstance;
  }
	  
  // When the button is pressed and the current state is ON we then change it to OFF
  @Override
  public void toggleButton(Button button) {
    button.setCurrentState(OffState.returnInstance());
    System.out.println("Toggled OFF.");
  }
}
