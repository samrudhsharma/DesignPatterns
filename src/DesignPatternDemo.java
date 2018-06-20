//  Demos for Structural, Creation and and Behavioral Design Patterns in Java
import java.util.Scanner;

public class DesignPatternDemo {

	public static void main(String[] args) {
	 menu(); 
	}

	private static void menu() {
	 System.out.println("\nMenu: ");
	 System.out.println("1.Structural");
	 System.out.println("2.Creational");
	 System.out.println("3.Behavioral");
	 Scanner menuChoice = new Scanner(System.in);
	 int patterSubType = menuChoice.nextInt(); 
		
	 switch(patterSubType) {
	  case 1: structural();
		break;
      case 2: creational();
		break;
	  case 3: behavioral();
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
	 System.out.println("\nThe Decorator pattern allows us to add functionality to an already existing object without altering any of its structure."+
	 "\nSimply wrapping the objects adds features.");
	 System.out.println("\nThis demo shows how an object representing a simple implememntation of a sandwich can further have features added to it by using the decorator pattern.\n");
	 Sandwich basic = new BasicSandwich();
	 System.out.println(basic.build());
	 
	 Sandwich customSandwich = new DressingsDecorator(new ToppingsDecorator(new BasicSandwich()));
	 System.out.println(customSandwich.build());	
	 menu(); 
	}
	
	private static void adapterDemo() {
	 // The adapter pattern acts like a link between different types of interfaces or between legacy code and newly added extensions to the. 
	 // It provides a common UI for the user to use instead of having to individually cater to them.
	 System.out.println("\nThe adapter pattern acts like a link between different types of interfaces or between legacy code and newly added extensions to the. \n" + 
				"It provides a common UI for the user to use instead of having to individually cater to them.");
	 System.out.println("\nThis demo shows how new implememntations of legacy code Shape in the form of shapes like a line and rectangle can be added using the Adapter pattern.");
	 System.out.println("The Adapter allows us to use the old legacy code without having to re write it.\n");
	 
	 RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
	 LineAdapter line = new LineAdapter(new Line());
	 Shape[] shapes = {line, rectangle};
	 int x0 = 30, x1 = 9, y0 = 100, y1 = 40;
	 for(Shape shape : shapes) 
	   shape.create(x0, y0, x1, y1);
	 menu(); 
    }

	private static void compositeDemo() {
	 // The Composite pattern allows us to arrange objects into tree structures to represent their hierarchy
 	 // This allows individual and composition of objects to be treated as the same.
	 System.out.println("\nThe Composite pattern allows us to arrange objects into tree structures to represent their hierarchy\n" + 
				"This allows individual and composition of objects to be treated as the same.\n");
	 System.out.println("\nThe demo of the Composite pattern shows the hierarchy between objects of type General Manager, Manager and interns.\n");
 	 
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
 	 menu(); 
	}

	private static void bridgeDemo() {
	 // The Bridge pattern allows us to decouple an abstraction from its implementation allowing the two to work individually so different features can be added onto both 
     // We can Draw the shape Circle with different attributes like the colour red and yellow as defined in the concrete bridge implementer classes.
     // Adding another shape requires the implementation of the abstract class shape and its features as concrete bridge implementer classes.
     System.out.println("\nThe Bridge pattern allows us to decouple an abstraction from its implementation allowing the two to work individually so different features can be added onto both \n" + 
     			"We can Draw the shape Circle with different attributes like the colour red and yellow as defined in the concrete bridge implementer classes.\n" + 
     			"Adding another shape requires the implementation of the abstract class shape and its features as concrete bridge implementer classes.\n");
	 
     BuilderShapeClass redCircle = new BuilderPatternCircle(0, 0, 100, new RedCircle());
     BuilderShapeClass yellowCircle = new BuilderPatternCircle(0, 0, 100, new YellowCircle());
     redCircle.draw();
     yellowCircle.draw();
     menu(); 
	}

	private static void facadeDemo() {
	 // The Facade pattern allows us to create a single simplified interface to a different number of interfaces in a sub system.
	 // Making it easier for the user to access them 
	 System.out.println("\nThe Facade pattern allows us to create a single simplified interface to a different number of interfaces in a sub system.\n" + 
				"Making it easier for the user to access them.");
	 System.out.println("\nThe demo shows how we can use one object to access different sub systems to print differnet shapes like a square, triangle and circle.\n");
		
	 Facade facade = new Facade();
	 facade.drawSquare();	
	 facade.drawTriangle();
	 facade.drawCircle();
	 menu(); 
	}

	private static void flyweightDemo() {
	 // The Fly Weight Pattern is used to keep track and reduce the large number of small objects created in applications.
	 // It re uses already existing objects and only creates a new one if its not found in its factory and cache 
	 System.out.println("\nThe Fly Weight Pattern is used to keep track and reduce the large number of small objects created in applications.\n" + 
				"It re uses already existing objects and only creates a new one if its not found in its factory and cache. ");
	 System.out.println("\nThe demo shows a simple implementation of a simple online shopping portal. \nThe pattern is used to make sure thant every order doesnt result in the creation of a new object.\n");
	
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
	 menu(); 
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
			   creational();
	 }
	 menuChoice.close(); 		
	}

