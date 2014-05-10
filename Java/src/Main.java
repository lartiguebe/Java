import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void Main(String[] args) throws IOException {
		Set<Module> modules = new HashSet<Module>();
		Set<Admin> administrateurs = new HashSet<Admin>();
		Set<Professeur> profs = new HashSet<Professeur>();
		Set<Etudiant> etudiants = new HashSet<Etudiant>();
		Set<Promotion> promos = new HashSet<Promotion>();
		
		
		Modele m = new Modele(modules,administrateurs,profs,etudiants,promos);
		Admin.creerUtilisateur("admin","","admin");
		Admin.creerUtilisateur("Lartigue","Benjamin","etudiant");
		Admin.creerUtilisateur("Godet","Maxence","prof");
		Admin.definirModule("Math", "Fun", "Lol");
		Admin.definirModule("Info", "BofFun", "Aucunes");
		Admin.creerPromotion("ING1");
		Iterator<Admin> it = administrateurs.iterator();
		while (it.hasNext()) {
		 System.out.println(it.next().toString());
		}
		
		Iterator<Etudiant> it4 = etudiants.iterator();
		while (it4.hasNext()) {
		 System.out.println(it4.next().toString());
		}
		
		Iterator<Professeur> it5 = profs.iterator();
		while (it5.hasNext()) {
		 System.out.println(it5.next().toString());
		}
		
		Iterator<Module> it2 = modules.iterator();
		while (it2.hasNext()) {
		 System.out.println(it2.next().toString());
		}
		
		Iterator<Promotion> it3 = promos.iterator();
		while (it3.hasNext()) {
		 System.out.println(it3.next().toString());
		}
		
		Sauvegarde.sauvegardeObjet(m);
		
			

	}

}
