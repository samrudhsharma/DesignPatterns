// Mediator Pattern
// This is a concrete Mediator class that implements the Mediator interface and holds the logic for how each created user object communicates with each other
import java.util.ArrayList;
import java.util.List;

public class MediatorImplementation implements Mediator {
  public List<User> userList;
  
  public MediatorImplementation() {
	this.userList = new ArrayList<>();
  }
  
  @Override
  public void sendMessage(String message, User user) {
	for(User userIterator : userList){
	  // The sender is not to be sent the message
	  if(userIterator != user)
		userIterator.receivedMessage(message);
	}
  }

  @Override
  public void createUser(User user) {
	userList.add(user);
  }

}