	private static void abstractFactoryDemo() {
	 // Abstract Factory Pattern provides an interface for creating more Factories.
 	 // It is responsible for creating a factory of related objects without revealing all the classes within each Factory 
	 // The only types of objects that can be create are for the Cars, Bikes interfaces and the Abstract Factory 
 	 // The type of Factory object is decided by using an object for the Factory Chooser class
 	 // After which, the type of sub class can be determined
	 System.out.println("\nAbstract Factory Pattern provides an interface for creating more Factories.\n" + 
			 	"It is responsible for creating a factory of related objects without revealing all the classes within each Factory.\n" + 
				"The only types of objects that can be create are for the Cars, Bikes interfaces and the Abstract Factory.\n" + 
				"The type of Factory object is decided by using an object for the Factory Chooser class\n" + 
				"After which, the type of sub class can be determined.\n");
	 System.out.println("The demo showcases the implementation of an abstract factory to represent two different factories namel Cars and Bike with each having sub classes with different types of cars and bikes.\n");
 		
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
 	 menu(); 
	}

	private static void factoryDemo() {    		
     // The Factory pattern work by allowing the user to create only type of object but utilising an interface which allows the sub classes within
	 // to choose which class to instantiate the object for.
	 // The only types of objects that can be create are for the Employee interface and the Factory class
	 // The type of Employee object is decided by using an object for the Factory class
	 System.out.println("\nThe Factory pattern work by allowing the user to create only type of object but utilising an interface which allows the sub classes within\n" + 
				"to choose which class to instantiate the object for.\n" + 
				"The only types of objects that can be create are for the Employee interface and the Factory class\n" + 
				"The type of Employee object is decided by using an object for the Factory class.\n");
	 System.out.println("This is an example of a factory with 3 sub classes namely CEO, Manager and Intern.\n");
	 
	 Factory factoryObject = new Factory();
			
	 FactoryPatternEmployee CEOObject = factoryObject.getObjectType("CEO");
     System.out.println(CEOObject.objectType());
			
	 FactoryPatternEmployee managerObject = factoryObject.getObjectType("Manager");
	 System.out.println(managerObject.objectType());
			
	 FactoryPatternEmployee internObject = factoryObject.getObjectType("Intern");
	 System.out.println(internObject.objectType());
	 menu(); 
	}

	private static void prototypeDemo() {
	 // The Prototype Pattern creates new objects by instantiating the objects with prototypes only once and form there on forward clones 
	 // the objects if new objects are require. Reducing the number of objects created which helps performance and cost issues.
	 System.out.println("\nThe Prototype Pattern creates new objects by instantiating the objects with prototypes only once and form there on forward clones \n" + 
				"the objects if new objects are require. Reducing the number of objects created which helps performance and cost issues.");
	 System.out.println("This example displays the created clone objects for the two different shapes Rectangle and Square.\n");
		
	 PrototypeBuilder.initialisePrototypes();

	 PrototypePatternShape clonedRectangleObject = (PrototypePatternShape) PrototypeBuilder.getShape("1");
	 System.out.println("Shape: " + clonedRectangleObject.getType());		

	 PrototypePatternShape clonedSquareObject = (PrototypePatternShape) PrototypeBuilder.getShape("2");
	 System.out.println("Shape: " + clonedSquareObject.getType());	
	 menu(); 
	}

	private static void singletonDemo() {
	 // The Singleton Pattern revolves around one single class and ensures that only one instance of the class can be created for that class
	 // Making sure that the created instance is globally accessible
	 // The Singleton Pattern makes sure that statements like these cannot be executed and throws a compile time error if called
	 //SingletonClass singleObject = new SingletonClass();

     // To access the single object for the single class you simply encapsulate it by calling the getInstance method from the Singleton class
     System.out.println("\nThe Singleton Pattern revolves around one single class and ensures that only one instance of the class can be created for that class.\n" + 
	    		"Making sure that the created instance is globally accessible.\n" + 
	    		"The Singleton Pattern makes sure that statements like these cannot be executed and throws a compile time error if called:\n" + 
	    		"	SingletonClass singleObject = new SingletonClass();\n" + 
	    		"\n" + 
	    		"To access the single object for the single class you simply encapsulate it by calling the getInstance method from the Singleton class.\n");
	 System.out.println("This example simply shows how to acces the sungleton object and use to call its print method.\n");
	
	 SingletonClass singleObject = SingletonClass.getInstance();
	 singleObject.print();
	 menu(); 	
	}

