public class Admin extends Utilisateur {

//Constructeur
	public Admin(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}

//Méthodes
	
	//Utilisateurs
	public String creerLogin(String nom, String prenom){
		String login;
		login = nom.toLowerCase()+prenom.toLowerCase();
		if (login.length()<=10){
			return login;
		}
		else{
			return login.substring(0, 10);
		}
	}
	
	public void creerUtilisateur(String nom, String prenom, String role) {
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
	
	public void creerPromotion(){
		
		
	}

	
	//Modules
	public void definirModule(String nom, String syllabus, String prerequis){
		Module m = new Module(nom, syllabus, prerequis);
		Modele.ajouterModule(m);		
	}
	
	public void supprimerModule(String nom, String syllabus, String prerequis){
		Module m = new Module(nom, syllabus, prerequis);
		Modele.supprimerModule(m);	
	}

}
