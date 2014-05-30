import java.io.Serializable;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */
public class Promotion implements Serializable {
	
	/**
	 * Définition d'un serialVersionUID
	 */
	private static final long serialVersionUID = 6346273924623297066L;
	/**
	 * Libelle de promotion
	 */
	private String libellePromo;
	/**
	 * Définition d'un set contenant la liste des étudiants dans une promotion
	 */
	private NavigableSet<Etudiant> setListeEtudiants = new TreeSet<>();
	/**
	 * Définition d'un set contenant la liste des modules associés à cette promotion
	 */
	private NavigableSet<Module> setListeModules = new TreeSet<>();
	
	
	public double calculMoyenne(int idUtilisateur) {
		return (double)(idUtilisateur);
	}

	public String getLibellePromo() {
		return libellePromo;
	}

	public void setLibellePromo(String libellePromo) {
		this.libellePromo = libellePromo;
	}

	//Constructeurs
	/**
	 * Constructeur de la Promotion
	 * @param libellePromo libelle de le promotion à créer
	 */
	public Promotion(String libellePromo) {
		this.libellePromo = libellePromo;
	}
	
	//Méthodes
	public String toString() {
		String res;
		res = "Promotion("+this.libellePromo+")";
		return res;
	}
	
	/**
	 * Ajouter un objet Etudiant dans la Promo
	 * @param e objet etudiant
	 */
	public void ajouterEtudiantDansPromo(Etudiant e){
		setListeEtudiants.add(e);
	}
	
	/**
	 * Supprimer un objet Etudiant dans la Promo
	 * @param e objet etudiant
	 */
	public void supprimerEtudiantDansPromo(Etudiant e){
		setListeEtudiants.remove(e);
	}
	
	/**
	 * Contient un objet Etudiant dans la Promo
	 * @param e objet etudiant
	 * @return booléen sur sa présence
	 */
	public boolean contientEtudiantDansPromo(Etudiant e){
		return setListeEtudiants.contains(e);
	}
	
	/**
	 * Ajouter un objet Module dans la Promo
	 * @param m objet module
	 */
	public void ajouterModuleDansPromo(Module m){
		setListeModules.add(m);
	}
	
	/**
	 * Supprimer un objet Module dans la Promo
	 * @param m objet module
	 */
	public void supprimerModule(Module m){
		setListeModules.remove(m);
	}
	
	/**
	 * Contient un objet Module dans la Promo
	 * @param m objet module
	 * @return booléen sur sa présence
	 */
	public boolean contientModule(Module m){
		return setListeModules.contains(m);
	}
	
	
}
