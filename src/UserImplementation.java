// Mediator Pattern
// This implementation of the User is used by the client to create a user, send and receive messages
public class UserImplementation extends User {

  public UserImplementation(Mediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void sendMessage(String message) {
	System.out.println("User: "+this.name+", Message sent:"+message);
	mediator.sendMessage(message, this);
  }

  @Override
  public void receivedMessage(String message) {
	System.out.println("User: "+this.name+", Message received:"+message); 
  }
}
