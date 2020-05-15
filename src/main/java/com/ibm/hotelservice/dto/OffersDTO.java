package com.ibm.hotelservice.dto;

import java.util.List;

public class OffersDTO {
	
	private String id;
     private String checkInDate;
     private String checkOutDate;
     private String rateCode;
     
     private Guests guest;
     
     private Price price;
     
     public static class Price{
    	private String currency;
        private String base;
        private String total;
        private Variations variations;
        
        private List<Changes> changes;
        
        public static class Changes{
        	private String startDate;
            private String endDate;
            private String base;
			public String getStartDate() {
				return startDate;
			}
			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}
			public String getEndDate() {
				return endDate;
			}
			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}
			public String getBase() {
				return base;
			}
			public void setBase(String base) {
				this.base = base;
			}
        }
        
        public Variations getVariations() {
			return variations;
		}
		public void setVariations(Variations variations) {
			this.variations = variations;
		}
		public List<Changes> getChanges() {
			return changes;
		}
		public void setChanges(List<Changes> changes) {
			this.changes = changes;
		}
		public static class Variations{
        	private String avarage_base;

			public String getAvarage_base() {
				return avarage_base;
			}

			public void setAvarage_base(String avarage_base) {
				this.avarage_base = avarage_base;
			}
        	
        }
        
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getBase() {
			return base;
		}
		public void setBase(String base) {
			this.base = base;
		}
		public String getTotal() {
			return total;
		}
		public void setTotal(String total) {
			this.total = total;
		}
     }
	 
	 public static class Guests{
		 private Integer adults;

		public Integer getAdults() {
			return adults;
		}

		public void setAdults(Integer adults) {
			this.adults = adults;
		}
	 }
     
     private RateFamilyEstimated rateFamilyEstimated;
     
     public static class RateFamilyEstimated{
    	 
    	 private String code;
    	 
    	 private String type;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
     }
     
     private Room room;
     
     public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public static class Room{
    	 
    	 private String type;
    	 
    	 private TypeEstimated typeEstimated;
    	 
    	 private Descrption description;
    	 
    	
    	 
    	 public static class Descrption{
    		 private String lang;    		 
    		 private String text;
			public String getLang() {
				return lang;
			}
			public void setLang(String lang) {
				this.lang = lang;
			}
			public String getText() {
				return text;
			}
			public void setText(String text) {
				this.text = text;
			}
    	 }
    	 
    	 public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public TypeEstimated getTypeEstimated() {
			return typeEstimated;
		}

		public void setTypeEstimated(TypeEstimated typeEstimated) {
			this.typeEstimated = typeEstimated;
		}

		public Descrption getDescription() {
			return description;
		}

		public void setDescription(Descrption description) {
			this.description = description;
		}

		public static class TypeEstimated{
    		 
    		private String category;
            private Integer beds;
            private String bedType;
			public String getCategory() {
				return category;
			}
			public void setCategory(String category) {
				this.category = category;
			}
			public Integer getBeds() {
				return beds;
			}
			public void setBeds(Integer beds) {
				this.beds = beds;
			}
			public String getBedType() {
				return bedType;
			}
			public void setBedType(String bedType) {
				this.bedType = bedType;
			}
    	 }
    	 
     }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public Guests getGuest() {
		return guest;
	}

	public void setGuest(Guests guest) {
		this.guest = guest;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public RateFamilyEstimated getRateFamilyEstimated() {
		return rateFamilyEstimated;
	}

	public void setRateFamilyEstimated(RateFamilyEstimated rateFamilyEstimated) {
		this.rateFamilyEstimated = rateFamilyEstimated;
	}



}
