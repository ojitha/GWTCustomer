package au.com.blogspot.ojitha.server.service;

import java.util.List;

import au.com.blogspot.ojitha.server.domain.State;

public interface StateBusinessService {
	public void save(State state);
	public List<State> findAll();
	public State findById(String id);

}
