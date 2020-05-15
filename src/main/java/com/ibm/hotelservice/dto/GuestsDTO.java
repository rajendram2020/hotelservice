package com.ibm.hotelservice.dto;



public class GuestsDTO {
	
	
		private Integer id;
		private Name name;
		
		private Contacts contact;
		
		public static class Name{
			private String title;
			
			private String firstName;
			
			private String lastName;

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
		}
		
		public static class Contacts{
			private String phone;
			private String email;
			public String getPhone() {
				return phone;
			}
			public void setPhone(String phone) {
				this.phone = phone;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
		}

		public Name getName() {
			return name;
		}

		public void setName(Name name) {
			this.name = name;
		}

		public Contacts getContact() {
			return contact;
		}

		public void setContact(Contacts contact) {
			this.contact = contact;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		
	

}
