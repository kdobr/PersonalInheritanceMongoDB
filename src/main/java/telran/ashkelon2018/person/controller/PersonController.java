package telran.ashkelon2018.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import telran.ashkelon2018.person.domain.Address;
import telran.ashkelon2018.person.domain.Person;
import telran.ashkelon2018.person.dto.SalaryDto;
import telran.ashkelon2018.person.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping ("/person")
   public boolean addPerson (@RequestBody Person person) {
	   return personService.addPerson(person);
   }
	
	
	@PostMapping ("/persons")
	public void addPersons (@RequestBody Iterable<Person> persons) {
		personService.addPersons(persons);
		
	}
	
	public Person getPerson (@PathVariable String email) {
		return personService.getPerson(email);
	}
	
	@PutMapping ("/person/{email}/adress")
	public boolean updateAdress(@PathVariable String email,@RequestBody Address address) {
	return personService.updateAdress(email, address);	
	}
	
	@DeleteMapping
	public Person removePerson (@PathVariable String email) {
		return personService.remove(email);
	}
	
	@GetMapping ("/persons/age")
	public List<Person> getPersonByAge (@RequestParam int min, @RequestParam int max){
		return personService.getPersonByAge(min, max);
	
	}
	
	@GetMapping ("/persons/city/{city}")
	public List<Person> getPersonsByCity (@PathVariable String city){
		return personService.getPersonsByCity(city);
		
	}
	
	@PostMapping("/employee/salary")
	public List<Person> getEmployeesBySalary (@RequestBody SalaryDto salaryDto){
	return personService.getEmployeesBySalary(salaryDto.getMinSalary(), salaryDto.getMaxSalary());	
		
	}

}
