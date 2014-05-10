import java.io.Serializable;
import java.util.Collections;
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
		public Set<Module>getModule(){
			return Collections.unmodifiableSet(Modele.modules);
		}
		
		public Set<Admin>getAdmin(){
			return Collections.unmodifiableSet(Modele.administrateurs);
		}
		
		public Set<Professeur>getProf(){
			return Collections.unmodifiableSet(Modele.profs);
		}
		
		public Set<Etudiant>getEtudiant(){
			return Collections.unmodifiableSet(Modele.etudiants);
		}
		
		public Set<Promotion>getPromo(){
			return Collections.unmodifiableSet(Modele.promos);
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
