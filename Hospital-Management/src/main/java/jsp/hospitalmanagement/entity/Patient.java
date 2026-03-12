package jsp.hospitalmanagement.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	private String patientName;
	private Integer age;
	private String gender;
	@Column(unique = true)
	private Long phone;
	@Column(unique = true)
	private String email;
	 

	@JsonIgnore
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
	private List<Appointment> appointment;
	
	@JsonIgnore
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
	private List<MedicalRecord> records;
}

