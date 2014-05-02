
public class Module {


	private String nom;
	private String syllabus;
	private String prerequis;
	
	public double calculMoyenne(int idUtilisateur) {
		return (double)(idUtilisateur);
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getPrerequis() {
		return prerequis;
	}

	public void setPrerequis(String prerequis) {
		this.prerequis = prerequis;
	}
	
	public Module(String nom, String syllabus, String prerequis){
		this.nom=nom;
		this.syllabus=syllabus;
		this.prerequis=prerequis;
	}
	
	public String toString() {
		String res;
		res = "Module("+this.nom+","+this.syllabus+","+this.prerequis+")";
		return res;
	}
}
