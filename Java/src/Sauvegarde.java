import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Classe qui permet de sauvegarder ou de lire le modele.obj
 * @author Benjamin Lartigue
 * @version 1.0
 *
 */

public class Sauvegarde {
	
	
	/**
	 * Permets de sauvegarder le modèle après avoir mis toutes ses collections à jour
	 * @param d Modele à sauvegarder
	 * @throws IOException
	 */
	public static void sauvegardeModele(Modele d) throws IOException{
		File f = new File("modele.obj");
		try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(f))){
			ob.writeObject(d);
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
	
	/**
	 * Permets de lire le modèle s'il est créé, ou tout simplement de le créer
	 * @return Modele créé ou mise a jour du modèle
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Modele lireModele() throws IOException, ClassNotFoundException{
		File f = new File("modele.obj");
		Modele d;
		try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream(f))){
			d = (Modele)ob.readObject();
		}
		catch (IOException | ClassNotFoundException e){
			d=new Modele();//Créer un nouveau modèle s'il n'existe pas encore
		}
		return d;
	}

}
