package managedbean.systemAdministration;

import java.io.Serializable;
import java.util.Properties;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ejb.systemAdministration.UserFacadeRemote;
import jpa.LabelJPA;

@ManagedBean(name="updateLabel")
@ViewScoped
public class UpdateLabelMBean implements Serializable{


	private static final long serialVersionUID = 3592070816372036399L;
	
	@EJB
	private UserFacadeRemote userRemote;
	
	private LabelJPA label;
	protected int selectedLabel;
	protected String text;
	protected String description;

	public UpdateLabelMBean() throws Exception {
		setLabel();
	}
	
	

	
	public LabelJPA getLabel() {
		return label;
	}




	public void setLabel(LabelJPA label) {
		this.label = label;
	}




	public int getSelectedLabel() {
		return selectedLabel;
	}




	public void setSelectedLabel(int selectedLabel) {
		this.selectedLabel = selectedLabel;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}



	public String labelUpdate() throws Exception{
		
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");		
		userRemote.updateLabel(selectedLabel, text, description);
		return "LabelsListView";
	}
	
	
	
	

	public void setLabel() throws NamingException {
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");		
		label = userRemote.getLabel(selectedLabel);
	}
}

