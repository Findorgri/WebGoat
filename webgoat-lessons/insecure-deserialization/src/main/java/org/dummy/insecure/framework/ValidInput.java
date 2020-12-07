package org.dummy.insecure.framework;

import java.io.Serializable;

public class ValidInput implements Serializable {
	private static final long serialVersionUID = 2;

	private String firstname;
	private String lastname;
	
	public ValidInput(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "ValidInput [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
}
