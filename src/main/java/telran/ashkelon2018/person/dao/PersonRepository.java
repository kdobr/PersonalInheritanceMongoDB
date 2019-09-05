package telran.ashkelon2018.person.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import telran.ashkelon2018.person.domain.Person;

public interface PersonRepository extends MongoRepository<Person, String> {
	List<Person> findByBirthDateBetween (LocalDate fromDate, LocalDate toDate);
	List<Person> findByAddressCity (String city);
	
	@Query("{'salary': {'$gte':?0, '$lte':?1}}")
	List<Person> findBySalaryBetween (int minSalart, int maxSalary);

}
