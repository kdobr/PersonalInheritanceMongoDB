package telran.ashkelon2018.person.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telran.ashkelon2018.person.dao.PersonRepository;
import telran.ashkelon2018.person.domain.Address;
import telran.ashkelon2018.person.domain.Person;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonRepository repositiry;

	@Override
	public boolean addPerson(Person person) {
		
		if (repositiry.existsById(person.getEmail()))
		{return false;}
		repositiry.save(person);
		return true;
	}

	@Override
	public void addPersons(Iterable<Person> persons) {
		repositiry.saveAll(persons);
		
	}

	@Override
	public Person getPerson(String email) {
		return repositiry.findById(email).orElse(null);
	}

	@Override
	public boolean updateAdress(String email, Address address) {
		Person person = repositiry.findById(email).orElse(null);
		if (person==null)
		{return false;}
		person.setAddress(address);
		repositiry.save(person);
		return true;
		
	}

	@Override
	public Person remove(String email) {
		Person person = repositiry.findById(email).orElse(null);
		repositiry.deleteById(email);
		return person;
	}

	@Override
	public List<Person> getPersonByAge(int minAge, int maxAge) {
	LocalDate from = LocalDate.now().minusYears(maxAge);
	LocalDate to = LocalDate.now().minusYears(minAge);
		return repositiry.findByBirthDateBetween(from, to);
	}

	@Override
	public List<Person> getPersonsByCity(String city) {
		
		return repositiry.findByAddressCity(city);
	}

	@Override
	public List<Person> getEmployeesBySalary(int minSalary, int maxSalary) {
		
		return repositiry.findBySalaryBetween(minSalary, maxSalary);
	}

}
