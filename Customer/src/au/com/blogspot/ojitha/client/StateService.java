package au.com.blogspot.ojitha.client;

import java.util.List;

import au.com.blogspot.ojitha.shared.StateDto;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * This is GWT RPC based service for the states of the address.
 * 
 * @author Ojitha
 *
 */
@RemoteServiceRelativePath("stateService")
public interface StateService extends RemoteService {
	/**
	 * This will be called to initialize the States for the address. 
	 * @return all the states/
	 */
	List<StateDto> getAllStates();
}
