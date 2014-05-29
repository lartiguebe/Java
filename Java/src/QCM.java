import java.util.ArrayList;
import java.util.GregorianCalendar;

public class QCM {

	// Libelle du qcm
	private String libelle;
	// Date de début et de fin
	private boolean statut;
	// Promotion
	private Promotion promotion;
	// Liste des questions du qcm
	private ArrayList<QuestionQCM> questionnaire=new ArrayList<QuestionQCM>();
	private Session session;
	
	// Constructeur
	public QCM(String libelle, Session session, Promotion promotion, boolean statut) {
		this.libelle=libelle;
		this.session=session;
		this.promotion=promotion;
		this.statut=statut;
	}
	

	// Ajout d'une question au qcm
	public void ajouterQuestion(QuestionQCM question) {
		this.questionnaire.add(question);
	}

	// getters et setters
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
		Session session=new Session(definirDate(jourD,moisD,anneeD),definirDate(jourF,moisF,anneeF));
		QCM questionnaire=new QCM(libelle,session,promo,statut);
		// Ajout des questions au qcm
		for (i=0;i<nombreQuestion;i++){
			libelleQuestion="Question";
			QuestionQCM question=new QuestionQCM(libelleQuestion);
			question=QuestionQCM.creerQuestion(libelleQuestion);
			ajouterQuestion(question);
		}
		return(questionnaire);
	}
}
