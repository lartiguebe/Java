import java.io.Serializable;
import java.util.Objects;


public class Module implements Serializable, Comparable<Module>{


	/**
	 * 
	 */
	private static final long serialVersionUID = -2146559383652094675L;
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
	
	//Méthodes
	
	
	@Override
	public String toString() {
		String res;
		res = "Module("+this.nom+","+this.syllabus+","+this.prerequis+")";
		return res;
	}
	
	@Override
	public boolean equals (Object o) {
		if(o==this) {//Si c'est le même
			return true;
		} 
		if (!(o instanceof Module)) {//Si ce n'est pas un point
			return false;
		}

		Module p = (Module) o;
		return ((this.getNom().equals(p.getNom()))&&(this.getSyllabus().equals(p.getSyllabus()))&&(this.getPrerequis().equals(p.getPrerequis())));
		//Si nom obligatoire, on peut faire this.nom.equals(p.nom)
	}
	
	@Override
	public int compareTo(Module o) {
		return this.getNom().compareTo(o.getNom());
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(this.getNom(),this.getSyllabus(),this.getPrerequis());
	}
}
