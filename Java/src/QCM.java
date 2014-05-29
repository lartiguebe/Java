import java.util.ArrayList;
import java.util.GregorianCalendar;

public class QCM {

	// Libelle du qcm
	private String libelle;
	// Date de début et de fin
	private GregorianCalendar dateDebutQCM;
	private GregorianCalendar dateFinQCM;
	// Promotion
	private Promotion promotion;
	// Liste des questions du qcm
	private ArrayList<QuestionQCM> questionnaire=new ArrayList<QuestionQCM>();
	
	// Constructeur
	public QCM(String libelle, GregorianCalendar dateDebutQCM,GregorianCalendar dateFinQCM, Promotion promotion) {
		this.setLibelle(libelle);
		this.dateDebutQCM=dateDebutQCM;
		this.dateFinQCM=dateFinQCM;
		this.promotion=promotion;
	}
	
	// Construction de la date à partir du jour, mois et de l'année
	public static GregorianCalendar definirDate(int jour, int mois, int annee){
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.set(annee,mois+1,jour);
		return(calendar);
		}
	

	// Ajout d'une question au qcm
	public void ajouterQuestion(QuestionQCM question) {
		this.questionnaire.add(question);
	}

	// getters et setters
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
	
	
	//Creation d'un qcm
	public QCM creerQCM(int jourD,int jourF,int moisD,int moisF,int anneeD,int anneeF,String libelle, Promotion promo) {
		// Nombre de question du qcm
		int nombreQuestion=20;
		// Compteur
		int i;
		// Libelle d'une question
		String libelleQuestion;
		// Création d'un qcm
		QCM questionnaire=new QCM(libelle,definirDate(jourD,moisD,anneeD),definirDate(jourF,moisF,anneeF),promo);
		// Ajout des questions au qcm
		for (i=0;i<nombreQuestion;i++){
			libelleQuestion="Question";
			QuestionQCM question=new QuestionQCM(libelleQuestion);
			question=creerQuestion(question,libelleQuestion);
			ajouterQuestion(question);
		}
		return(questionnaire);
	}
}
