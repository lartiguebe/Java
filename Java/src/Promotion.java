import java.io.Serializable;


public class Promotion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6346273924623297066L;
	private String libellePromo;
	
	
	
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
	
	public String toString() {
		String res;
		res = "Promotion("+this.libellePromo+")";
		return res;
	}
	
	
}
