package com.obj.map.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class bikeDTO {
	Long id;
	String name;
	String desc;
	String type;
	String noOfTyre;
	wheelDTO wheel;
	tankDTO tank;
}
