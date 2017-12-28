package managedbean.systemAdministration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.naming.Context;
import javax.naming.InitialContext;

import ejb.systemAdministration.UserFacadeRemote;
import jpa.LabelJPA;


@ManagedBean(name="listLabels")
@ViewScoped

public class ListLabelsMBean implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserFacadeRemote userRemote;
	private  Collection <LabelJPA> labelList;
	protected ArrayList <LabelJPA> labelListView;
	protected Collection <SelectItem> labelListSelection = new ArrayList<SelectItem>();
	
	public ListLabelsMBean() throws Exception{
		this.labelList();
	}
	
	public ArrayList <LabelJPA> getLabelListView(){
		labelListView = new ArrayList <LabelJPA>();
		for(Iterator<LabelJPA> iter2 = labelList.iterator(); iter2.hasNext();)
		{
			LabelJPA label2 = (LabelJPA) iter2.next();
			this.labelListView.add(label2);
		}
		return labelListView;
		
	}
	
	public Collection <SelectItem> getLabelListSelection()throws Exception{
		 
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");
		Collection <LabelJPA> labelCollection = (Collection<LabelJPA>) userRemote.listAllLabels();
		labelListSelection.clear();
		for(Iterator<LabelJPA> iter2 = labelCollection.iterator(); iter2.hasNext();)
		{
			LabelJPA label2 = (LabelJPA) iter2.next();
			SelectItem item = new SelectItem(label2.getText());
			this.labelListSelection.add(item);
		}
		return labelListSelection;
	}
	
	
	public String listLabels() throws Exception{
		labelList();
		getLabelListView();
		return "LabelsListView";
	}
	

	public void labelList() throws Exception{
		
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		userRemote = (UserFacadeRemote) ctx.lookup("java:app/TopOffers.jar/UserFacadeBean!ejb.systemAdministration.UserFacadeRemote");
		labelList = (ArrayList <LabelJPA>) userRemote.listAllLabels();
	}
	

}
