package managedbean.systemAdministration;

import java.io.Serializable;
import java.util.Properties;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.naming.Context;
import javax.naming.InitialContext;

import ejb.systemAdministration.UserFacadeRemote;
import jpa.LabelJPA;


@ManagedBean(name="showLabel")
@ViewScoped
public class ShowLabelMBean implements Serializable {

	private static final long serialVersionUID = 2060319116708953474L;

	@EJB
	private UserFacadeRemote userRemote;
	protected LabelJPA label;
	protected int labelId;
	
	public ShowLabelMBean() {

	}

	public LabelJPA getLabel() {
		return label;
	}

	public void setLabel(LabelJPA label) {
		this.label = label;
	}

	

	public int getLabelId() {
		return labelId;
	}

	public void setLabelId(int labelId) throws Exception {
		this.labelId = labelId;
		setLabel();

	}

	public void setLabel() throws Exception{
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		try {
			userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");
			label = userRemote.getLabel(labelId);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}