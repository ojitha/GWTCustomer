package au.com.blogspot.ojitha.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.blogspot.ojitha.client.GreetingService;
import au.com.blogspot.ojitha.server.domain.State;
import au.com.blogspot.ojitha.server.service.StateBusinessService;
import au.com.blogspot.ojitha.server.spring.GWTSpringAwareContext;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends GWTSpringAwareContext implements
		GreetingService {

	@Autowired
	StateBusinessService stateSerivce;
	
	public String greetServer(String input) throws IllegalArgumentException {
		
		List<State> states = stateSerivce.findAll();
		String s = "";
		for (State state : states) {
			s += state.getState();
		}
		
		return s;
	}


	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
