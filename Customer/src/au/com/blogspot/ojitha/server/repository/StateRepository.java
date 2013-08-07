package au.com.blogspot.ojitha.server.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.blogspot.ojitha.server.domain.State;
/**
 * Spring Data JPA repository for State.
 * @author Ojitha
 *
 */
public interface StateRepository extends CrudRepository<State, String> {

}
