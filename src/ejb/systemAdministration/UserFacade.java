package ejb.systemAdministration;
import java.util.Collection;


import jpa.LabelJPA;


public interface UserFacade {

		//User 
		public void login (String email, String pwd);
		public void logout();
		public void registerUser (String nif, String name, String surname, String phone, String password, String email, String address);
		public void updatePersonalData (String nif, String name, String surname, String phone, String password, String email, String address);
		public void registerAdministrator (String password, String email);
		
		//LabelAdministration 
		public void addLabel(String text, String description);
		public void deleteLabel (int labelId);
		public void updateLabel (int labelId, String text, String description);
		public Collection<LabelJPA> listAllLabels();
		public LabelJPA getLabel(int labelId);
		
		//AdCommunication 
		public void removeComment(int commentId);
		public void removeMessage (int messageId);

}

