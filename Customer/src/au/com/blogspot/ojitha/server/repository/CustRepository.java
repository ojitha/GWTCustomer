package au.com.blogspot.ojitha.server.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.blogspot.ojitha.server.domain.Cust;
/**
 * Spring Data JPA repository for the Cust.
 * @author Ojitha
 *
 */
public interface CustRepository extends CrudRepository<Cust, Integer> {

}
