package au.com.blogspot.ojitha.client;

import au.com.blogspot.ojitha.shared.CustomerDto;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
/**
 * Customer Service interface based on GWT RPC 
 * 
 * @author Ojitha
 *
 */
@RemoteServiceRelativePath("customerService")
public interface CustomerService extends RemoteService {
	/**
	 * This call will send the {@link CustomerDto} to the server. 
	 * @param customer Customer
	 * @return
	 */
	Boolean addCustomer(au.com.blogspot.ojitha.shared.CustomerDto customer);
}
