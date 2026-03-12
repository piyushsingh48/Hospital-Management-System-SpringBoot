package jsp.hospitalmanagement.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  recordId;
	private String diagnosis;
	private String treatment;
	private LocalDate visitDate;
	
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@OneToOne(mappedBy = "medicalRecord", cascade = CascadeType.ALL)
	@JsonIgnore
	private Prescription prescription;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;	 
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "appointment_id", unique = true)
	private Appointment appointment;
	
}
