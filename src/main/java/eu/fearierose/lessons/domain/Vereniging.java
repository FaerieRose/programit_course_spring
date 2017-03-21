package eu.fearierose.lessons.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * 
 * @author FaerieRose
 */
@Entity
public class Vereniging {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	
	@OneToMany(fetch=FetchType.EAGER)
	@Fetch(FetchMode.SELECT)
	private List<Student> students = new ArrayList<Student>();

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
}
