package au.com.blogspot.ojitha.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Address Entity
 * @author Ojitha
 *
 */
@Entity
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private Integer addressId;
	
	@Column(name="FIRST_STREET")
	private String firstStreet;
	
	@Column(name="SECOND_STREET")
	private String secondStreet;
	
	@Column(name="ADDRESS_TYPE")
	private String addressType;
	
	@ManyToOne
	@JoinColumn(name="STATE_CODE")
	private State state;
	
	@Transient 
	protected Object[] jdoDetachedState;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getFirstStreet() {
		return firstStreet;
	}

	public void setFirstStreet(String firstStreet) {
		this.firstStreet = firstStreet;
	}

	public String getSecondStreet() {
		return secondStreet;
	}

	public void setSecondStreet(String secondStreet) {
		this.secondStreet = secondStreet;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

}
