import java.io.Serializable;

public class Etudiant extends Utilisateur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7961482390754389570L;

	//Constructeurs
	public Etudiant(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}
	
	//Méthode
	public void repondreQCM(){
		
	}
	
	public void respecterDates(){
		
	}
	
	public void visualiserResultats(){
		
	}


}
