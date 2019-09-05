package telran.ashkelon2018;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import telran.ashkelon2018.person.domain.Address;
import telran.ashkelon2018.person.domain.Child;
import telran.ashkelon2018.person.domain.Employee;
import telran.ashkelon2018.person.domain.Person;
import telran.ashkelon2018.person.service.PersonService;

@SpringBootApplication
public class PersonalInheritanceMongoDbApplication implements CommandLineRunner {

	@Autowired
	PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonalInheritanceMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	List<Person> persons = new ArrayList<>();
//	Address[] addresses = {
//			new Address("Ashkelon", "Bar Cohba", 209, 100500),
//			new Address("Rehovot", "Plaut", 10, 3),
//			new Address("Holon", "Hertzl", 3, 15)
//	};
//	persons.add(new Child("peter@gmail.com", "Peter", LocalDate.of(2014, 4, 12), addresses[2], "shalom"));
//	persons.add(new Child("vasya@gmail.com", "Vasya", LocalDate.of(2014, 4, 12), addresses[2], "shalom"));
//	persons.add(new Employee("jonh@gmail.com", "John", LocalDate.of(1996, 6, 12), addresses[1], "Motorolla", 16000));
//	persons.add(new Employee("jein@gmail.com", "Jein", LocalDate.of(1999, 11, 8), addresses[0], "IBM", 21000));
//	personService.addPersons(persons);
	}
}
