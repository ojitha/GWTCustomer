package au.com.blogspot.ojitha.server.service;

import au.com.blogspot.ojitha.shared.CustomerDto;
/**
 * Customer Business service for Customer management.
 * @author Ojitha
 *
 */
public interface CustomerBusinessService {
	/**
	 * Save the which is extracted from the {@link CustomerDto}.
	 * @param customer Customer form the Dto.
	 */
	void save(CustomerDto customer);
}
