package managedbean.systemAdministration;

import java.io.Serializable;
import java.util.*;

import javax.ejb.EJB;
import javax.faces.bean.*;
import javax.naming.Context;
import javax.naming.InitialContext;

import ejb.systemAdministration.UserFacadeRemote;


@ManagedBean(name= "addLabel")
@ViewScoped

public class AddLabelMBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserFacadeRemote userRemote;
	
	
	protected String text;
	protected String description;
	protected String msj;
	protected String destino;
	
	public AddLabelMBean () throws Exception{
		
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



	public String labelAdd()throws Exception{
		if (text.isEmpty()||description.isEmpty()) {
			msj="Error al intentar añadir una formacion: tanto el nombre como la descripción no pueden estar vacios";
			return destino="ErrorView";
			
		}
		else
		{
			Properties props = System.getProperties();
			Context ctx = new InitialContext(props);
			try{
				userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");
				userRemote.addLabel(text, description);
				}catch (Exception e) {
					System.out.println(e);
				}
			return destino= "LabelsListView";
		}
	}
	
}