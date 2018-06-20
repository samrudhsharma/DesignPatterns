// State Pattern
// If the current state is OFF this class changes the state to ON
public class OffState extends State {
  private static OffState currentInstance = new OffState();

  private OffState() {}

  public static State returnInstance() {
	return currentInstance;
  }
   
  // When the button is pressed and the current state is OFF we then change it to ON
  @Override
  public void toggleButton(Button button) {
    button.setCurrentState(OnState.returnInstance());
	System.out.println("Toggled ON.");
  }
}