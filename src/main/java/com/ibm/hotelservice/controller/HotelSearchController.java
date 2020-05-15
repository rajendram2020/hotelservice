package com.ibm.hotelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.hotelservice.dto.HotelSearchRequestDTO;
import com.ibm.hotelservice.dto.HotelSearchResponseDTO;
import com.ibm.hotelservice.service.HotelSearchService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
public class HotelSearchController {
	
	@Autowired
	HotelSearchService hotelSearchService;
	 
	@ApiOperation("Provide all the hotel offers for given location.")
	@PostMapping(value="/hotel")
	public ResponseEntity<HotelSearchResponseDTO> searchHotel(@RequestBody HotelSearchRequestDTO hotelSearchRequestDTO) {			
		
		 
        return ResponseEntity.ok().body(hotelSearchService.searchHotel(hotelSearchRequestDTO)); 
    }
	
	@ApiOperation("Provide all the hotel offers for given hotelID.")
	@GetMapping(value="/hotel/{hotelID}")
	public ResponseEntity<HotelSearchResponseDTO> searchHotelById(@PathVariable(value = "hotelID") String hotelID) {			
		
		 
        return ResponseEntity.ok().body(hotelSearchService.searchHotelById(hotelID)); 
    }

}
