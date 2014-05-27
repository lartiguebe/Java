import java.io.Serializable;

public abstract class Utilisateur implements Serializable, Comparable<Utilisateur>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4589350924094520510L;
	private final String nom;
	private final String prenom;
	private final String login;
	private final String password;


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
@Override
public String toString() {
	String res;
	res = "Utilisateur("+this.nom+","+this.prenom+","+this.login+","+this.password+")";
	return res;
}


}