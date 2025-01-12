package association;

public class Address {
	private String city;
	private String postalCode;
	
	//constructor
		public Address(String city, String postalCode) {
			this.city = city;
			this.postalCode = postalCode;
		}
		
		//getter
		public String getName() {
			return this.city;
		}
		
		public String getAge() {
			return this.postalCode;
		}
		
		//setter
		public void setName(String city) {
			this.city = city;
		}
		
		public void setAge(String postalCode) {
			this.postalCode = postalCode;
		}
}
