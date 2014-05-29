import java.util.ArrayList;
import java.util.GregorianCalendar;

public class QCM {

	private GregorianCalendar dateDebutQCM;
	private GregorianCalendar dateFinQCM;
	private String promotion;
	private ArrayList<QuestionQCM> questionnaire=new ArrayList<QuestionQCM>();
	
	//private String repetition; 
	// Ajouter nombre de questions en paramètre?
	public QCM(GregorianCalendar dateDebutQCM,GregorianCalendar dateFinQCM, String promotion) {
		this.dateDebutQCM=dateDebutQCM;
		this.dateFinQCM=dateFinQCM;
		this.promotion=promotion;
	}
	
	public static void definirDate(int jour, int mois, int annee){
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.set(annee,mois+1,jour);
		
		/* calendar.set(Calendar.YEAR, annee);
		calendar.set(Calendar.MONTH, mois+1);
		calendar.set(Calendar.DAY, jour);
		 */
			
		}
	

	public void ajouterQuestion(QuestionQCM question) {
		this.questionnaire.add(question);
	}

	public GregorianCalendar getDateDebutQCM() {
		return dateDebutQCM;
	}

	public void setDateDebutQCM(GregorianCalendar dateDebutQCM) {
		this.dateDebutQCM = dateDebutQCM;
	}

	public GregorianCalendar getDateFinQCM() {
		return dateFinQCM;
	}

	public void setDateFinQCM(GregorianCalendar dateFinQCM) {
		this.dateFinQCM = dateFinQCM;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
/*
	public String getRepetition() {
		return repetition;
	}

	public void setRepetition(String repetition) {
		this.repetition = repetition;
	}
	*/
	
}
