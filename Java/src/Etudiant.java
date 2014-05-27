import java.io.Serializable;
import java.util.Objects;

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
	
	@Override
	public boolean equals (Object o) {
		if(o==this) {//Si c'est le même
			return true;
		} 
		if (!(o instanceof Etudiant)) {//Si ce n'est pas un point
			return false;
		}

		Etudiant p = (Etudiant) o;
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
