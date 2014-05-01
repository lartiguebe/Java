import java.util.HashSet;
import java.util.Set;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Module> modules = new HashSet<Module>();
		Set<Admin> administrateurs = new HashSet<Admin>();
		Set<Professeur> profs = new HashSet<Professeur>();
		Set<Etudiant> etudiants = new HashSet<Etudiant>();
		
		modules.add(new Module("Math","C'est cool les maths", "Aucuns"));
		Modele m = new Modele(modules,administrateurs,profs,etudiants);
		System.out.println(modules.toString());
		
		

	}

}
