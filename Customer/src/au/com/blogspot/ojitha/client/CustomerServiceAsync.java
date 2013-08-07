package au.com.blogspot.ojitha.client;

import au.com.blogspot.ojitha.shared.CustomerDto;

import com.google.gwt.user.client.rpc.AsyncCallback;
/**
 * GWT based Asyn for the {@link CustomerService}. 
 * This is not supposed to modify manually.
 * @author Ojitha
 *
 */
public interface CustomerServiceAsync {

	void addCustomer(CustomerDto customer, AsyncCallback<Boolean> callback);

}
