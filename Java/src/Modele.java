import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Modele du projet qui va contenir toutes les choses utiles à sauvegarder
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */
public class Modele implements Serializable {
	/**
	 * Définition d'un serialVersionUID
	 */
	private static final long serialVersionUID = -4188236036221949452L;
		 //Création des collections nécessaires
	/**
	 * Définition d'un set de modules
	 */
	private NavigableSet<Module> modules;
	/**
	 * Définition d'un set d'administrateurs
	 */
	private NavigableSet<Admin> administrateurs;
	/**
	 * Définition d'un set de professeurs
	 */
	private NavigableSet<Professeur> profs;
	/**
	 * Définition d'un set d'étudiants
	 */
	private NavigableSet<Etudiant> etudiants;
	/**
	 * Définition d'un set de promotions
	 */
	private NavigableSet<Promotion> promos;
	/**
	 * Définition d'un set de qcms
	 */
	private NavigableSet<QCM> qcms;
	/**
	 * Définition d'un set de questions
	 */
	private ArrayList<QuestionQCM> questions;
	
		//Getters
		public Set<Module> getModule(){
			return Collections.unmodifiableSortedSet(this.modules);
		}
		
		public Set<Admin>getAdmin(){
			return Collections.unmodifiableSortedSet(this.administrateurs);
		}
		
		public Set<Professeur>getProf(){
			return Collections.unmodifiableSortedSet(this.profs);
		}
		
		public Set<Etudiant>getEtudiant(){
			return Collections.unmodifiableSortedSet(this.etudiants);
		}
		
		public Set<Promotion>getPromo(){
			return Collections.unmodifiableSortedSet(this.promos);
		}
		
		public Set<QCM>getQCM(){
			return Collections.unmodifiableSortedSet(this.qcms);
		}
		
		public List<QuestionQCM> getQuestions(){
			return Collections.unmodifiableList(this.questions);
		}
		
		
		//Constructeur
		/**
		 * Constructeur de Modele
		 * Initialise tous nos collections
		 */
		public Modele() {
			this.modules = new TreeSet<>();
			this.administrateurs = new TreeSet<>();
			this.profs = new TreeSet<>();
			this.etudiants = new TreeSet<>();
			this.promos = new TreeSet<>();
			this.qcms = new TreeSet<QCM>();
			this.questions = new ArrayList<QuestionQCM>();
			try {
				Admin.creerUtilisateur("admin","","admin", this); //On crée un premier utilisateur pour pouvoir se connecter
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * On initialise le modele à null
		 */
		static Modele refModele  = null;
		
		/**
		 * Constructeur du modèle avec pattern Singleton
		 * @return Modele créé
		 */
		public static Modele getModele() {
			if (refModele==null){
						try {
							refModele=Sauvegarde.lireModele();
						} catch (ClassNotFoundException | IOException e) {
							e.printStackTrace();
						}
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
		/**
		 * Ajouter un objet Module
		 * @param m objet Module
		 */
		public void ajouterModule(Module m){
			modules.add(m);
		}
		
		/**
		 * Supprimer un objet Module
		 * @param m objet Module
		 */
		public void supprimerModule(Module m){
			modules.remove(m);
		}
		
		/**
		 * Ajouter un objet Module
		 * @param m objet Module
		 * @return booléen sur sa présence
		 */
		public boolean contientModule(Module m){
			return modules.contains(m);
		}
		
		/**
		 * Ajouter un objet Admin
		 * @param a objet Admin
		 */
		public void ajouterAdmin(Admin a){
			administrateurs.add(a);
		}
		
		/**
		 * Supprimer un objet Admin
		 * @param a objet Admin
		 */
		public void supprimerAdmin(Admin a){
			administrateurs.remove(a);
		}
		
		/**
		 * Contient un objet Admin
		 * @param a objet Admin
		 * @return booléen sur sa présence
		 */
		public boolean contientAdmin(Admin a){
			return administrateurs.contains(a);
		}
		
		/**
		 * Ajouter un objet Professeur
		 * @param p objet Professeur
		 */
		public void ajouterProfesseur(Professeur p){
			profs.add(p);
		}
		
		/**
		 * Supprimer un objet Professeur
		 * @param p objet Professeur
		 */
		public void supprimerProfesseur(Professeur p){
			profs.remove(p);
		}
		
		/**
		 * Contient un objet Professeur
		 * @param p objet Professeur
		 * @return booléen sur sa présence
		 */
		public boolean contientProfesseur(Professeur p){
			return administrateurs.contains(p);
		}
		
		/**
		 * Ajouter un objet Etudiant
		 * @param e objet Etudiant
		 */
		public void ajouterEtudiant(Etudiant e){
			etudiants.add(e);
		}
		
		/**
		 * Supprimer un objet Etudiant
		 * @param e objet Etudiant
		 */
		public void supprimerEtudiant(Etudiant e){
			etudiants.remove(e);
		}
		
		/**
		 * Contient un objet Etudiant
		 * @param e objet Etudiant
		 * @return booléen sur sa présence
		 */
		public boolean contientEtudiant(Etudiant e){
			return etudiants.contains(e);
		}
		
		/**
		 * Ajouter un objet Promotion
		 * @param p objet Promotion
		 */
		public void ajouterPromo(Promotion p){
			promos.add(p);
		}
		
		/**
		 * Supprimer un objet Promotion
		 * @param p objet Promotion
		 */
		public void supprimerPromo(Promotion p){
			promos.remove(p);
		}
		
		/**
		 * Contient un objet Promotion
		 * @param p objet Promotion
		 * @return booléen sur sa présence
		 */
		public boolean contientPromo(Promotion p){
			return promos.contains(p);
		}
		
		/**
		 * Permets de trouver un utilisateur à partir de son login 
		 * @param login login de l'utilisateur à retrouver
		 * @return retourne un objet utilisateur
		 * @throws ClassNotFoundException
		 * @throws IOException
		 */
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
		
		/**
		 * Permets de trouver un module à partir de son nom
		 * @param nomModule chaine contenant le nom du module à trouver
		 * @return retourne un objet module
		 * @throws ClassNotFoundException
		 * @throws IOException
		 */
		public Module getModule(String nomModule) throws ClassNotFoundException, IOException{
			Modele m;
			m = Modele.getModele();
			Module res = null;
			try{
				for(Module mod : m.getModule()){
					if (mod.getNom().equals(nomModule)){
						res = mod;
					}
				}
			}catch (Exception e){
				System.out.println("Problème modèle au getModule!: "+e);
			}
			return res;
		}
}
