package jsp.hospitalmanagement.dto;

import java.time.LocalDateTime;

import jsp.hospitalmanagement.entity.AppointmentStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentRequest {
	
	    private LocalDateTime appointmentDateTime;
	    private AppointmentStatus status;
	    private Integer patientId;
	    private Integer doctorId;
	
}
