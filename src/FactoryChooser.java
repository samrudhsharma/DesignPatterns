// This class is responsible for choosing which Factory is to be called 
public class FactoryChooser {
	public static AbstractFactory getFactory(String choice){
	   if(choice.equalsIgnoreCase("Cars"))
	     return new CarFactory();
	  else if(choice.equalsIgnoreCase("Bikes"))
	      return new BikesFactory();
	  return null;
	}
}
