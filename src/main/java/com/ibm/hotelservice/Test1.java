package com.ibm.hotelservice;

import com.google.gson.JsonObject;

import springfox.documentation.spring.web.json.Json;

public class Test1 {
	
public static void main(String args[])throws Exception {
		
	JsonObject jsonValue=new JsonObject();
	
	 
	jsonValue.getAsJsonObject("data")
				  .addProperty("offerId", "value");
				  
	jsonValue.getAsJsonObject("guests");
	
				    
	jsonValue.addProperty("id","value");
	/*jsonValue.addProperty("name", Json.createObjectBuilder()
				    	.add("title", hotelBookRequestDTO.getData().getGuests().get(0).getName().getTitle())
				    	.add("firstName", hotelBookRequestDTO.getData().getGuests().get(0).getName().getFirstName())
				    	.add("lastName", hotelBookRequestDTO.getData().getGuests().get(0).getName().getLastName()))
				      .add("contact", Json.createObjectBuilder()
				       .add("phone", hotelBookRequestDTO.getData().getGuests().get(0).getContact().getPhone())
				       .add("email", hotelBookRequestDTO.getData().getGuests().get(0).getContact().getEmail()))))	    	
				    	
				  .add("payments", Json.createArrayBuilder()
				    		.add(Json.createObjectBuilder()
				  	  .add("id", hotelBookRequestDTO.getData().getPayment().get(0).getId())
				  	  .add("method",hotelBookRequestDTO.getData().getPayment().get(0).getMethod())
				      .add("card", Json.createObjectBuilder()
				    	   .add("vendorCode", hotelBookRequestDTO.getData().getPayment().get(0).getCard().getVendorCode())
				    	   .add("cardNumber", hotelBookRequestDTO.getData().getPayment().get(0).getCard().getCardNumber())
				    	   .add("expiryDate", hotelBookRequestDTO.getData().getPayment().get(0).getCard().getExpiryDate()))))
				  .add("rooms", Json.createArrayBuilder()
				    		.add(Json.createObjectBuilder()
				    	.add("guestIds", 
				    			Json.createArrayBuilder().add(hotelBookRequestDTO.getData().getRooms().get(0).getGuestIds().get(0)))
				    	.add("paymentId", hotelBookRequestDTO.getData().getRooms().get(0).getPaymentId())
				    	.add("specialRequest", hotelBookRequestDTO.getData().getRooms().get(0).getSpecialRequest()))))
				     .build();*/
	
	
		
		System.out.println(jsonValue);
	}

}
