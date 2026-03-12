package jsp.hospitalmanagement.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	private String doctorName;
	private String specialization;
	private List<String> availableDays;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
	private List<MedicalRecord> records;
	
	@JsonIgnore
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
	private List<Appointment> appointment;
}
