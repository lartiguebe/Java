import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void Main(String[] args) throws IOException, ClassNotFoundException {
//		Admin.creerUtilisateur("Lartigue","Benjamin","etudiant");
//		Admin.creerUtilisateur("Godet","Maxence","prof");
//		Admin.definirModule("Math", "Fun", "Lol");
//		Admin.definirModule("Info", "BofFun", "Aucunes");
//		Admin.creerPromotion("ING1");
//		Iterator<Admin> it = administrateurs.iterator();
//		while (it.hasNext()) {
//		 System.out.println(it.next().toString());
//		}
		Modele m;
		m = Sauvegarde.lireObjet();
		//Lancer interface graphique thomas ici
		
		Sauvegarde.sauvegardeObjet(m);
		
			

	}

}
