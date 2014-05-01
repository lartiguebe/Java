import java.util.Set;

public class Admin extends Utilisateur {

//Constructeur
	public Admin(int idUtilisateur, String nom, String prenom) {
		super(idUtilisateur, nom, prenom);
	}

//Méthodes
	public String creerUtilisateur(String nom, String prenom){
		String login;
		login = nom.toLowerCase()+prenom.toLowerCase();
		if (login.length()<=10){
			return login;
		}
		else{
			return login.substring(0, 10);
		}
	}
	
	public void creerPromotion(String nom){
		
		
	}

	public void definirModule(){
		
	}
	
	public void modifierModule(){
	}

}
