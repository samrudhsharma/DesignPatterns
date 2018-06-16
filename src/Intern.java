// This a child class of the composite class "Manager" 
import java.util.List;

public class Intern implements Employee {

	private String name;
	private String dept;
	private int salary;
	
	
	public Intern(String name,String dept, int sal) {
	      this.name = name;
	      this.dept = dept;
	      this.salary = sal;
	   }
	
	@Override
	public void add(Employee employee) {
		// This is a leaf node in the tree structure of objects
	}

	@Override
	public void remove(Employee employee) {
		// This is a leaf node in the tree structure of objects

	}

	@Override
	public List<Employee> getSubordinates() {
		// This is a leaf node in the tree structure of objects
		return null;
	}

	@Override
	public void print() {
		System.out.println("Name: " + name + ", department: " + dept + ", salary: " + salary);
	}
}
