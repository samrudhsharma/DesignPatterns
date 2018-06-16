// This is the component interface for the Composite pattern. It represents an object in composition and has all base operations implemented by the composite classes. 
import java.util.List;

public interface Employee {
	public void add(Employee employee);
    public void remove(Employee employee);
    public List<Employee> getSubordinates();
    public void print();
   
}
