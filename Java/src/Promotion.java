import java.io.Serializable;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Promotion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6346273924623297066L;
	private String libellePromo;
	private NavigableSet<Etudiant> ensEtudiant;
	
	
	
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
		this.ensEtudiant = new TreeSet<Etudiant>(); //TODO
	}
	
	public String toString() {
		String res;
		res = "Promotion("+this.libellePromo+")";
		return res;
	}
	
	
}
