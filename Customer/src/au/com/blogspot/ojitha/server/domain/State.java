package au.com.blogspot.ojitha.server.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


/**
 * The persistent class for the state database table.
 * 
 */
@Entity
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String state;

	private int version;

	@Transient 
	protected Object[] jdoDetachedState;

	public State() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


}