// This abstract class is to call the Factories for each interface 
public abstract class AbstractFactory {
	abstract Cars getCarType(String carName);
	abstract Bikes getBikeType(String bikeName);
}