	private static void builderDemo() {
	 // The Builder Pattern allows you to build complex object from smaller/simpler objects
 	 // Allowing the construction of the complex objects to be separate to its final state making sure that different complex objects can be created using variations in objects
 	 System.out.println("\nThe Builder Pattern allows you to build complex object from smaller/simpler objects.\n" + 
 	 		"Allowing the construction of the complex objects to be separate to its final state making sure that different complex objects can be created using variations in objects.");
 	 System.out.println("This is an example of the Builder Pattern being used to create different types of sandwhiches with all the stuffing objects being added together to finally make a sandwich.\n");
	 
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
 	 menu(); 
	}

	private static void behavioral() {
	  System.out.println("\nChoose which Behovioral Design Pattern you want to demo: ");
	  System.out.println("1.Chain Of Responsibility Pattern");
	  System.out.println("2.Command Pattern");
	  System.out.println("3.Interpreter Pattern");
	  System.out.println("4.Iterator Pattern");
	  System.out.println("5.Mediator Pattern");
      System.out.println("6.Memento Pattern");
	  System.out.println("7.Observer Pattern");
	  System.out.println("8.State Pattern");
	  System.out.println("9.Stratergy Pattern");
	  System.out.println("10.Template Method Pattern");
	  System.out.println("11.Visitor Pattern");
		
	  Scanner menuChoice = new Scanner(System.in);
	  int patterSubType = menuChoice.nextInt(); 
		
      switch(patterSubType) {
	    case 1: chainOfResponsibilityDemo();
			break;
		case 2: commandDemo();
			break;
		case 3: interpreterDemo();
			break;
		case 4: iteratorDemo();
			break;
		case 5: mediatorDemo();
			break;
		case 6: mementoDemo();
			break;
		case 7: observerDemo();
			break;
		case 8: stateDemo();
			break;
		case 9: stratergyDemo();
			break;
		case 10: templateMethodDemo();
			break;
		case 11: visitorDemo();
			break;	
		default : System.out.println("Error in choice.\nPlease try again");
				  behavioral();
	  }
	  menuChoice.close();	
	}

	private static void visitorDemo() { 
	  System.out.println("\n");
	  System.out.println("\n\n");	
	}

	private static void templateMethodDemo() { 
	  System.out.println("\n");
	  System.out.println("\n\n");		
	}

	private static void stratergyDemo() { 
	  System.out.println("\n");
	  System.out.println("\n\n");	
	}

	private static void stateDemo() {  
	  System.out.println("\nThe State Pattern allows the development of objects that can alter their behaviour depending on their internal state. Which means that the object is"
	  		+ "\nallowed to change class dependant on current state.");
	  System.out.println("\nThe following example shows a system where a button is pressed to change its state from either ON or OFF to the other using the State Pattern. \n");
	  
	  Button button = new Button();
	  System.out.println("Button is pressed");
	  button.pressButton();
	  System.out.println("Button is pressed again");
	  button.pressButton();
	  System.out.println("Button is pressed again");
	  button.pressButton();
	}

	private static void observerDemo() {  
	  System.out.println("\nThe Observer Patter is used if an object has a one-to-many relation i.e. more than one object depend on the state of a single object."
	  		+ "\nThe patytern helps notify and update all the dpendant objects if there is a change in state of the main object.");
	  System.out.println("\nIn this example a change in an integer number prompt automated conversions of the number to binary, hex and octa decimal using the Observer Pattern.\n");
	  
	  Subject subject = new Subject();
      // Client decides how many and what type of observers/listeners they want on their subject
      new HexListener(subject);
      new OctListener(subject);
      new BinaryListener(subject);
     
      int number = 10;
      System.out.print("Number: "+number+"\n");
      subject.setState(number);
      number = 100;
      System.out.print("\nNow the number is: "+number+"\n");
      subject.setState(number);
	}

	private static void mementoDemo() {  
	  System.out.println("\nThe Memento Pattern allows an objects state to be captured so that, if needed, it can be returend to a previous state.");
	  System.out.println("\nThis is a simple example that shows how the pattern can save, retreive and keep track of object states\n");	
	  
	  Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("Object State 1");
      careTaker.addMemento(originator.saveAsMemento());
      
      originator.setState("Object State 2");
      careTaker.addMemento(originator.saveAsMemento());
      
      originator.setState("Object State 3");
      careTaker.addMemento(originator.saveAsMemento());
      
      originator.setState("Object State 4");
      System.out.println("Current State: " + originator.getState());	
      
      originator.restoreState(careTaker.getMemento(0));
      System.out.println("First saved State: " + originator.getState());
      originator.restoreState(careTaker.getMemento(1));
      System.out.println("Second saved State: " + originator.getState());
      originator.restoreState(careTaker.getMemento(2));
      System.out.println("Third saved State: " + originator.getState());
      System.out.println("Current State after retreiving memento: " + originator.getState());
	}

