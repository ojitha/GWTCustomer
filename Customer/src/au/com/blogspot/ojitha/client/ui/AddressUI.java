package au.com.blogspot.ojitha.client.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import au.com.blogspot.ojitha.client.StateService;
import au.com.blogspot.ojitha.client.StateServiceAsync;
import au.com.blogspot.ojitha.shared.StateDto;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddressUI extends Composite{

	
	private static AddressUIUiBinder uiBinder = GWT
			.create(AddressUIUiBinder.class);
	@UiField TextBox firstStreet;
	@UiField TextBox secondStreed;
	@UiField ListBox cmbState;
	

	interface AddressUIUiBinder extends UiBinder<Widget, AddressUI> {
	}

	public AddressUI() {
		initWidget(uiBinder.createAndBindUi(this));

	}
	
	public void readAllStates(){
		StateServiceAsync stateService = GWT.create(StateService.class);
		if (cmbState.getItemCount() == 0){
			stateService.getAllStates(new AsyncCallback<List<StateDto>>() {
	
				@Override
				public void onFailure(Throwable caught) {
					
				}
	
				@Override
				public void onSuccess(List<StateDto> result) {
					for (StateDto stateDto : result) {
						cmbState.addItem(stateDto.getState(),stateDto.getCode());
					}
					
				}
			});
		}
	}

	@Override
	protected void onLoad() {
		// initialize with RPC call to get all States
		super.onLoad();
		readAllStates();
	}
	
	
}
