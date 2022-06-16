package secondlevel.cacheimplementation;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Cacheable
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY)
public class Student1 {
	@Id	
	int id;
	String name;
	String city;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
