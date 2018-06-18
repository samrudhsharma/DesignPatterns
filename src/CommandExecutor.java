// Command Pattern
// This class is responsible for executing each individual command of a request from the client. Calling the appropriate object for the command.
import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
  private List<CommandOrder> commandList = new ArrayList<CommandOrder>(); 

  public void takeCommand(CommandOrder order){
	  commandList.add(order);		
  }

  public void placeRequest(){
	for(CommandOrder command : commandList) {
		command.executeCommand();
	}
	commandList.clear();
  }
}
