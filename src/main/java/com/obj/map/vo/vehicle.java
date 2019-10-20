package com.obj.map.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class vehicle {
	Long id;
	String name;
	String desc;
	Date manuf;
	car car;
	bike bike;
	auto auto;
}
