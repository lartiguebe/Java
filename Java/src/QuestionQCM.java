
import java.util.ArrayList;

public class QuestionQCM {
	
	private String libelleQuestion;
	private ArrayList<String> reponses = new ArrayList<String>();
	private int indiceBonneReponse=-1;;
	private int indiceReponse;
	private boolean resultat;
	
	public QuestionQCM(String libelleQuestion){
		this.libelleQuestion=libelleQuestion;
	}
	
	public QuestionQCM(String libelleQuestion,int indiceBonneReponse){
		this.libelleQuestion=libelleQuestion;
		this.indiceBonneReponse=indiceBonneReponse;
	}
	
	public QuestionQCM(String libelleQuestion,int indiceBonneReponse,boolean resultat) {
		this.libelleQuestion=libelleQuestion;
		this.indiceBonneReponse=indiceBonneReponse;
		this.resultat=resultat;
	}
	
	public int getIndiceBonneReponse() {
		return indiceBonneReponse;
	}

	public void setIndiceBonneReponse(int indiceBonneReponse) {
		this.indiceBonneReponse = indiceBonneReponse;
	}

	public void ajouterReponse(String reponse, boolean bon) {
		    this.reponses.add(reponse);
		    if (bon) {
		      indiceBonneReponse = reponses.size();
		    }
	}

	public boolean verificationReponse() {
		if (indiceReponse==getIndiceBonneReponse()) {
			resultat=true;
		} else {
			resultat=false;
		}
		return(resultat);
	}
	
	
	public String getLibelleQuestion() {
		return libelleQuestion;
	}

	public void setLibelleQuestion(String libelleQuestion) {
		this.libelleQuestion = libelleQuestion;
	}
	
	public QuestionQCM creerQuestion(QuestionQCM question,String libelle) {
		boolean juste;
		int indiceBonneReponse;
		int i,f;
		String[] reponses={"r1","r2","r3","r4"};
		for (i=0; i<4;i++) {
			juste=false;
			// Si réponse juste ou non
			f=-1;
			if (f==0) {
				juste=true;
			}
			ajouterReponse(reponses[i],juste);
		}
		indiceBonneReponse=getIndiceBonneReponse();
		QuestionQCM question1=new QuestionQCM(libelle,indiceBonneReponse);
		return(question1);
	}
	
}