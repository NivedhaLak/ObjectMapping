package com.obj.map;

public class SampleJSON {
	private SampleJSON() {

	}

	public static String sample1 = "{\r\n" + "  \"id\": 20,\r\n" + "  \"name\": \"test1\",\r\n"
			+ "  \"desc\": \"testing vehicle 1\",\r\n" + "  \"manuf\": \"2019-20-10\",\r\n" + "  \"car\": {\r\n"
			+ "    \"id\": 22,\r\n" + "    \"name\": \"car\",\r\n" + "    \"desc\": \"nano \",\r\n"
			+ "    \"type\": \"electric\",\r\n" + "    \"noOfTyre\": \"4\",\r\n" + "    \"wheel\": {\r\n"
			+ "      \"id\": 1,\r\n" + "      \"name\": \"xco\",\r\n" + "      \"desc\": \"wheel\",\r\n"
			+ "      \"type\": \"tubeless tyre\"\r\n" + "    },\r\n" + "    \"tank\": {\r\n" + "      \"id\": 2,\r\n"
			+ "      \"name\": \"tanks\",\r\n" + "      \"size\": \"15L\",\r\n" + "      \"descSize\": \"syntax\"\r\n"
			+ "    }\r\n" + "  }\r\n" + "}";

	public static String sample2 = "{\r\n" + "  \"id\": 22,\r\n" + "  \"name\": \"car\",\r\n"
			+ "  \"desc\": \"nano \",\r\n" + "  \"type\": \"electric\",\r\n" + "  \"noOfTyre\": \"4\",\r\n"
			+ "  \"wheel\": {\r\n" + "    \"id\": 1,\r\n" + "    \"name\": \"xco\",\r\n"
			+ "    \"desc\": \"wheel\",\r\n" + "    \"type\": \"tubeless tyre\"\r\n" + "  },\r\n" + "  \"tank\": {\r\n"
			+ "    \"id\": 2,\r\n" + "    \"name\": \"tanks\",\r\n" + "    \"descSize\": \"syntax\",\r\n"
			+ "    \"size\": \"15L\"\r\n" + "  }\r\n" + "}";

}
