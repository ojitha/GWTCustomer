package au.com.blogspot.ojitha.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
/**
 * Customer Service interface 
 * 
 * @author Ojitha
 *
 */
@RemoteServiceRelativePath("customerService")
public interface CustomerService extends RemoteService {
	Boolean addCustomer(au.com.blogspot.ojitha.shared.CustomerDto customer);
}
