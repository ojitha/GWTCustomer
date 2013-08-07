package au.com.blogspot.ojitha.server.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.blogspot.ojitha.server.domain.State;
import au.com.blogspot.ojitha.server.repository.StateRepository;
import au.com.blogspot.ojitha.server.service.StateBusinessService;

/**
 * State Service for the customer
 * @author Ojitha
 *
 */
@Service("stateService")
@Transactional
@Repository
public class StateServiceImpl implements StateBusinessService {

	@Autowired
	StateRepository stateRepository;
	
	
	@Override
	public void save(State state) {
		stateRepository.save(state);

	}
	
	@Override
	public List<State> findAll(){
		Iterator<State> it = stateRepository.findAll().iterator();
		List<State> states = new ArrayList<State>();
		while(it.hasNext()){
			states.add(it.next());
		}
		return states;
	}

	@Override
	public State findById(String id) {
		 return this.stateRepository.findOne(id);

	}

}
