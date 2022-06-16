package firstlevel.cacheimplementation;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
@Id	
int id;
String name;
String city;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}


}
