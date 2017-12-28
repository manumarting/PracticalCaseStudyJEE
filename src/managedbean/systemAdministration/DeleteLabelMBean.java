package managedbean.systemAdministration;

import java.io.Serializable;
import java.util.Properties;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.naming.Context;
import javax.naming.InitialContext;

import ejb.systemAdministration.UserFacadeRemote;


@ManagedBean(name="deleteLabel")
@ViewScoped
public class DeleteLabelMBean implements Serializable{


	private static final long serialVersionUID = -4200591961903031544L;

	@EJB
	private UserFacadeRemote userRemote;
	private int selectedLabel;
	
	
	public DeleteLabelMBean() {
		
	}


	public int getSelectedLabel() {
		return selectedLabel;
	}


	public void setSelectedLabel(int selectedLabel) {
		this.selectedLabel = selectedLabel;
	}
	
	public String deleteLabel()throws Exception{
		
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");
		userRemote.deleteLabel(selectedLabel);
		return "LabelsListView";
		
	}

}
