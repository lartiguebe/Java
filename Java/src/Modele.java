import java.util.Set;

public class Modele {
	 //Création des collections nécessaires
		static Set<Module> modules;
		static Set<Admin> administrateurs;
		static Set<Professeur> profs;
		static Set<Etudiant> etudiants;
	
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
		
		//Constructeur
		public Modele(Set<Module> module, Set<Admin> admins, Set<Professeur> profss, Set<Etudiant> etudiantss){
			modules = module;
			administrateurs = admins;
			profs = profss;
			etudiants = etudiantss;
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
		
		public static void ajouterProfesseur(Professeur p){
			profs.add(p);
		}
		
		public static void ajouterEtudiant(Etudiant e){
			etudiants.add(e);
		}
}
