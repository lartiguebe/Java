import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;


/**
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */
public class Admin extends Utilisateur implements Serializable{

	/**
	 * Définition d'un serialVersionUID
	 */
	private static final long serialVersionUID = 6063159330187409500L;

	
	//Constructeur
	/**
	 * Constructeur de la classe Admin
	 * @param nom nom de l'administrateur hérité de la classe utilisateurs
	 * @param prenom prenom de l'administrateur hérité de la classe utilisateurs
	 * @param login login de l'administrateur hérité de la classe utilisateurs
	 * @param password password de l'administrateur hérité de la classe utilisateurs
	 */
	public Admin(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}

//Méthodes
	
	//Utilisateurs
	/**
	 * Permet de créer un login unique à partir de son nom et de son prenom
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param m modèle du projet 
	 * @return Retourne le login créé
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static String creerLogin(String nom, String prenom, Modele m) throws ClassNotFoundException, IOException{
		String login;
		
		login = nom.toLowerCase()+prenom.toLowerCase();
		
		if (login.length()>10){
			login = login.substring(0, 10); //On coupe à 10
		}
		
		if (!(m.getUtilisateur(login)==null)){
			login = login+"2"; //Homonyme
		}
		return login;
	}
	
	/**
	 * Permet d'ajouter l'utilisateur dans un set de son type
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param role role de la personne : admin, prof ou élève
	 * @param m modèle du projet 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
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
	/**
	 * Permets de créer une promotion à partir d'un nom de promo
	 * @param nomPromo Nom de la promotion à créer
	 * @param m modèle du projet
	 */
	public static void creerPromotion(String nomPromo, Modele m){
		Promotion p = new Promotion(nomPromo);
		m.ajouterPromo(p);
	}

	
	//Modules
	/**
	 * Permets de créer un module à partir d'un nom, syllabus et de prerequis
	 * @param nom Nom du module à créer
	 * @param syllabus Syllabus du module à créer
	 * @param prerequis Prerequis utiles pour ce module
	 * @param m modèle du projet
	 */
	public static void definirModule(String nom, String syllabus, String prerequis, Modele m){
		Module module = new Module(nom, syllabus, prerequis);
		m.ajouterModule(module);		
	}
	
	/**
	 * Permets de modifier un module à partir d'un module existant
	 * @param nom Nom du module à modifier
	 * @param newNom Nom du nouveau module à donner
	 * @param syllabus Syllabus du module à modifier
	 * @param newSyllabus Syllabus du nouveau module à donner
	 * @param prerequis Prerequis du module à modifier
	 * @param newPrerequis Prerequis du nouveau module à donner
	 * @param m modèle du projet
	 */
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
		if (!(o instanceof Admin)) {//Si ce n'est pas un admin
			return false;
		}

		Admin p = (Admin) o;
		return ((this.getNom().equals(p.getNom()))&&(this.getPrenom().equals(p.getPrenom()))&&(this.getlogin().equals(p.getlogin()))&&(this.getPassword().equals(p.getPassword())));
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
