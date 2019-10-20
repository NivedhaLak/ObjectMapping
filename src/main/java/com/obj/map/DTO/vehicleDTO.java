package com.obj.map.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class vehicleDTO {
	Long id;
	String name;
	String desc;
	Date manuf;
	carDTO2 car;
	bikeDTO bike;
	autoDTO auto;
}
