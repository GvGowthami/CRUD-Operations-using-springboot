package com.DailyCodeBuffer.Code_demo.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;


@Entity
@Data
@Builder
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	
	@NotBlank(message = "Please Add Department Name")
//	@Length(max=5,min=1)
//	@Size(max=10,min=0)
//	@Email
//	@Positive
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;


	

}
