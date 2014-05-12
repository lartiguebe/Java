import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Modele implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4188236036221949452L;
		 //Création des collections nécessaires
	private Set<Module> modules;
	private Set<Admin> administrateurs;
	private Set<Professeur> profs;
	private Set<Etudiant> etudiants;
	private Set<Promotion> promos;
	
		//Setters
		public Set<Module>getModule(){
			return Collections.unmodifiableSet(this.modules);
		}
		
		public Set<Admin>getAdmin(){
			return Collections.unmodifiableSet(this.administrateurs);
		}
		
		public Set<Professeur>getProf(){
			return Collections.unmodifiableSet(this.profs);
		}
		
		public Set<Etudiant>getEtudiant(){
			return Collections.unmodifiableSet(this.etudiants);
		}
		
		public Set<Promotion>getPromo(){
			return Collections.unmodifiableSet(this.promos);
		}
		
		//Constructeur
		public Modele(){
			this.modules = new HashSet<Module>();
			this.administrateurs = new HashSet<Admin>();
			this.profs = new HashSet<Professeur>();
			this.etudiants = new HashSet<Etudiant>();
			this.promos = new HashSet<Promotion>();
			Admin.creerUtilisateur("admin","","admin",this);
		}
		
		//Méthodes
		public void ajouterModule(Module m){
			modules.add(m);
		}
		
		public void supprimerModule(Module m){
			modules.remove(m);
		}
		
		public void ajouterAdmin(Admin a){
			administrateurs.add(a);
		}
		
		public void supprimerAdmin(Admin a){
			administrateurs.remove(a);
		}
		
		public void ajouterProfesseur(Professeur p){
			profs.add(p);
		}
		
		public void supprimerProfesseur(Professeur p){
			profs.remove(p);
		}
		
		public void ajouterEtudiant(Etudiant e){
			etudiants.add(e);
		}
		
		public void supprimerEtudiant(Etudiant e){
			etudiants.remove(e);
		}
		
		public void ajouterPromo(Promotion p){
			promos.add(p);
		}
		
		public void supprimerPromo(Promotion p){
			promos.remove(p);
		}
}
