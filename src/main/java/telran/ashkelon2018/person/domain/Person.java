package telran.ashkelon2018.person.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = { "email" })

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public abstract class Person {
	@Id
	String email;
	@Setter String name;
	@JsonFormat(pattern = "yyyy-MM-dd")
	LocalDate birthDate;
	@Setter Address address;

}
