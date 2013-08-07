package au.com.blogspot.ojitha.shared;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


/**
 * The persistent class for the state database table.
 * 
 */
public class StateDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private String state;

	private int version;

	/**
	 * consturctor
	 */
	public StateDto() {
	}

	/**
	 * getter for the code
	 * @return
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * setter for the code
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * getter for the state
	 * @return State
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * setter for the state.
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * FIXME version is not yet supported in this POC.
	 * @return
	 */
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


}