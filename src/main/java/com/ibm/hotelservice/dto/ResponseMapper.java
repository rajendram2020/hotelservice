package com.ibm.hotelservice.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.amadeus.resources.HotelOffer;
import com.amadeus.resources.HotelOffer.AddressType;
import com.amadeus.resources.HotelOffer.EstimatedRoomType;
import com.amadeus.resources.HotelOffer.Guests;
import com.amadeus.resources.HotelOffer.Hotel;
import com.amadeus.resources.HotelOffer.HotelContact;
import com.amadeus.resources.HotelOffer.HotelDistance;
import com.amadeus.resources.HotelOffer.HotelPrice;
import com.amadeus.resources.HotelOffer.MediaURI;
import com.amadeus.resources.HotelOffer.Offer;
import com.amadeus.resources.HotelOffer.PriceVariation;
import com.amadeus.resources.HotelOffer.RateFamily;
import com.amadeus.resources.HotelOffer.RoomDetails;
import com.amadeus.resources.HotelOffer.TextWithLanguageType;

public class ResponseMapper {
	
	
	public HotelSearchResponseDTO converter(List<HotelOffer> hotelOffers) {
		
		HotelSearchResponseDTO hotelSearchResponseDTO=new HotelSearchResponseDTO();
		
		List<DataDTO> listDataDTO=new ArrayList<DataDTO>();
		
		for (HotelOffer hotelOffer : hotelOffers) {
			
			DataDTO dataDTO=new DataDTO();
			
			dataDTO.setType(hotelOffer.getType());
			
			Hotel hotel=hotelOffer.getHotel();
			
			HotelDTO hotelDTO=new HotelDTO();
			hotelDTO.setType(hotel.getType());
			hotelDTO.setHotelId(hotel.getHotelId());
			hotelDTO.setChainCode(hotel.getChainCode());
			hotelDTO.setDupeId(hotel.getDupeId());
			hotelDTO.setName(hotel.getName());
			hotelDTO.setRating(hotel.getRating());
			hotelDTO.setCityCode(hotel.getCityCode());
			hotelDTO.setLatitude(hotel.getLatitude());
			hotelDTO.setLongitude(hotel.getLongitude());
			
			//Hotel Distance
			
			HotelDistance hotelDistance=hotel.getHotelDistance();
			
			HotelDTO.HotelDistance hotelDistanceDTO=new HotelDTO.HotelDistance();
			
			if(hotelDistance!=null) {
			hotelDistanceDTO.setDistance(hotelDistance.getDistance());
			
			hotelDistanceDTO.setDistanceUnit(hotelDistance.getDistanceUnit()); 
			}
			
			hotelDTO.setHotelDistance(hotelDistanceDTO);
			
			//Hotel address
			AddressType addressType=hotel.getAddress();
			HotelDTO.Address addressDTO=new HotelDTO.Address();
			addressDTO.setLines(Arrays.asList(addressType.getLines()));
			
			addressDTO.setPostalCode(addressType.getPostalCode());
			addressDTO.setCountryCode(addressType.getCountryCode());
			addressDTO.setCityName(addressType.getCityName());
			
			hotelDTO.setAddress(addressDTO);
			
			//Hotel Contact
			HotelContact hotelContact=hotel.getContact();
			HotelDTO.Contact contactDTO=new HotelDTO.Contact();
			
			contactDTO.setFax(hotelContact.getFax());
			contactDTO.setPhone(hotelContact.getPhone());
			
			hotelDTO.setContact(contactDTO);
			
			// Hotel description
			
			/*Optional<TextWithLanguageType> description=Optional.of(hotel.getDescription());
			HotelDTO.Description descriptionDTO=new HotelDTO.Description();
			if(description.isPresent()) {
			descriptionDTO.setLang(description.get().getLang());
			descriptionDTO.setText(description.get().getText());
			}*/
			if(hotel.getAmenities()!=null && hotel.getAmenities().length > 0) {
			hotelDTO.setAmenities(Arrays.asList(hotel.getAmenities()));
			}
		
			
			//Hotel Media
			if(hotel.getMedia()!=null && hotel.getMedia().length > 0) { 
			MediaURI mediaURIs[]=hotel.getMedia();
			
			List<HotelDTO.Media> listMediaDTO=new ArrayList<HotelDTO.Media>();
			for(MediaURI mediaURI: mediaURIs) {
				HotelDTO.Media mediaDTO=new HotelDTO.Media();
				mediaDTO.setCategory(mediaURI.getCategory());
				mediaDTO.setUri(mediaURI.getUri());
				listMediaDTO.add(mediaDTO);
			}
			
			hotelDTO.setMedia(listMediaDTO);
			
			}
			
			dataDTO.setHotelDTO(hotelDTO);
			dataDTO.setAvailable(hotelOffer.isAvailable());
			
			// Offers section
			Offer[] offers=hotelOffer.getOffers();
			List<OffersDTO> listOffersDTO=new ArrayList<OffersDTO>();
			
			for(Offer offer:offers) {
				OffersDTO offerDTO=new OffersDTO();
				offerDTO.setId(offer.getId());
				offerDTO.setRateCode(offer.getRateCode());	
				
			// RateFamily	
				OffersDTO.RateFamilyEstimated rateFamilyEstimated=new OffersDTO.RateFamilyEstimated();	
			
				RateFamily rateFamily=offer.getRateFamilyEstimated();
				if(rateFamily!=null) {
				rateFamilyEstimated.setCode(rateFamily.getCode());
				rateFamilyEstimated.setType(rateFamily.getType());
				}
				
				offerDTO.setRateFamilyEstimated(rateFamilyEstimated);
				
			//Room
				RoomDetails roomDetails=offer.getRoom();
				OffersDTO.Room roomDTO=new OffersDTO.Room();
				
				OffersDTO.Room.TypeEstimated typeEstimatedDTO=new OffersDTO.Room.TypeEstimated();
				
				roomDTO.setType(roomDetails.getType());
				
				
				
				EstimatedRoomType estimatedRoomType=roomDetails.getTypeEstimated();
				
				typeEstimatedDTO.setBeds(estimatedRoomType.getBeds());
				typeEstimatedDTO.setBedType(estimatedRoomType.getBedType());
				typeEstimatedDTO.setCategory(estimatedRoomType.getCategory());
				
				roomDTO.setTypeEstimated(typeEstimatedDTO);
				
				
				
				OffersDTO.Room.Descrption offersDescriptionDTO=new OffersDTO.Room.Descrption();
				TextWithLanguageType type=roomDetails.getDescription();
				
				offersDescriptionDTO.setLang(type.getLang());
				offersDescriptionDTO.setText(type.getText());
				
				roomDTO.setDescription(offersDescriptionDTO);
				
				offerDTO.setRoom(roomDTO);
				
				// Guests
				Guests guests=offer.getGuests();
				OffersDTO.Guests guestsDTO=new OffersDTO.Guests();
				
				guestsDTO.setAdults(guests.getAdults());
				
				offerDTO.setGuest(guestsDTO);
				
				//Price
				OffersDTO.Price priceDTO=new OffersDTO.Price();
				HotelPrice hotelPrice=offer.getPrice();
				
				priceDTO.setCurrency(hotelPrice.getCurrency());
				priceDTO.setTotal(hotelPrice.getTotal());
				priceDTO.setBase(hotelPrice.getBase());
				
				
				
				
				PriceVariation priceVariations[]=hotelPrice.getVariations().getChanges();
				List<OffersDTO.Price.Changes> listChangesDTO=new ArrayList<OffersDTO.Price.Changes>();
				for(PriceVariation priceVariation:priceVariations) {
					OffersDTO.Price.Changes changes=new OffersDTO.Price.Changes();
					changes.setStartDate(priceVariation.getStartDate());
					changes.setEndDate(priceVariation.getEndDate());
					changes.setBase(priceVariation.getBase());
					listChangesDTO.add(changes);
					
				}
				
				priceDTO.setChanges(listChangesDTO);
				offerDTO.setPrice(priceDTO);
				listOffersDTO.add(offerDTO);
			}
			
		
			dataDTO.setOffersDTO(listOffersDTO);
			listDataDTO.add(dataDTO);
			
			}
		
		
		hotelSearchResponseDTO.setData(listDataDTO);
		
		
	
		return hotelSearchResponseDTO;
}
}