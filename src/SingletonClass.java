// This is the Singleton class for which only one object can be created
public class SingletonClass {
  
	private static final SingletonClass instance = new SingletonClass();
	
	// The constructor for this class is private so that no new instances can be initialised other than the one defined in the class
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("This is a singleton instance");
	}
}
