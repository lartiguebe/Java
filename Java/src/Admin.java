import java.io.Serializable;

public class Admin extends Utilisateur implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 6063159330187409500L;

	//Constructeur
	public Admin(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}

//Méthodes
	
	//Utilisateurs
	public static String creerLogin(String nom, String prenom){
		String login;
		login = nom.toLowerCase()+prenom.toLowerCase();
		if (login.length()<=10){
			return login;
		}
		else{
			return login.substring(0, 10);
		}
	}
	
	public static void creerUtilisateur(String nom, String prenom, String role) {
		//TODO switch case avec instanceof sur admin, on peut pas instancier un utilisateur directement mais uniquement un prof, etudiant ou admin.
		
		switch(role){
		case "admin":
			Admin a = new Admin(nom, prenom, creerLogin(nom, prenom), "eisti");
			Modele.ajouterAdmin(a);
			break;
		
		case "prof":
			Professeur p = new Professeur(nom, prenom, creerLogin(nom, prenom), "eisti");
			Modele.ajouterProfesseur(p);
			break;
			
		case "etudiant":
			Etudiant e = new Etudiant(nom,prenom,creerLogin(nom,prenom), "eisti");
			Modele.ajouterEtudiant(e);
			break;
		}
	}

	//Promotion
	public static void creerPromotion(String nomPromo){
		Promotion p = new Promotion(nomPromo);
		Modele.ajouterPromo(p);
	}

	
	//Modules
	public static void definirModule(String nom, String syllabus, String prerequis){
		Module m = new Module(nom, syllabus, prerequis);
		Modele.ajouterModule(m);		
	}
	
	public static void modifierModule(String nom, String syllabus, String prerequis){
		
	}
	
	
	
	

}
