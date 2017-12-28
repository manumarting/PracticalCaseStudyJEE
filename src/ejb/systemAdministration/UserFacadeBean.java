package ejb.systemAdministration;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejb.IndexCalculator;
import jpa.LabelJPA;

@Stateless
public class UserFacadeBean implements UserFacadeRemote {

	//Persistence Unit Context
	
	@PersistenceContext(unitName="TopOffers") 
	private EntityManager entman;
	
	private IndexCalculator calculator = new IndexCalculator();
	
	@Override
	public void login(String email, String pwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerUser(String nif, String name, String surname, String phone, String password, String email,
			String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonalData(String nif, String name, String surname, String phone, String password, String email,
			String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerAdministrator(String password, String email) {
		// TODO Auto-generated method stub
		
	}
	
	/** LABEL ADMINISTRATION **/

	public void addLabel(String text, String description) {
		@SuppressWarnings("unchecked")
		Collection<LabelJPA> allLabels = entman.createQuery("from LabelJPA ORDER BY label_id").getResultList();
		int id= calculator.getLabelIndex(allLabels);
		System.out.println("El valor de la nueva etiqueta es: "+id);
		LabelJPA label = new LabelJPA(id, text, description);
		entman.persist(label);
		
	}


	public void deleteLabel(int labelId) {
		LabelJPA label = entman.find((LabelJPA.class), labelId);
		entman.remove(label);
		
	}

	public void updateLabel(int labelId, String text, String description) {
		System.out.println("Vamos a actualizar la etiqueta: "+labelId);
		
		LabelJPA label = entman.find(LabelJPA.class, labelId);
		label.setDescription(description);
		label.setText(text);
		entman.merge(label);
	}


	public Collection<LabelJPA> listAllLabels() {
		@SuppressWarnings("unchecked")
		Collection<LabelJPA> allLabels = entman.createQuery("from LabelJPA").getResultList();
		return allLabels;
	}

	public LabelJPA getLabel(int labelId) {
		LabelJPA label = entman.find(LabelJPA.class, labelId);
		return label;
	}

	
	/** COMMENTS ADMINISTRATION **/
	@Override
	public void removeComment(int commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMessage(int messageId) {
		// TODO Auto-generated method stub
		
	}


	

}
