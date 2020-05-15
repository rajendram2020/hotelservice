package com.ibm.hotelservice.dto;

import java.util.List;

public class HotelDTO {
	
	private String type;
	
	private String hotelId;
    private String chainCode;
    private String dupeId;
    private String name;
    private Integer rating;
    private String cityCode;
    private Double latitude;
    private Double longitude;
    private HotelDistance hotelDistance;
 
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getChainCode() {
		return chainCode;
	}

	public void setChainCode(String chainCode) {
		this.chainCode = chainCode;
	}

	public String getDupeId() {
		return dupeId;
	}

	public void setDupeId(String dupeId) {
		this.dupeId = dupeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public HotelDistance getHotelDistance() {
		return hotelDistance;
	}

	public void setHotelDistance(HotelDistance hotelDistance) {
		this.hotelDistance = hotelDistance;
	}

	  
    
    public static class HotelDistance{
    	
    	private Double distance;
       private String distanceUnit;
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public String getDistanceUnit() {
		return distanceUnit;
	}
	public void setDistanceUnit(String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
    	
    }
    
    private  Address address;
    
    public  static class Address{
    	private List<String> lines;    	
        private String postalCode;
    	private String cityName;
    	private String countryCode;
		public List<String> getLines() {
			return lines;
		}
		public void setLines(List<String> lines) {
			this.lines = lines;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
    }
    
    private Contact contact;
    
    public static class Contact{
    	private String phone;    	
    	private String fax;
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getFax() {
			return fax;
		}
		public void setFax(String fax) {
			this.fax = fax;
		}
    }
    
    private Description description;
    
    public static class Description{
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
    
    private List<String> amenities;
    
  
    private OffersDTO offer;
    private List<Media> media;
    
    public static class Media{
    	private String uri;
    	
    	private String category;

		public String getUri() {
			return uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
    	
    }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public List<String> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}

	
	public OffersDTO getOffer() {
		return offer;
	}

	public void setOffer(OffersDTO offer) {
		this.offer = offer;
	}

	public List<Media> getMedia() {
		return media;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}
    
  

}
