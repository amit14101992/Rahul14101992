package dropwizard;

import java.util.HashMap;
import java.util.*;

public class EmployDAO {

	 private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	 static {
	        initEmps();
	    }
	private static void initEmps() {
		 Employee emp1 = new Employee(01, "amit", 7275);
		 Employee emp2 = new Employee(02, "somit", 1725);
		 Employee emp3 = new Employee(03, "rahul", 999);
		 
	        empMap.put(emp1.getId(), emp1);
	        empMap.put(emp2.getId(), emp2);
	        empMap.put(emp3.getId(), emp3);
	}
	
	public Employee getEmployee(int empId) {
        return empMap.get(empId);
    }
	
	 public Employee addEmployee(Employee emp) {
	        empMap.put(emp.getId(), emp);
	        return emp;
	    }
	 
	  public Employee updateEmployee(Employee emp) {
	        empMap.put(emp.getId(), emp);
	        return emp;
	    }
	  
	  
	   public void deleteEmployee(int empId) {
	        empMap.remove(empId);
	    }
	
	   public List<Employee> getAllEmployees() {
	        Collection<Employee> c = empMap.values();
	        List<Employee> list = new ArrayList<Employee>();
	        list.addAll(c);
	        return list;
	    }
	   
}

