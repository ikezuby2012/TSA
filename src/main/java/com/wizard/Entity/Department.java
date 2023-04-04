package com.wizard.Entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Document(collection = "department")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {
   @Id
   private String _id;
   @NotBlank(message ="Department name is required!")
   @Size(max = 128)
   @Length(min= 2, message = "Department name is too short")
   private String departmentName;

   private String departmentAddress;

   private String departmentCode;
}
