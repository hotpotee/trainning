package sample.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Sample {
	@NotNull
	private String userId;
	
	@Size(max=10,min=5,message="长度要在5-10之间")
	private String userName;
}
