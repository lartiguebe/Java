import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 * QCM est la classe correspondant aux questionnaires à choix multiples.
 * Elle est caractérisée par:
 * Le libellé du qcm
 * Le statut du qcm, public ou privé
 * La promotion concernée par le qcm
 * La session dans laquelle ce qcm est posée
 * @author groupe QCM6
 * @version 1.0
 */

public class QCM {

	/**
	 * Libelle du questionnaire
	 * @see libelle#getLibelle
	 * @see libelle#setLibelle(String)
	 */
	private String libelle;
	/**
	 * Statut de la question, 1 si public, 0 si privé
	 */
	private boolean statut;
	/**
	 * Promotion concernée par le qcm
	 * @see Promotion
	 */
	private Promotion promotion;
	/**
	 * Liste de questions
	 */
	private ArrayList<QuestionQCM> questions=new ArrayList<QuestionQCM>();
	/**
	 * Session dans laquelle est posée le qcm
	 * @see Session
	 */
	private Session session;
	
	/**
	 * Constructeur QCM
	 * @param libelle
	 * le libelle du qcm
	 * @param session
	 * la session dans laquelle il est posé
	 * @param promotion
	 * la promotion à laquelle il est posé
	 * @param statut
	 * le statut, privé ou public
	 * @param questions
	 * la liste des questions
	 */
	public QCM(String libelle, Session session, Promotion promotion, boolean statut,ArrayList<QuestionQCM> questions) {
		this.libelle=libelle;
		this.session=session;
		this.promotion=promotion;
		this.statut=statut;
		this.questions=questions;
	}
	

	/**
	 * Permet d'ajouter une question à la liste des questions
	 * @param question
	 */
	public void ajouterQuestion(QuestionQCM question) {
		this.questions.add(question);
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
