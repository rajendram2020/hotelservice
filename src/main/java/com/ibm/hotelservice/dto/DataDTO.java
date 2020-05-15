package com.ibm.hotelservice.dto;

import java.util.List;

public class DataDTO {
	
	private String type;
	
	private HotelDTO hotelDTO;
	
	private Boolean available;
	
	private List<OffersDTO> offersDTO;

	public HotelDTO getHotelDTO() {
		return hotelDTO;
	}

	public void setHotelDTO(HotelDTO hotelDTO) {
		this.hotelDTO = hotelDTO;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<OffersDTO> getOffersDTO() {
		return offersDTO;
	}

	public void setOffersDTO(List<OffersDTO> offersDTO) {
		this.offersDTO = offersDTO;
	}

}
