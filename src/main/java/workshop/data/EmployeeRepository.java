package workshop.data;

import org.springframework.data.jpa.repository.JpaRepository;
import workshop.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	List<Employee> findAll();
}