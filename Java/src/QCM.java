import java.util.ArrayList;
import java.util.GregorianCalendar;

public class QCM {

	private String libelle;
	private GregorianCalendar dateDebutQCM;
	private GregorianCalendar dateFinQCM;
	private Promotion promotion;
	private ArrayList<QuestionQCM> questionnaire=new ArrayList<QuestionQCM>();
	
	public QCM(String libelle, GregorianCalendar dateDebutQCM,GregorianCalendar dateFinQCM, Promotion promotion) {
		this.setLibelle(libelle);
		this.dateDebutQCM=dateDebutQCM;
		this.dateFinQCM=dateFinQCM;
		this.promotion=promotion;
	}
	
	public static GregorianCalendar definirDate(int jour, int mois, int annee){
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.set(annee,mois+1,jour);
		return(calendar);
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

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	public QCM creerQCM(int jourD,int jourF,int moisD,int moisF,int anneeD,int anneeF,String libelle, Promotion promo) {
		int nombreQuestion=20;
		int i;
		String libelleQuestion;
		QCM questionnaire=new QCM(libelle,definirDate(jourD,moisD,anneeD),definirDate(jourF,moisF,anneeF),promo);
		for (i=0;i<nombreQuestion;i++){
			libelleQuestion="Question";
			QuestionQCM question=new QuestionQCM(libelleQuestion);
			question=creerQuestion(question,libelleQuestion);
			ajouterQuestion(question);
		}
		return(questionnaire);
	}
}
