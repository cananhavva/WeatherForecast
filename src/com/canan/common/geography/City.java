package com.canan.common.geography;

import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class City {
	@BsonProperty(value = "city_name")
	private String name;
	@BsonProperty(value = "latitude")
	private double latitude;
	@BsonProperty(value = "longitude")
	private double longitude;
	@BsonProperty(value = "altitude")
	private double altitude;
	@BsonProperty(value = "city_code")
	private String cityCode;
	@BsonProperty(value = "city_population")
	private long population;
	
}