package com.ibm.hotelservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeus.Amadeus;
import com.amadeus.resources.HotelBooking;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.ibm.hotelservice.config.SecurityConfiguration;
import com.ibm.hotelservice.dto.HotelBookRequestDTO;
import com.ibm.hotelservice.dto.HotelBookResponseDTO;
import com.ibm.hotelservice.dto.HotelBookResponseMapper;

@Service
public class HotelBookService {
	
	private final static Logger logger = Logger.getLogger(HotelBookService.class.getName());

	@Autowired
	private SecurityConfiguration configuaration;
	
	public HotelBookResponseDTO bookHotel(HotelBookRequestDTO hotelBookRequestDTO) {
		
		Amadeus amadeus=getAmadeusConnection();
		
		HotelBooking[] hotelBook=null;
		
		ObjectMapper mapper=new ObjectMapper();
		
		//Gson gson = new Gson();
		
		
		try {
			String jsonInString=mapper.writeValueAsString(hotelBookRequestDTO);
			
			//String jsonInString = gson.toJson(hotelBookRequestDTO);
			
			hotelBook=amadeus.booking.hotelBookings.post(jsonInString);
			
		}catch(Exception exp) {
			
		}
		
		//System.out.println(hotelBook[0]);
		
		
				
				List<HotelBooking> hotelBook1 = Arrays.asList(hotelBook);
				HotelBookResponseMapper responseMapper = new HotelBookResponseMapper();
				
				HotelBookResponseDTO hotelBookResponseDTO=responseMapper.convert(hotelBook1);
		
		return hotelBookResponseDTO;
		
	}
	
	public Amadeus getAmadeusConnection() {
		Amadeus amadeus = Amadeus.builder(configuaration.getClientId(), configuaration.getClientSecret())
				.setLogger(logger).setLogLevel("debug").build();

		return amadeus;
	}


}
