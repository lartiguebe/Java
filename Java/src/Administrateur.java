import java.util.concurrent.atomic.AtomicLong;

public class Administrateur extends Utilisateur {

//Constructeur
	public Administrateur(int idUtilisateur, String nom, String prenom) {
		super(idUtilisateur, nom, prenom);
	}

//Méthodes
	
	//On définit un AtomicLong
	private static AtomicLong idCounter = new AtomicLong();

	
	public String creerUtilisateur(String nom, String prenom){
		return String.valueOf(idCounter.getAndIncrement());		
	}

	public void creerPromotion(){
		
	}

	public void definirModule(){
		
	}
	
	public void modifierModule(){
		
	}

}
