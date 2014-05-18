import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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
		public Set<Module> getModule(){
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
		public Modele() throws ClassNotFoundException, IOException{
			this.modules = new HashSet<Module>();
			this.administrateurs = new HashSet<Admin>();
			this.profs = new HashSet<Professeur>();
			this.etudiants = new HashSet<Etudiant>();
			this.promos = new HashSet<Promotion>();
			Admin.creerUtilisateur("admin","","admin", this);
		}
		
		static Modele refModele  = null;
		
		public static Modele getModele() throws ClassNotFoundException, IOException{
			if (refModele==null){
				refModele=Sauvegarde.lireObjet();
			}
			return refModele;
		}
		
		//Méthodes listes
		
		
		public void getListModule(){
			Iterator<Module> it = modules.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
//		@Override
//		public Iterator<Module> iterator(){
//			return Collections.unmodifiableSet(modules).iterator();
//		}
		
		public void getListAdmin(){
			Iterator<Admin> it = administrateurs.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
		public void getListProf(){
			Iterator<Professeur> it = profs.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
		public void getListEtudiant(){
			Iterator<Etudiant> it = etudiants.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
		public void getListPromo(){
			Iterator<Promotion> it = promos.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
		
		//Méthodes
		public void ajouterModule(Module m){
			modules.add(m);
		}
		
		public void supprimerModule(Module m){
			modules.remove(m);
		}
		
		public boolean contientModule(Module m){
			return modules.contains(m);
		}
		
		public void ajouterAdmin(Admin a){
			administrateurs.add(a);
		}
		
		public void supprimerAdmin(Admin a){
			administrateurs.remove(a);
		}
		
		public boolean contientAdmin(Admin a){
			return administrateurs.contains(a);
		}
		
		public void ajouterProfesseur(Professeur p){
			profs.add(p);
		}
		
		public void supprimerProfesseur(Professeur p){
			profs.remove(p);
		}
		
		public boolean contientProfesseur(Professeur p){
			return administrateurs.contains(p);
		}
		
		public void ajouterEtudiant(Etudiant e){
			etudiants.add(e);
		}
		
		public void supprimerEtudiant(Etudiant e){
			etudiants.remove(e);
		}
		
		public boolean contientEtudiant(Etudiant e){
			return etudiants.contains(e);
		}
		
		public void ajouterPromo(Promotion p){
			promos.add(p);
		}
		
		public void supprimerPromo(Promotion p){
			promos.remove(p);
		}
		
		public boolean contientPromo(Promotion p){
			return promos.contains(p);
		}
		
		public Utilisateur getUtilisateur(String login) throws ClassNotFoundException, IOException{
			Utilisateur res = null;
			try{
				for(Utilisateur u : this.getAdmin()){
					if (u.getlogin().equals(login)){
						res = u;
					}
				}
				
				if ((res==null) && (!this.getProf().isEmpty())){
					for(Utilisateur u : this.getProf()){
						if (u.getlogin().equals(login)){
							res = u;
						}
					}
				}
				
				if ((res==null) && (!this.getEtudiant().isEmpty())){
					for(Utilisateur u : this.getEtudiant()){
						if (u.getlogin().equals(login)){
							res = u;
						}
					}
				}
			}catch (Exception e){
				System.out.println("Problème modèle au getUtilisateur!: "+e);
			}
			return res;
		}
		
		public Module getModule(Module module) throws ClassNotFoundException, IOException{
			Modele m;
			m = Modele.getModele();
			Module res = null;
			try{
				for(Module mod : m.getModule()){
					if (mod.getNom().equals(module)){
						res = mod;
					}
				}
			}catch (Exception e){
				System.out.println("Problème modèle au getModule!: "+e);
			}
			return res;
		}
}
