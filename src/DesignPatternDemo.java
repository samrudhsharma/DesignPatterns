import java.util.Scanner;

//  A 
public class DesignPatternDemo {

	public static void main(String[] args) {
		System.out.println("Menu: ");
		System.out.println("1.Behavioral");
		System.out.println("2.Creational");
		System.out.println("3.Structural");
		Scanner menuChoice = new Scanner(System.in);
		int patterSubType = menuChoice.nextInt(); 
		
		switch(patterSubType) {
		case 1: behavioral();
			break;
		case 2: creational();
			break;
		case 3: structural();
			break;
		}
		menuChoice.close();			 
	}

	private static void structural() {
		System.out.println("\nChoose which Structural Design Pattern you want to demo: ");
		System.out.println("1.Adapter Pattern");
		System.out.println("2.Bridge Pattern");
		System.out.println("3.Composite Pattern");
		System.out.println("4.Facade Pattern");
		System.out.println("5.Flyweight Pattern");
		System.out.println("6.Decorator Pattern");
		Scanner menuChoice = new Scanner(System.in);
		int patterSubType = menuChoice.nextInt(); 
		
		switch(patterSubType) {
		case 1: adapterDemo();
			break;
		case 2: bridgeDemo();
			break;
		case 3: compositeDemo();
			break;
		case 4: facadeDemo();
			break;
		case 5: flyweightDemo();
			break;
		case 6: decoratorDemo();
			break;
		default : System.out.println("Error in choice.\nPlease try again");
			structural();
		}
		menuChoice.close();
		
	}
	
	private static void decoratorDemo() {
		
		// The Decorator pattern allows us to add functionality to an already existing object without altering any of its structure.
	 	// Simply wrapping the objects adds features.
	 	Sandwich basic = new BasicSandwich();
		System.out.println(basic.build());
		Sandwich customSandwich = new DressingsDecorator(new ToppingsDecorator(new BasicSandwich()));
		System.out.println(customSandwich.build());	
		structural();
	}
	
	private static void adapterDemo() {
		// The adapter pattern acts like a link between different types of interfaces or between legacy code and newly added extensions to the. 
		// It provides a common UI for the user to use instead of having to individually cater to them.
				
		RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
		LineAdapter line = new LineAdapter(new Line());
		Shape[] shapes = {line, rectangle};
		int x0 = 30, x1 = 9, y0 = 100, y1 = 40;
		for(Shape shape : shapes) 
		   shape.create(x0, y0, x1, y1);
		structural();
	}

	private static void compositeDemo() {
		  
 		// The Composite pattern allows us to arrange objects into tree structures to represent their hierarchy
 		// This allows individual and composition of objects to be treated as the same.
 		Employee marketingHead = new Manager("Daniel White","Head of Marketing", 25000);
 		Employee marketingIntern1 = new Intern("John Faverau","Marketing", 10000);
 		Employee marketingIntern2 = new Intern("David Attenbourough","Marketing", 15000);
 		marketingHead.add(marketingIntern1);
 		marketingHead.add(marketingIntern2);
 		
 		Manager generalM = new Manager("Mark","General Manager", 50000);
 		Employee techHead = new Intern("Michael","Head of Technology", 20000);
 		
 		generalM.add(techHead);
 		generalM.add(marketingHead);
 		generalM.print();
 		structural();
	}

	private static void bridgeDemo() {
		// The Bridge pattern allows us to decouple an abstraction from its implementation allowing the two to work individually so different features can be added onto both 
     	// We can Draw the shape Circle with different attributes like the colour red and yellow as defined in the concrete bridge implementer classes.
     	// Adding another shape requires the implementation of the abstract class shape and its features as concrete bridge implementer classes.
     	BuilderShapeClass redCircle = new BuilderPatternCircle(0, 0, 100, new RedCircle());
     	BuilderShapeClass yellowCircle = new BuilderPatternCircle(0, 0, 100, new YellowCircle());
     	redCircle.draw();
     	yellowCircle.draw();
	}

	private static void facadeDemo() {
		// The Facade pattern allows us to create a single simplified interface to a different number of interfaces in a sub system.
		// Making it easier for the user to access them 
		Facade facade = new Facade();
		 
		facade.drawSquare();	
		facade.drawTriangle();
		facade.drawCircle();
		structural();
	}

	private static void flyweightDemo() {
		// The Fly Weight Pattern is used to keep track and reduce the large number of small objects created in applications.
		// It re uses already existing objects and only creates a new one if its not found in its factory and cache 
	    Inventory inv = new Inventory();
		inv.carryOutOrder("Phone", 345);
		inv.carryOutOrder("Car", 123);
		inv.carryOutOrder("TV", 222);
		inv.carryOutOrder("Bag", 334);
		inv.carryOutOrder("Phone", 543);
		inv.carryOutOrder("Bag", 34565);
		inv.carryOutOrder("Car", 34345);
		inv.carryOutOrder("Phone", 3245);
		inv.carryOutOrder("TV", 34455);
		inv.carryOutOrder("Phone", 2314);
		  
		inv.process();
		System.out.println( inv.status());
		structural();
	}

