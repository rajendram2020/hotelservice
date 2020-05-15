package com.ibm.hotelservice.dto;

import java.util.List;

public class HotelBookRequestDTO {
	


	public HotelBookRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Data data;
	
	public static class Data{
		
	

		public Data() {
			super();
			// TODO Auto-generated constructor stub
		}

		private String offerId;
		
		private List<GuestsDTO> guests;
		
		private List<Payment> payments;
		
		private List<Rooms> rooms;
		
		public static class Rooms{
			public Rooms() {
				super();
				// TODO Auto-generated constructor stub
			}

			private List<Integer> guestIds;
			
			private Integer paymentId;
			
			private String specialRequest;

			public List<Integer> getGuestIds() {
				return guestIds;
			}

			public void setGuestIds(List<Integer> guestIds) {
				this.guestIds = guestIds;
			}

			public Integer getPaymentId() {
				return paymentId;
			}

			public void setPaymentId(Integer paymentId) {
				this.paymentId = paymentId;
			}

			public String getSpecialRequest() {
				return specialRequest;
			}

			public void setSpecialRequest(String specialRequest) {
				this.specialRequest = specialRequest;
			}
		}

		
		public static class Payment{
			
			public Payment() {
				super();
				// TODO Auto-generated constructor stub
			}

			private Integer id;
			private String method;
			
			private Card card;
			
			public static class Card{
				
				public Card() {
					super();
					// TODO Auto-generated constructor stub
				}
				private String vendorCode;
		        private String cardNumber;
		        private String expiryDate;
				public String getVendorCode() {
					return vendorCode;
				}
				public void setVendorCode(String vendorCode) {
					this.vendorCode = vendorCode;
				}
				public String getCardNumber() {
					return cardNumber;
				}
				public void setCardNumber(String cardNumber) {
					this.cardNumber = cardNumber;
				}
				public String getExpiryDate() {
					return expiryDate;
				}
				public void setExpiryDate(String expiryDate) {
					this.expiryDate = expiryDate;
				}
			}

			public String getMethod() {
				return method;
			}

			public void setMethod(String method) {
				this.method = method;
			}

			public Card getCard() {
				return card;
			}

			public void setCard(Card card) {
				this.card = card;
			}

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
			
		}

		public String getOfferId() {
			return offerId;
		}

		public void setOfferId(String offerId) {
			this.offerId = offerId;
		}

	

		public List<GuestsDTO> getGuests() {
			return guests;
		}

		public void setGuests(List<GuestsDTO> guests) {
			this.guests = guests;
		}

		public List<Rooms> getRooms() {
			return rooms;
		}

		public void setRooms(List<Rooms> rooms) {
			this.rooms = rooms;
		}

		public List<Payment> getPayments() {
			return payments;
		}

		public void setPayments(List<Payment> payments) {
			this.payments = payments;
		}
		
		
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
