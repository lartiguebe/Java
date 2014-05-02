public class Promotion {
	
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
		super();
		this.libellePromo = libellePromo;
	}
	
	public String toString() {
		String res;
		res = "Promotion("+this.libellePromo+")";
		return res;
	}
	
	
}
