package org.zerock.domain.ex01;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDto {
	private String FirstName;
	private String LastName;
	private LocalDate birthDate; //날짜타입

}
