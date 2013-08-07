package au.com.blogspot.ojitha.server;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.blogspot.ojitha.client.CustomerService;
import au.com.blogspot.ojitha.server.service.CustomerBusinessService;
import au.com.blogspot.ojitha.server.spring.GWTSpringAwareContext;
import au.com.blogspot.ojitha.shared.CustomerDto;

public class CustomerServiceImpl extends GWTSpringAwareContext implements
		CustomerService {

	@Autowired
	CustomerBusinessService customerBusinessService;
	
	@Override
	public Boolean addCustomer(CustomerDto customer)
			throws IllegalArgumentException {
		this.customerBusinessService.save(customer);
		return null;
	}

}
