package com.wizard.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse {
   private Boolean status;
   private HttpStatus statusCode;
   private String message;
   private Object data;
}
