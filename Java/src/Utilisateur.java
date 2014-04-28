public abstract class Utilisateur{
	public final int idUtilisateur;
	public final String nom;
	public final String prenom;

//Getters
public final int getIdUtilisateur(){
	return this.idUtilisateur;
}

public final String getNom(){
	return this.nom;
}

public final String getPrenom(){
	return this.prenom;
}
	
//Constructeur
public Utilisateur(int idUtilisateur, String nom, String prenom){
		this.idUtilisateur=idUtilisateur;
        this.nom=nom;
        this.prenom=prenom;
    }

//Méthode identification
public void identification(){
	
}

}