package au.com.blogspot.ojitha.client;

import au.com.blogspot.ojitha.shared.CustomerDto;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CustomerServiceAsync {

	void addCustomer(CustomerDto customer, AsyncCallback<Boolean> callback);

}
