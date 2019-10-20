package com.obj.map.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class carDTO {
	Long id;
	String name;
	String desctey;
	String type;
	String noOfTyre;
	wheelDTO wheel;
	tankDTO tank;
}
