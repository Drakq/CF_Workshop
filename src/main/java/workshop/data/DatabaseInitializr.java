package workshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import workshop.model.Employee;

import javax.servlet.ServletContext;

@Profile("dev")
@Component
public class DatabaseInitializr implements ServletContextInitializer {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void onStartup(ServletContext servletContext) {
		System.out.println("Populating the database");
		
		Employee employee = new Employee();
		employee.setFirstName("Luca");
		employee.setLastName("Kutzner");
		employee.setEmail("l.kutzner@reply.de");
		employeeRepository.save(employee);
		
		System.out.println("Populated the database");
	}
}