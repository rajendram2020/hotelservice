package com.ibm.hotelservice.dto;

import java.util.ArrayList;
import java.util.List;

import com.amadeus.resources.HotelBooking;
import com.amadeus.resources.HotelBooking.AssociatedRecord;

public class HotelBookResponseMapper {
	
	public HotelBookResponseDTO convert(List<HotelBooking> hotelBooks) {
		
		HotelBookResponseDTO responseDTO=new HotelBookResponseDTO();
		
		List<HotelBookResponseDTO.Data> listDataDTO= new ArrayList<HotelBookResponseDTO.Data>();
		
		for (HotelBooking hotelBook : hotelBooks) {
			HotelBookResponseDTO.Data dataDTO=new HotelBookResponseDTO.Data();
			dataDTO.setType(hotelBook.getType());
			dataDTO.setId(hotelBook.getId());
			dataDTO.setProviderConfirmationId(hotelBook.getProviderConfirmationId());
			AssociatedRecord associatedRecord=hotelBook.getAssociatedRecords();
			HotelBookResponseDTO.Data.AssociatedRecord associatedRecordDTO=new HotelBookResponseDTO.Data.AssociatedRecord();
			
			associatedRecordDTO.setOriginSystemCode(associatedRecord.getOriginSystemCode());
			associatedRecordDTO.setReference(associatedRecord.getReference());
			dataDTO.setAssociatedRecords(associatedRecordDTO);
			
			listDataDTO.add(dataDTO);
			
			
		}
		
		responseDTO.setData(listDataDTO);
		
		return responseDTO;
		
	}

}
