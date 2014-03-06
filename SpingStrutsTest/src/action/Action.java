/**
 * 
 */
package action;

import service.Service;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author DUCHAO
 *
 */
public class Action extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private Service service;
	
	public void execute(String str){
		service.execute(getMessage());
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}

}
