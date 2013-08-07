package au.com.blogspot.ojitha.client.ui;

import java.util.ArrayList;
import java.util.List;

import au.com.blogspot.ojitha.client.CustomerService;
import au.com.blogspot.ojitha.client.CustomerServiceAsync;
import au.com.blogspot.ojitha.shared.AddressDto;
import au.com.blogspot.ojitha.shared.CustomerDto;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * This is the UI clsss for the Add Customer page
 * The relevant XHTML page is AddCustomer.ui.xml 
 * @author Ojitha
 *
 */
public class AddCustomer extends Composite  {

	private final CustomerServiceAsync customerService = GWT.create(CustomerService.class);
	
	private static AddCustomerUiBinder uiBinder = GWT
			.create(AddCustomerUiBinder.class);
	@UiField TextBox firstName;
	@UiField TextBox lastName;
	@UiField Button btnAdd;
	@UiField AddressUI homeAddressUi;
	@UiField AddressUI workAddressUi;
	@UiField SimpleCheckBox blnHomeAddress;
	@UiField SimpleCheckBox blnWorkAddress;

	interface AddCustomerUiBinder extends UiBinder<Widget, AddCustomer> {
	}

	public AddCustomer() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	
	/**
	 * On click on the submit this will call to the {@link CustomerService#addCustomer(CustomerDto)} to
	 * save.
	 **/
	@UiHandler("btnAdd")
	void onBtnAddClick(ClickEvent event) {
		
		CustomerDto customer = new CustomerDto();
		customer.setFirstName(this.firstName.getText());
		customer.setLastName(this.lastName.getText());
		List<AddressDto> addresses = new ArrayList<AddressDto>();
		
		//if address is checked only this will be added to the CustomerDto address
		if (blnHomeAddress.getValue()){
			AddressDto homeAddressDto = new AddressDto();
			homeAddressDto.setFirstStreet(homeAddressUi.firstStreet.getText());
			homeAddressDto.setSecondStreet(homeAddressUi.secondStreed.getText());
			//homeAddressDto.setSate(homeAddressUi.getCodeOfSelectedState(homeAddressUi.cmbState.getItemText(homeAddressUi.cmbState.getSelectedIndex())));
			homeAddressDto.setSate(homeAddressUi.cmbState.getValue(homeAddressUi.cmbState.getSelectedIndex()));
			
			//FIXME move to reference data table
			homeAddressDto.setAddressType("Home");
			
			addresses.add(homeAddressDto);
		}
		
		if (blnWorkAddress.getValue()){
			AddressDto workAddressDto = new AddressDto();
			workAddressDto.setFirstStreet(workAddressUi.firstStreet.getText());
			workAddressDto.setSecondStreet(workAddressUi.secondStreed.getText());
			//workAddressDto.setSate(workAddressUi.getCodeOfSelectedState(workAddressUi.cmbState.getValue(workAddressUi.cmbState.getSelectedIndex())));
			workAddressDto.setSate(workAddressUi.cmbState.getValue(workAddressUi.cmbState.getSelectedIndex()));
			
			//FIXME move to reference data table
			workAddressDto.setAddressType("Work");
			
			addresses.add(workAddressDto);
		}

		
		customer.setAddresses(addresses);
		
		this.customerService.addCustomer(customer, new AsyncCallback<Boolean>() {
			
			@Override
			public void onSuccess(Boolean result) {
				// FIXME This is success message after saving the customer. Need implement
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// FIXME Exceptions are not implemented for this POC
				
			}
		});
	}
	
}
