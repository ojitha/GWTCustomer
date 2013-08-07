package au.com.blogspot.ojitha.client;

import java.util.List;

import au.com.blogspot.ojitha.shared.StateDto;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stateService")
public interface StateService extends RemoteService {
	List<StateDto> getAllStates();
}
