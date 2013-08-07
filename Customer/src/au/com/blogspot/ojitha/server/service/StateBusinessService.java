package au.com.blogspot.ojitha.server.service;

import java.util.List;

import au.com.blogspot.ojitha.server.domain.State;
/**
 * Business Services for the State.
 * @author Ojitha
 *
 */
public interface StateBusinessService {
	/**
	 * Save the {@link State}.
	 * @param state state to save.
	 */
	public void save(State state);
	
	/**
	 * Find all the states.
	 * @return List of states.
	 */
	public List<State> findAll();
	
	/**
	 * Find the state by the primary key.
	 * @param id primary key.
	 * @return State.
	 */
	public State findById(String id);

}
