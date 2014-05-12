
import java.util.ArrayList;

public class QuestionQCM {
	
	// On gère le nombre de question dans cette classe, et le libelle des réponses possibles?
	private String libelleQuestion;
	private ArrayList<String> reponses = new ArrayList<String>();
	private int indiceBonneReponse=-1;
	
	public void ajouterReponse(String reponse, boolean bon) {
		    this.reponses.add(reponse);
		    if (bon) {
		      indiceBonneReponse = reponses.size();
		    }
	}

	public String getLibelleQuestion() {
		return libelleQuestion;
	}

	public void setLibelleQuestion(String libelleQuestion) {
		this.libelleQuestion = libelleQuestion;
	}
	
}
