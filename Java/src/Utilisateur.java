import java.io.Serializable;

public abstract class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4589350924094520510L;
	public final String nom;
	public final String prenom;
	public final String login;
	public final String password;


//Getters
public final String getNom(){
	return this.nom;
}

public final String getPrenom(){
	return this.prenom;
}

public final String getlogin(){
	return this.login;
}

public final String getPassword(){
	return this.password;
}
//Constructeur
public Utilisateur(String nom, String prenom, String login, String password){
        this.nom=nom;
        this.prenom=prenom;
        this.login=login;
        this.password=password;
    }

public String toString() {
	String res;
	res = "Utilisateur("+this.nom+","+this.prenom+","+this.login+","+this.password+")";
	return res;
}

//Méthode identification
public void identification(){
	
}

}