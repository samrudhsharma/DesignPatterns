// Mediator Pattern 
// This interface defines the contract for the communication between the concrete mediators/objects
public interface Mediator {
  public void sendMessage(String message, User user);
  public void createUser(User user);
}
