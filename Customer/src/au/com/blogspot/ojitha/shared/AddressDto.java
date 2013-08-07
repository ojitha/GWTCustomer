package au.com.blogspot.ojitha.shared;

import java.io.Serializable;

/**
 * Dto for the {@link Address}.
 * @author Ojitha
 *
 */
public class AddressDto implements Serializable{
	
	private Integer addressId;
	private String firstStreet;
	private String secondStreet;
	private String addressType;
	private String sate;
	
	/**
	 * getter for address Id
	 * @return
	 */
	public Integer getAddressId() {
		return addressId;
	}
	
	/**
	 * Setter for address Id
	 * @param addressId
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	/**
	 * getter for first street.
	 * @return first Street
	 */
	public String getFirstStreet() {
		return firstStreet;
	}
	
	/**
	 * Setter for first street
	 * @param firstStree
	 */
	public void setFirstStreet(String firstStree) {
		this.firstStreet = firstStree;
	}
	
	/**
	 * Get second street.
	 * @return
	 */
	public String getSecondStreet() {
		return secondStreet;
	}
	
	/**
	 * set second street.
	 * @param secondStree
	 */
	public void setSecondStreet(String secondStree) {
		this.secondStreet = secondStree;
	}
	
	/**
	 * Getter for address type.
	 * @return
	 */
	public String getAddressType() {
		return addressType;
	}
	
	/**
	 * setter for the address type.
	 * @param addressType
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	/**
	 * Set the state.
	 * @return
	 */
	public String getSate() {
		return sate;
	}

	/**
	 * Get the state.
	 * @param sate
	 */
	public void setSate(String sate) {
		this.sate = sate;
	}

}
