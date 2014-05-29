import java.io.Serializable;
import java.util.Objects;
import java.util.GregorianCalendar;


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
		boolean suite=true;
		
		int jour,mois,annee;
		int jour0,mois0,annee0;
		jour=1; jour0=3; mois=3; mois0=8; annee=2010; annee0=2012;
		String libelle;
		libelle="nomQCM";
		Promotion promo=new Promotion("PromoEx");
		QCM questionnaire=new QCM(libelle,QCM.definirDate(jour,mois,annee),QCM.definirDate(jour0,mois0,annee0),promo);
		while (suite) {
			
		}
	}
	
	public void creerSessionQCM(){
		
	}
	
	public void consulterResultat(){
		
	}
	
	@Override
	public boolean equals (Object o) {
		if(o==this) {//Si c'est le même
			return true;
		} 
		if (!(o instanceof Professeur)) {//Si ce n'est pas un point
			return false;
		}

		Professeur p = (Professeur) o;
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
