
import java.util.ArrayList;

public class QuestionQCM {
	// libelle de la question
	private String libelleQuestion;
	// réponses de la question
	private ArrayList<String> reponses = new ArrayList<String>();
	// numéro de la réponse correcte
	private int indiceBonneReponse=-1;
	// indice de la réponse
	private int indiceReponse;
	// resultat à la question
	private boolean resultat;
	
	// Constructeur si on a uniquement l'énoncé
	public QuestionQCM(String libelleQuestion){
		this.libelleQuestion=libelleQuestion;
	}
	
	// Constructeur avec l'indice de la réponse correcte
	public QuestionQCM(String libelleQuestion,int indiceBonneReponse){
		this.libelleQuestion=libelleQuestion;
		this.indiceBonneReponse=indiceBonneReponse;
	}
	
	// Constructeur avec le résultat à la question
	public QuestionQCM(String libelleQuestion,int indiceBonneReponse,boolean resultat) {
		this.libelleQuestion=libelleQuestion;
		this.indiceBonneReponse=indiceBonneReponse;
		this.resultat=resultat;
	}
	// Getter
	public int getIndiceBonneReponse() {
		return indiceBonneReponse;
	}

	// Setter
	public void setIndiceBonneReponse(int indiceBonneReponse) {
		this.indiceBonneReponse = indiceBonneReponse;
	}

	// Ajout d'une réponse à une question
	public void ajouterReponse(String reponse, boolean bon) {
		// Ajout de la réponse à la liste
		    this.reponses.add(reponse);
		    // Si c'est la bonne réponse, on récupère son indice
		    if (bon) {
		      indiceBonneReponse = reponses.size();
		    }
	}

	// Vérification de la réponse à une question
	public boolean verificationReponse() {
		// Si l'indice de la réponse donnée est le même que celui de la bonne réponse, resultat prend la valeur "true"
		if (indiceReponse==getIndiceBonneReponse()) {
			resultat=true;
		} else {
			resultat=false;
		}
		return(resultat);
	}
	
	//Getter
	public String getLibelleQuestion() {
		return libelleQuestion;
	}

	//Setter
	public void setLibelleQuestion(String libelleQuestion) {
		this.libelleQuestion = libelleQuestion;
	}
	
	//Création d'une question avec l'indice de la bonne réponse à partir du libelle
	public QuestionQCM creerQuestion(String libelle) {
		// Choix pour le prof, si la réponse est juste ou non
		boolean juste;
		// Indice de la bonne réponse
		int indiceBonneReponse;
		// compteur et variable permettant de récupérer si la réponse est bonne ou non
		int i,f;
		//  Liste du libelle des réponses
		String[] reponses={"r1","r2","r3","r4"};
		// Boucle pour ajouter les 4 réponses
		for (i=0; i<4;i++) {
			// initialise la variable
			juste=false;
			// Si réponse juste ou non
			f=-1;
			// Si f=-1, alors la réponse est fausse
			if (f==0) {
				juste=true;
			}
			// On ajoute la réponse au questionnaire
			ajouterReponse(reponses[i],juste);
		}
		indiceBonneReponse=getIndiceBonneReponse();
		QuestionQCM question1=new QuestionQCM(libelle,indiceBonneReponse);
		return(question1);
	}
	
}