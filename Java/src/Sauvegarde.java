import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Sauvegarde {
	public static void sauvegardeObjet(Modele d) throws IOException{
		File f = new File("modele.obj");
		try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(f))){
			ob.writeObject(d);
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
	
	public static Modele lireObjet() throws IOException, ClassNotFoundException{
		File f = new File("modele.obj");
		Modele d;
		try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream(f))){
			d = (Modele)ob.readObject();
		}
		catch (IOException | ClassNotFoundException e){
			d=new Modele();
		}
		return d;
	}

}
