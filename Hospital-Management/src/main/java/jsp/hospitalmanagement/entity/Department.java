package jsp.hospitalmanagement.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentId;
	@Column(unique = true)
	private String departmentName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private List<Doctor> doctor ;
}
