import java.io.Serializable;
import java.util.NavigableSet;
import java.util.TreeSet;


public class Promotion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6346273924623297066L;
	private String libellePromo;
	private NavigableSet<Etudiant> setListeEtudiants = new TreeSet<>();
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

	public Promotion(String libellePromo) {
		this.libellePromo = libellePromo;
	}
	
	//Méthodes
	public String toString() {
		String res;
		res = "Promotion("+this.libellePromo+")";
		return res;
	}
	
	public void ajouterEtudiantDansPromo(Etudiant e){
		setListeEtudiants.add(e);
	}
	
	public void supprimerEtudiantDansPromo(Etudiant e){
		setListeEtudiants.remove(e);
	}
	
	public boolean contientEtudiantDansPromo(Etudiant e){
		return setListeEtudiants.contains(e);
	}
	
	public void ajouterModuleDansPromo(Module m){
		setListeModules.add(m);
	}
	
	public void supprimerModule(Module m){
		setListeModules.remove(m);
	}
	
	public boolean contientModule(Module m){
		return setListeModules.contains(m);
	}
	
	
}
