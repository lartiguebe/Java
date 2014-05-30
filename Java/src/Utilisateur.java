import java.io.Serializable;

/**
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */
public abstract class Utilisateur implements Serializable, Comparable<Utilisateur>{
	/**
	 * Définition d'un serialVersionUID
	 */
	private static final long serialVersionUID = 4589350924094520510L;
	/**
	 * Nom de l'utilisateur
	 */
	private final String nom;
	/**
	 * Prenom de l'utilisateur
	 */
	private final String prenom;
	/**
	 * Login de l'utilisateur
	 */
	private final String login;
	/**
	 * password de l'utilisateur
	 */
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

/**
 * Constructeur de la classe Utilisateur
 * @param nom nom de l'utilisateur
 * @param prenom prenom de l'utilisateur
 * @param login login de l'utilisateur
 * @param password password de l'utilisateur
 */
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