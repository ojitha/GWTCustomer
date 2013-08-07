package au.com.blogspot.ojitha.shared;

import java.io.Serializable;
import java.util.List;

public class CustomerDto implements Serializable {

	private Integer customerId;

	private String firstName;
	private String lastName;

	private List<AddressDto> addresses;

	/**
	 * getter for the customer id.
	 * @return
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * setter for the customer id.
	 * @param customerId
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * getter for the first name.
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setter for the first name.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getter for the last name.
	 * @return last name;
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Getter for the associated addresses.
	 * @return List of addresses.
	 */
	public List<AddressDto> getAddresses() {
		return addresses;
	}
	
	/**
	 * Setter for the addresses.
	 * @param addresses
	 */
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}
	
	/**
	 * setter for the last name.
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
