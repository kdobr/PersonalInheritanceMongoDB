package telran.ashkelon2018.person.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Child extends Person {
	String kindergarten;

	public Child(String email, String name, LocalDate birthDate, Address address, String kindergarten) {
		super(email, name, birthDate, address);
		this.kindergarten = kindergarten;
	}

	@Override
	public String toString() {
		return "Child [kindergarten=" + kindergarten + ", id=" + email + ", name=" + name + ", birthDate=" + birthDate
				+ ", address=" + address + "]";
	}

}
