// This class is responsible for deciding the type of object and for which sub class the object is to be created
public class Factory {
	
	public FactoryPatternEmployee getObjectType(String title) {
      if(title.equalsIgnoreCase("CEO"))
    	  return new FactoryPatternCEO();
      else if(title.equalsIgnoreCase("Manager"))
    	  return new FactoryPatternManager();
      else if(title.equalsIgnoreCase("Intern"))
    	  return new FactoryPatternIntern(); 
      return null;
	}
	
}
