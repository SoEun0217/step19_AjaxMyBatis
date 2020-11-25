package kosta.mvc.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
	private String stNo;
	private String stName;
	private int stAge;
	private String stPhone;
	private String stAddr;

}
