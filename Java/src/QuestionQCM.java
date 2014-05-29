
import java.util.ArrayList;

public class QuestionQCM {
	
	private String libelleQuestion;
	private ArrayList<String> reponses = new ArrayList<String>();
	private int indiceBonneReponse=-1;;
	private int indiceReponse;
	private boolean resultat;
	
	public QuestionQCM(String libelleQuestion,int indiceReponse,boolean resultat) {
		this.libelleQuestion=libelleQuestion;
		this.indiceReponse=indiceReponse;
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
	
	
}