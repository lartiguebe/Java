import java.io.IOException;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main (String[] args) throws ClassNotFoundException, IOException{
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
		//m = Sauvegarde.lireObjet();
		m = Modele.getModele();
		//Lancer interface graphique thomas
		//Admin.creerUtilisateur("Lartigue", "Benjamin", "admin",m);
		//Admin.creerPromotion("ING2", m);
		m.getListAdmin();
		m.getListModule();
		m.getListPromo();
	
		Sauvegarde.sauvegardeObjet(m);
	}

}
