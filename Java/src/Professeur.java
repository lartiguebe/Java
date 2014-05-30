import java.io.Serializable;
import java.util.Objects;
import java.util.GregorianCalendar;

/**
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */
public class Professeur extends Utilisateur implements Serializable{

	/**
	 * Définition d'un serialVersionUID
	 */
	private static final long serialVersionUID = -3208006922305759654L;

	//Constructeur
	/**
	 * Constructeur de la classe Professeur
	 * @param nom nom du professeur hérité de la classe utilisateurs
	 * @param prenom prenom du professeur hérité de la classe utilisateurs
	 * @param login login du professeur hérité de la classe utilisateurs
	 * @param password password du professeur hérité de la classe utilisateurs
	 */
	public Professeur(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}

	//Méthodes
	public void definirQCM(){
		
	}
	
	public void creerSessionQCM(int jourD,int moisD,int anneeD,int jourF,int moisF,int anneeF){		
		Session session=new Session(Session.definirDate(jourD,moisD,anneeD),Session.definirDate(jourF,moisF,anneeF));
	}
	
	public void consulterResultat(){
		
	}
	
	@Override
	public boolean equals (Object o) {
		if(o==this) {//Si c'est le même
			return true;
		} 
		if (!(o instanceof Professeur)) {//Si ce n'est pas un Professeur
			return false;
		}

		Professeur p = (Professeur) o;
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
