import java.io.Serializable;
import java.util.Objects;

/**
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */
public class Etudiant extends Utilisateur implements Serializable {
	
	/**
	 * Définition d'un serialVersionUID
	 */
	private static final long serialVersionUID = -7961482390754389570L;

	//Constructeurs
	/**
	 * Constructeur de la classe Etudiant
	 * @param nom nom de l'étudiant hérité de la classe utilisateurs
	 * @param prenom prenom de l'étudiant hérité de la classe utilisateurs
	 * @param login login de l'étudiant hérité de la classe utilisateurs
	 * @param password password de l'étudiant hérité de la classe utilisateurs
	 */
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
	
	@Override
	public boolean equals (Object o) {
		if(o==this) {//Si c'est le même
			return true;
		} 
		if (!(o instanceof Etudiant)) {//Si ce n'est pas un etudiant
			return false;
		}

		Etudiant p = (Etudiant) o;
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