	private static void creational() {
		System.out.println("\nChoose which Creational Design Pattern you want to demo: ");
		System.out.println("1.Singleton Pattern");
		System.out.println("2.Builder Pattern");
		System.out.println("3.Prototype Pattern");
		System.out.println("4.Factory Method Pattern");
		System.out.println("5.Abstract Factory Pattern");
		Scanner menuChoice = new Scanner(System.in);
		int patterSubType = menuChoice.nextInt(); 
		
		switch(patterSubType) {
		case 1: singletonDemo();
			break;
		case 2: builderDemo();
			break;
		case 3: prototypeDemo();
			break;
		case 4: factoryDemo();
			break;
		case 5: abstractFactoryDemo();
			break;
		default : System.out.println("Error in choice.\nPlease try again\n");
			structural();
		}
		menuChoice.close();		
	}

	private static void abstractFactoryDemo() {
		// Abstract Factory Pattern provides an interface for creating more Factories.
 		// It is responsible for creating a factory of related objects without revealing all the classes within each Factory 
		// The only types of objects that can be create are for the Cars, Bikes interfaces and the Abstract Factory 
 		// The type of Factory object is decided by using an object for the Factory Chooser class
 		// After which, the type of sub class can be determined
 		AbstractFactory abstractFactoryObject = FactoryChooser.getFactory("Cars");		
 		
 		Cars carObject1 = abstractFactoryObject.getCarType("Audi R8");
 		carObject1.carType();
 				
 		Cars carObject2 = abstractFactoryObject.getCarType("Lamborghini Huracan");
 		carObject2.carType();
 				
 		AbstractFactory abstractFactoryObject2 = FactoryChooser.getFactory("Bikes");
 		
 		Bikes bikeObject1 = abstractFactoryObject2.getBikeType("Harley Davidson Heritage Classic");
 		bikeObject1.bikeType();
 				
 		Bikes bikeObject2 = abstractFactoryObject2.getBikeType("Harley Davidson Roadster");
 		bikeObject2.bikeType();	
 		creational();
	}

	private static void factoryDemo() {    		
    	
    	// The Factory pattern work by allowing the user to create only type of object but utilising an interface which allows the sub classes within
		// to choose which class to instantiate the object for.
		// The only types of objects that can be create are for the Employee interface and the Factory class
		// The type of Employee object is decided by using an object for the Factory class
		Factory factoryObject = new Factory();
			
		FactoryPatternEmployee CEOObject = factoryObject.getObjectType("CEO");
	    System.out.println(CEOObject.objectType());
			
		FactoryPatternEmployee managerObject = factoryObject.getObjectType("Manager");
		System.out.println(managerObject.objectType());
			
		FactoryPatternEmployee internObject = factoryObject.getObjectType("Intern");
		System.out.println(internObject.objectType());
		creational();
	}

	private static void prototypeDemo() {
		// The Prototype Pattern creates new objects by instantiating the objects with prototypes only once and form there on forward clones 
		// the objects if new objects are require. Reducing the number of objects created which helps performance and cost issues.
		PrototypeBuilder.initialisePrototypes();

		PrototypePatternShape clonedRectangleObject = (PrototypePatternShape) PrototypeBuilder.getShape("1");
		System.out.println("Shape: " + clonedRectangleObject.getType());		

		PrototypePatternShape clonedSquareObject = (PrototypePatternShape) PrototypeBuilder.getShape("2");
		System.out.println("Shape: " + clonedSquareObject.getType());	
		creational();
	}

	private static void singletonDemo() {
		// The Singleton Pattern revolves around one single class and ensures that only one instance of the class can be created for that class
		// Making sure that the created instance is globally accessible
		// The Singleton Pattern makes sure that statements like these cannot be executed and throws a compile time error if called
		//SingletonClass singleObject = new SingletonClass();

		// To access the single object for the single class you simply encapsulate it by calling the getInstance method from the Singleton class
	    SingletonClass singleObject = SingletonClass.getInstance();
	    singleObject.print();
	    creational();
		
	}

	private static void builderDemo() {
		// The Builder Pattern allows you to build complex object from smaller/simpler objects
 		// Allowing the construction of the complex objects to be separate to its final state making sure that different complex objects can be created using variations in objects
 		SandwichBuilder vegSandwich = new VegSandwich();
 		SandwichBuilder chickenTikkaSandwich = new ChickenTikkaSandwich();
 		  
 	    BuilderPatternOrder order = new BuilderPatternOrder();
 		BuilderPatternOrder order2 = new BuilderPatternOrder();
 		  
 		order.typeOfSandwich(vegSandwich);
 		order.orderSandwich();
 		order.deliverSandwich();
 		  
 		order2.typeOfSandwich(chickenTikkaSandwich);
 		order2.orderSandwich();
 		order2.deliverSandwich();	
 		creational();
	}

	private static void behavioral() {
		System.out.println("\nChoose which Behovioral Design Pattern you want to demo: ");
		System.out.println("1. Pattern");
		
		Scanner menuChoice = new Scanner(System.in);
		int patterSubType = menuChoice.nextInt(); 
		
		switch(patterSubType) {
		case 1: adapterDemo();
			break;
		case 2: bridgeDemo();
			break;
		case 3: compositeDemo();
			break;
		case 4: facadeDemo();
			break;
		case 5: flyweightDemo();
			break;
		case 6: decoratorDemo();
			break;
		default : System.out.println("Error in choice.\nPlease try again");
			structural();
		}
		menuChoice.close();
		
	}

}