	private static void mediatorDemo() {
	  System.out.println("\nThe Mediator Pattern is used to reduce communication complexity when there are a large number of classes involved. It does this"
	  		+ "\nby providing a single object that defines the how the set of objects interact with each other, supporting easy maintainance by not allowing"
	  		+ "\nobjects to explicitly call each other. ");
	  System.out.println("\nThis is an example of a group chat room. Where each user can send a message and it will be received by all the members\n");
	  
	  Mediator mediator = new MediatorImplementation();
	  User user1 = new UserImplementation(mediator, "Samrudh");
	  User user2 = new UserImplementation(mediator, "Calum");
	  User user3 = new UserImplementation(mediator, "Siddharth");

	  mediator.createUser(user1);
	  mediator.createUser(user2);
	  mediator.createUser(user3);
		
	  user3.sendMessage("This is an example of the Mediator Pattern.");
	}

	private static void iteratorDemo() {
	  System.out.println("\nThe Iterator Pattern provides a way to access the elements of a collection class object in a sequential order without exposing the "
	  		+ "\nits underlying representation to the client. The client only uses the iterator methods to traverse over the collection object. ");
	  System.out.println("\nThe following is an example of how the Iterator pattern is used to iterate over a collection which stores names in a sequence\n");
	  
	  NameCollection nameCollection = new NameCollection();

      for(Iterator nameIterator = nameCollection.getNameIterator(); nameIterator.hasNext();){
         String name = (String) nameIterator.getNext();
         System.out.println("Name: " + name);
      } 	
	}

	private static void interpreterDemo() {
	  System.out.println("\nThe Interpreter Pattern allows us to interpret an expression for any unquiely defined language as long as each term in the expression is"
	  		+ "\n represented in the grammar of the language.");
	  System.out.println("\nThis is an example of an implementation of the interpreter pattern which converts an integer to decimal or hex."
	  		+ "\nExpressions take the form of: '(number) in Decimal/Hexadecimal', returning the number in the format mentioned at the end. \n");
	  
	  String expression1 = "16 in Binary";
	  String expression2 = "84 in Hexadecimal";
		
	  StatementInterpreter statement = new StatementInterpreter(new Interpreter());
	  System.out.println(expression1+" = "+statement.interpret(expression1));
	  System.out.println(expression2+" = "+statement.interpret(expression2));
	}

	private static void commandDemo() {
	  System.out.println("\nThe Command Pattern allows us to encapsulate a request from the client as an object. Each command is used to invoke the appropriate object/method"
	  		+ "\nwhich can carry out the request. This allows the parameteriaztion of clients with different requests.");
	  System.out.println("\nThis example is an implementation of a stock broker sysytem where you can buy or sell stock. With buying ans selling being the commands in a "
	  		+ "\nrequest.");
	  
	  Stock stock = new Stock();

      BuyStock buyStockCommand = new BuyStock(stock);
      SellStock sellStockCommand = new SellStock(stock);

      // Both these statements/commands make up one request 
      CommandExecutor stockRequest = new CommandExecutor();
      stockRequest.takeCommand(buyStockCommand);
      stockRequest.takeCommand(sellStockCommand);

      stockRequest.placeRequest();
	}

	private static void chainOfResponsibilityDemo() {
	  System.out.println("\nThe Chain Of Responsibility pattern works by creating a chain of receiver objects for any generated request from the user."
				+ "\nAllowing more than one object the opportunity to handle the request. Each object chains the receving object and passes the request"
				+ "along the chain until an object handles it.");
	  System.out.println("\nThis is an example of the Chain Of Responsibility pattern where a currency amount is taken in and displays in how many notes"
				+ "of 100, 50 and 10 can the amount be divided."
				+ "\nEach denomination representing an object in the chain and only processing its part before passing it down the chain.");
		
	  ChainHandler chainBuilder = new ChainHandler();
		
	  int amount = 0;
	  System.out.println("\nEnter the amount");
	  Scanner input = new Scanner(System.in);
	  amount = input.nextInt();
	  input.close();
	  if(amount % 10 != 0) {
	    System.out.println("Please enter an amount as a multiple of 10.");
	    return;
	  }
	  chainBuilder.link1.numberOfNotes(new Currency(amount));
	}
}
