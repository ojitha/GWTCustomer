package au.com.blogspot.ojitha.server.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.blogspot.ojitha.server.domain.Address;
import au.com.blogspot.ojitha.server.domain.Cust;
import au.com.blogspot.ojitha.server.domain.State;
import au.com.blogspot.ojitha.server.repository.CustRepository;
import au.com.blogspot.ojitha.server.service.CustomerBusinessService;
import au.com.blogspot.ojitha.server.service.StateBusinessService;
import au.com.blogspot.ojitha.shared.AddressDto;
import au.com.blogspot.ojitha.shared.CustomerDto;

/**
 * Business Service for the Customer
 * @author Ojitha
 *
 */
@Service
@Transactional
@Repository
public class CustomerBusinessServiceImpl implements CustomerBusinessService {

	@Autowired
	CustRepository customerRepository;
	
	@Autowired
	StateBusinessService stateBusinessService;
	
	@Override
	public void save(CustomerDto customer) {
		
		// Create Customer Entity
		Cust cust = new Cust();
		BeanUtils.copyProperties(customer, cust); //copy Dto to Entity

		//copy Address Dto to Address entity if addresses available.
		if (customer.getAddresses().size() >0) {
			List<Address> addressList = new ArrayList<Address>();
		
			for (AddressDto addressDto : customer.getAddresses()) {
				Address address = new Address();
				BeanUtils.copyProperties(addressDto, address, new String[]{"state"});
				State state = this.stateBusinessService.findById(addressDto.getSate());
				address.setState(state);
				addressList.add(address);
			}
			cust.setAddresses(addressList);
		}
		
		this.customerRepository.save(cust);

	}
}
