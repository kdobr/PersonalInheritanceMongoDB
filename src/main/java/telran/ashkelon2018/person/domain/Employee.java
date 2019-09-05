package telran.ashkelon2018.person.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Employee extends Person {
	String company;
	int salary;

	public Employee(String email, String name, LocalDate birthDate, Address address, String company, int salary) {
		super(email, name, birthDate, address);
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", id=" + email + ", name=" + name + ", birthDate="
				+ birthDate + ", address=" + address + "]";
	}

}
