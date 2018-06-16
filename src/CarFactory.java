//The factory for the Cars interface
// For types of cars, the abstract factory object will reference this Factory
public class CarFactory extends AbstractFactory {

	@Override
	Cars getCarType(String carName) {
		if(carName.equalsIgnoreCase("Audi R8"))
	    	  return new AudiR8();
	      else if(carName.equalsIgnoreCase("Lamborghini Huracan"))
	    	  return new LamborghiniHuracan();
	      return null;		
	}

	@Override
	Bikes getBikeType(String bikeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
