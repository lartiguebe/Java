import java.io.Serializable;

public class Professeur extends Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3208006922305759654L;

	//Constructeur
	public Professeur(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}

	//Méthodes
	public void definirQCM(){
		
	}
	
	public void creerSessionQCM(){
		
	}
	
	public void consulterResultat(){
		
	}
}
