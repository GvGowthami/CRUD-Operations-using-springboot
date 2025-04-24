package com.DailyCodeBuffer.Code_demo.Error;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
	
	private HttpStatus status;
	private String message;
	

}
