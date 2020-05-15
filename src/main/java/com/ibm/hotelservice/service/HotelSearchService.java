package com.ibm.hotelservice.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.resources.HotelOffer;
import com.ibm.hotelservice.config.SecurityConfiguration;
import com.ibm.hotelservice.dto.HotelSearchRequestDTO;
import com.ibm.hotelservice.dto.HotelSearchResponseDTO;
import com.ibm.hotelservice.dto.ResponseMapper;

@Service
public class HotelSearchService {

	private final static Logger logger = Logger.getLogger(HotelSearchService.class.getName());

	@Autowired
	private SecurityConfiguration configuaration;

	public HotelSearchResponseDTO searchHotel(HotelSearchRequestDTO hotelSearchRequestDTO) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date checkInDate = null;
		Date checkOutDate = null;

		try {
			checkInDate = format.parse(hotelSearchRequestDTO.getCheckInDate());

			checkOutDate = format.parse(hotelSearchRequestDTO.getCheckOutDate());

		} catch (Exception exp) {

		}

		Amadeus amadeus = getAmadeusConnection();

		HotelOffer[] offers = null;

		try {

			offers = amadeus.shopping.hotelOffers.get(Params.with("cityCode", hotelSearchRequestDTO.getCityCode())
					.and("checkInDate", checkInDate).and("checkOutDate", checkOutDate)
					.and("roomQuantity", hotelSearchRequestDTO.getRoomQuantity())
					.and("adults", hotelSearchRequestDTO.getAdults()));
			if (offers[0].getResponse().getStatusCode() != 200) {
				System.out.println(
						"Wrong status code for Hotel 1st endpoint: " + offers[0].getResponse().getStatusCode());
				System.exit(-1);
			}

		} catch (Exception exp) {

		}
		List<HotelOffer> hotelOffer = Arrays.asList(offers);
		ResponseMapper responseMapper = new ResponseMapper();
		HotelSearchResponseDTO hotelSearchResponse = responseMapper.converter(hotelOffer);

		return hotelSearchResponse;

	}

	public HotelSearchResponseDTO searchHotelById(String hotelID) {

		Amadeus amadeus = getAmadeusConnection();

		HotelOffer hotelOffer = null;

		try {
			hotelOffer = amadeus.shopping.hotelOffersByHotel.get(Params.with("hotelId", hotelID));
			if (hotelOffer.getResponse().getStatusCode() != 200) {
				System.out.println(
						"Wrong status code for Hotel 2nd endpoint: " + hotelOffer.getResponse().getStatusCode());
				System.exit(-1);
			}
		} catch (Exception exp) {

		}
		List<HotelOffer> listHotelOffer = new ArrayList<HotelOffer>();
		listHotelOffer.add(hotelOffer);

		ResponseMapper responseMapper = new ResponseMapper();
		HotelSearchResponseDTO hotelSearchResponse = responseMapper.converter(listHotelOffer);

		return hotelSearchResponse;

	}

	public Amadeus getAmadeusConnection() {
		Amadeus amadeus = Amadeus.builder(configuaration.getClientId(), configuaration.getClientSecret())
				.setLogger(logger).setLogLevel("debug").build();

		return amadeus;
	}

}
