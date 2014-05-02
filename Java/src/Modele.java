import java.io.Serializable;
import java.util.Set;

public class Modele implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4188236036221949452L;
		//Création des collections nécessaires
		static Set<Module> modules;
		static Set<Admin> administrateurs;
		static Set<Professeur> profs;
		static Set<Etudiant> etudiants;
		static Set<Promotion> promos;
	
		//Setters
		public static Set<Module>getModule(){
			return modules;
		}
		
		public static Set<Admin>getAdmin(){
			return administrateurs;
		}
		
		public static Set<Professeur>getProf(){
			return profs;
		}
		
		public static Set<Etudiant>getEtudiant(){
			return etudiants;
		}
		
		public static Set<Promotion>getPromo(){
			return promos;
		}
		
		//Constructeur
		public Modele(Set<Module> module, Set<Admin> admins, Set<Professeur> profss, Set<Etudiant> etudiantss, Set<Promotion> promoss){
			modules = module;
			administrateurs = admins;
			profs = profss;
			etudiants = etudiantss;
			promos = promoss;
		}
		
		//Méthodes
		public static void ajouterModule(Module m){
			modules.add(m);
		}
		
		public static void supprimerModule(Module m){
			modules.remove(m);
		}
		
		public static void ajouterAdmin(Admin a){
			administrateurs.add(a);
		}
		
		public static void supprimerAdmin(Admin a){
			administrateurs.remove(a);
		}
		
		public static void ajouterProfesseur(Professeur p){
			profs.add(p);
		}
		
		public static void supprimerProfesseur(Professeur p){
			profs.remove(p);
		}
		
		public static void ajouterEtudiant(Etudiant e){
			etudiants.add(e);
		}
		
		public static void supprimerEtudiant(Etudiant e){
			etudiants.remove(e);
		}
		
		public static void ajouterPromo(Promotion p){
			promos.add(p);
		}
		
		public static void supprimerPromo(Promotion p){
			promos.remove(p);
		}
}
