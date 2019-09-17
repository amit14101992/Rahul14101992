package dropwizard;

import java.util.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("EmpService")
@Produces(MediaType.APPLICATION_JSON)
public class Controller {
	
	EmployDAO empobj = new EmployDAO();
	 
		@Path("/books")
		@GET 
		public List<Employee> getAllEmployee() {
			List<Employee> listOfEmp = empobj.getAllEmployees();
			return listOfEmp;
		}
	 
	 
		@Path("/book/{id}")
		@GET 
		public Employee getEmpById(@PathParam(value = "id") int id) {
			return empobj.getEmployee(id);
		}
	 
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/books")
		@POST 
		public Employee addEmployee(Employee emp) {
			return empobj.addEmployee(emp);
		}
	 
		@Path("/books")
		@PUT 
		@Consumes(MediaType.APPLICATION_JSON)
		public Employee updateEmployee(Employee emp) {
			return empobj.updateEmployee(emp);
	 
		}
	 
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/book/{id}")
		@DELETE
		public void deleteEmployee(@PathParam(value = "id")int id) {
			empobj.deleteEmployee(id);
	 
		} 
	}
