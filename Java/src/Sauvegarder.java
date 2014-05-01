import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Sauvegarder {
	public static void sauvegardeObjet(Modele m) throws IOException{
		File f = new File("dessin.obj");
		try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(f))){
			ob.writeObject(m);
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
	
	public static Modele lireObjet() throws IOException, ClassNotFoundException{
		File f = new File("dessin.obj");
		Modele m;
		try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream(f))){
			m = (Modele)ob.readObject();
		}
		return m;
	}
}
