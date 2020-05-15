package com.ibm.hotelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.hotelservice.dto.HotelBookRequestDTO;
import com.ibm.hotelservice.dto.HotelBookResponseDTO;
import com.ibm.hotelservice.service.HotelBookService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
public class HotelBookingController {
	
	
	@Autowired
	HotelBookService hotelBookService;
	
	@ApiOperation("Reserve the hotel for given hotel offerID, name and contact number")
	@PostMapping(value="/hotel/book")
	public ResponseEntity<HotelBookResponseDTO> bookHotel(@RequestBody HotelBookRequestDTO hotelBookRequestDTO) {			
		
		 
        return ResponseEntity.ok().body(hotelBookService.bookHotel(hotelBookRequestDTO)); 
    }

}
