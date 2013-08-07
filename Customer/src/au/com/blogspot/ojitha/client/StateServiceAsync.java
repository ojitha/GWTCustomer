package au.com.blogspot.ojitha.client;

import java.util.List;

import au.com.blogspot.ojitha.shared.StateDto;

import com.google.gwt.user.client.rpc.AsyncCallback;
/**
 * Async for the {@link StateService}.
 * This is not suppose to manually edit.
 * @author Ojitha
 *
 */
public interface StateServiceAsync {

	void getAllStates(AsyncCallback<List<StateDto>> callback);

}
