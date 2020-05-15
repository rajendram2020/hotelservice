package com.ibm.hotelservice.dto;

import java.util.List;

public class HotelSearchResponseDTO {
	
	private List<DataDTO> data;

	public List<DataDTO> getData() {
		return data;
	}

	public void setData(List<DataDTO> data) {
		this.data = data;
	}	

}
