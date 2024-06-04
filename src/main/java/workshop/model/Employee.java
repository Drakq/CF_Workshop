package workshop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "EmployeeData")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	
	private String firstName;
	private String lastName;
	private String email;
}