import java.util.GregorianCalendar;

public class Session {

	private GregorianCalendar dateDebut;
	private GregorianCalendar dateFin;
	
	public static GregorianCalendar definirDate(int jour, int mois, int annee){
		
		GregorianCalendar calendar = new GregorianCalendar();	
		calendar.set(annee,mois+1,jour);
		return(calendar);
			
		}
	

	public GregorianCalendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(GregorianCalendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public GregorianCalendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(GregorianCalendar dateFin) {
		this.dateFin = dateFin;
	}

	public Session (GregorianCalendar dateDebut, GregorianCalendar dateFin) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;		
	}
}
