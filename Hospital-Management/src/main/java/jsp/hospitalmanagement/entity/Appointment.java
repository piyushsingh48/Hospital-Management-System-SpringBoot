package jsp.hospitalmanagement.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
	private LocalDateTime appointmentDateTime;
	@Enumerated(EnumType.STRING)
	private AppointmentStatus status;
	
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
}
