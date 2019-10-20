package com.obj.map;

import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.obj.map.DTO.carDTO;
import com.obj.map.DTO.carDTO2;
import com.obj.map.DTO.tankDTO;
import com.obj.map.DTO.vehicleDTO;
import com.obj.map.DTO.wheelDTO;
import com.obj.map.vo.car;
import com.obj.map.vo.vehicle;

public class ObjectUtility {
	public static ObjectMapper obj = new ObjectMapper();
	public static ModelMapper model = new ModelMapper();
	public static vehicle vehicle = null;
	public static vehicleDTO vehicleDTO = null;
	public static car car = null;
	public static carDTO carDTO = null;

	public static void main(String[] args) {
		try {
			System.out.println("-----------VO sample 1:--------------- ");
			vehicle = obj.readValue(SampleJSON.sample1, vehicle.class);
			System.out.println("done VO sample 1: " + obj.writeValueAsString(vehicle));
			vehicleDTO = model.map(vehicle, vehicleDTO.class);
			System.out.println("\n done DTO sample 1: " + obj.writeValueAsString(vehicleDTO));
			System.out.println("-----------Done VO sample 1:--------------- ");
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("-----------VO sample 2:--------------- ");
			car = obj.readValue(SampleJSON.sample2, car.class);
			System.out.println("done VO sample 2: " + car.getId());
			carDTO = model.map(car, carDTO.class);
			System.out.println("done DTO sample 2: " + obj.writeValueAsString(carDTO));
			carDTO2 carDTO2 = model.map(car, carDTO2.class);
			System.out.println("\ndone-carDTO2 sample 2: " + obj.writeValueAsString(carDTO2));
			System.out.println("-----------Done VO sample 2:--------------- ");
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		/*
		 * try {
		 * 
		 * System.out.println("sample2 obj.writeValueAsString(new carDTO()));
		 * System.out.println(obj.writeValueAsString(new wheelDTO()));
		 * System.out.println(obj.writeValueAsString(new tankDTO())); } catch
		 * (JsonMappingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (JsonProcessingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
