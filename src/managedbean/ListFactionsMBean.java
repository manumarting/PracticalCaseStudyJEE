/*
 * Copyright FUOC.  All rights reserved.
 * @author Vicenç Font Sagristà, 2012
 */
package managedbean;

import java.io.Serializable;
import java.util.*;

import javax.ejb.EJB;
import javax.faces.model.SelectItem;
import javax.faces.bean.*;
import javax.naming.Context;
import javax.naming.InitialContext;

import jpa.FactionJPA;
import ejb.CatalogFacadeRemote;

/**
 * Managed Bean ListFactionsMBean
 */
@ManagedBean(name = "factions")
@SessionScoped
public class ListFactionsMBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CatalogFacadeRemote catalogRemote;		
	protected Collection<SelectItem> factionList = new ArrayList<SelectItem>();
	
	public ListFactionsMBean() throws Exception
	{
		this.factionList();
	}

	/**
	 * Method get which return Categories Collection
	 * @return Collection
	 */
	public Collection<SelectItem> getCategoryList()
	{
		return factionList;
	}
	
	/**
	 * Method that takes a collection of instances of FactionJPA calling 
	 * method listAllFactions of the EJB Session
	 * @throws Exception
	 */
	public void factionList() throws Exception
	{	
		Properties props = System.getProperties();
		Context ctx = new InitialContext(props);
		catalogRemote = (CatalogFacadeRemote) ctx.lookup("java:app/PracticalCaseStudyJEE.jar/CatalogFacadeBean!ejb.CatalogFacadeRemote");
		@SuppressWarnings("unchecked")
		Collection<FactionJPA> factionCollection = (Collection<FactionJPA>) catalogRemote.listAllFactions();
		for (Iterator<FactionJPA> iter2 = factionCollection.iterator(); iter2.hasNext();)
		{
			FactionJPA faction2 = (FactionJPA) iter2.next();
			SelectItem item = new SelectItem(faction2.getNombre());
			this.factionList.add(item);			
		}
		this.factionList.add(new SelectItem("ALL Factions"));
	}
}
