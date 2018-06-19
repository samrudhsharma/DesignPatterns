// Mediator Pattern 
// This is an interface for creating a user and the functionalities each user has
public abstract class User {
  protected Mediator mediator;
  protected String name;
	
  public User(Mediator mediator, String name){
	this.mediator = mediator;
	this.name = name;
  }
  public abstract void sendMessage(String message);
  public abstract void receivedMessage(String message);
}
