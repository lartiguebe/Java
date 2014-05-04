package src;

import java.util.GregorianCalendar;

public class QCM {

	private GregorianCalendar dateDebutQCM;
	private GregorianCalendar dateFinQCM;
	private String promotion;
	//private String repetition; 
	
	public static void definirDate(int jour, int mois, int annee){
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.set(annee,mois+1,jour);
		
		/* calendar.set(Calendar.YEAR, annee);
		calendar.set(Calendar.MONTH, mois+1);
		calendar.set(Calendar.DAY, jour);
		 */
			
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
