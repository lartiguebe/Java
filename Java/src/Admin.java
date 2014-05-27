import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

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
	public static String creerLogin(String nom, String prenom, Modele m) throws ClassNotFoundException, IOException{
		String login;
		
		login = nom.toLowerCase()+prenom.toLowerCase();
		
		if (login.length()>10){
			login = login.substring(0, 10);
		}
		
		if (!(m.getUtilisateur(login)==null)){
			login = login+"2"; //Homonyme
		}
		return login;
	}
	
	public static void creerUtilisateur(String nom, String prenom, String role, Modele m) throws ClassNotFoundException, IOException{
		switch(role){
		case "admin":
			Admin a = new Admin(nom, prenom, creerLogin(nom, prenom,m), "eisti");
			m.ajouterAdmin(a);
			break;
		
		case "prof":
			Professeur p = new Professeur(nom, prenom, creerLogin(nom, prenom,m), "eisti");
			m.ajouterProfesseur(p);
			break;
			
		case "etudiant":
			Etudiant e = new Etudiant(nom,prenom,creerLogin(nom,prenom,m), "eisti");
			m.ajouterEtudiant(e);
			break;
		}
	}
	
	

	//Promotion
	public static void creerPromotion(String nomPromo, Modele m){
		Promotion p = new Promotion(nomPromo);
		m.ajouterPromo(p);
	}

	
	//Modules
	public static void definirModule(String nom, String syllabus, String prerequis, Modele m){
		Module module = new Module(nom, syllabus, prerequis);
		m.ajouterModule(module);		
	}
	
	public static void modifierModule(String nom, String newNom, String syllabus, String newSyllabus, String prerequis, String newPrerequis, Modele m){
				
		Module o = new Module(nom, syllabus, prerequis);
		if (m.contientModule(o)){
			m.supprimerModule(o);
			//lance application pour récupérer les nouvelles valeurs
			m.ajouterModule(new Module(newNom, newSyllabus, newPrerequis));
		}
	}
	@Override
	public boolean equals (Object o) {
		if(o==this) {//Si c'est le même
			return true;
		} 
		if (!(o instanceof Admin)) {//Si ce n'est pas un point
			return false;
		}

		Admin p = (Admin) o;
		return ((this.getNom().equals(p.getNom()))&&(this.getPrenom().equals(p.getPrenom()))&&(this.getlogin().equals(p.getlogin()))&&(this.getPassword().equals(p.getPassword())));
		//Si nom obligatoire, on peut faire this.nom.equals(p.nom)
	}
	
	@Override
	public int compareTo(Utilisateur o) {
		return this.getlogin().compareTo(o.getlogin());
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(this.getNom(),this.getPrenom(),this.getlogin(),this.getPassword());
	}
	
	
	
	

}
