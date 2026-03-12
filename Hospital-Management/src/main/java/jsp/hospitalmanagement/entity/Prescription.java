package jsp.hospitalmanagement.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prescriptionId;
	private String medicine;
	private String dosage;
	private String instruction;
	
	@OneToOne
	@JoinColumn(name = "medicalrecord_id", unique = true)
	private MedicalRecord medicalRecord;
}
