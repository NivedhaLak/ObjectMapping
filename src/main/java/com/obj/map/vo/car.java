package com.obj.map.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class car {
	Long id;
	String name;
	String desc;
	String type;
	String noOfTyre;
	wheel wheel;
	tank tank;
}
