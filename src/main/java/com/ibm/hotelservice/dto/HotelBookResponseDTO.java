package com.ibm.hotelservice.dto;

import java.util.List;

public class HotelBookResponseDTO {
	
	private List<Data> data;
	
	public static class Data{
		
		private String type;
	    private String id;
	    private String providerConfirmationId;
	    private AssociatedRecord associatedRecords;
	    
	    public static class AssociatedRecord{
	    	private String reference;
	        private String originSystemCode;
			public String getReference() {
				return reference;
			}
			public void setReference(String reference) {
				this.reference = reference;
			}
			public String getOriginSystemCode() {
				return originSystemCode;
			}
			public void setOriginSystemCode(String originSystemCode) {
				this.originSystemCode = originSystemCode;
			}
	    }

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProviderConfirmationId() {
			return providerConfirmationId;
		}

		public void setProviderConfirmationId(String providerConfirmationId) {
			this.providerConfirmationId = providerConfirmationId;
		}

		public AssociatedRecord getAssociatedRecords() {
			return associatedRecords;
		}

		public void setAssociatedRecords(AssociatedRecord associatedRecords) {
			this.associatedRecords = associatedRecords;
		}

	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}
	

}
