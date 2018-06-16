//The factory for the Bikes interface
// For types of bikes, the abstract factory object will reference this Factory
public class BikesFactory extends AbstractFactory {

	@Override
	Cars getCarType(String carName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Bikes getBikeType(String bikeName) {
		if(bikeName.equalsIgnoreCase("Harley Davidson Heritage Classic"))
	    	  return new HarleyDavidsonHeritageClassic();
	      else if(bikeName.equalsIgnoreCase("Harley Davidson Roadster"))
	    	  return new HarleyDavidsonRoadster();
	      return null;	
	}

}
