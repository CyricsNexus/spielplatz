
public class Filme {

/************************************************************************
 *	Deklaration Variablen mit Initialisierung 	
 ***********************************************************************/
	
	private String titel;				// Instanzvariable
	private String genre;				// Instanzvariable
	static private int laufendeNr = 0;	// Klassenvariable
	
/************************************************************************
 *	Konstruktoren 	
 ************************************************************************
 *  Es existieren zwei Konstruktoren, um einen Film zu erstellen
 *
 *  #1 ist ohne Parameter und erzeugt einen Film ohne Titel und ohne Genre
 *	hier müssen die Parameter später durch Setter hinzugefügt werden
 *
 *  #2 benötigt sowohl den Parameter Titel und Genre, um genutzt zu werden
 *  	diese benötigen keine nachträglichen Setter
 *  
 *  Zusatzinfo: In Java müssen eigentlich keine Konstruktoren erstellt werden,
 *  	Java erzeugt diese automatisch.
 *      Es sei denn, man möchte einen Konstruktor mit Parametern haben.
 *      
 *      Möchte man beide Sorten von Konstruktoren erzeugen (leer und mit Parametern),  
 *      muss ebenfalls ein leerer Konstruktor erzeugt werden.
 *  	
 ***********************************************************************/	
	//Konstruktoren - Ohne Parameter
	public Filme() {
		laufendeNr++;			// Da es eine Klassenvariable ist, wird diese nicht dem Objekt zugeordnet
						// sie ist ähnlich wie eine globale Variable
						// Mit jedem neu erzeugten Film wird diese hochgezählt und ergibt denselben
						// Wert, unabhängig, durch welches Filme-Objekt sie aufgerufen wird
	}
	
	//Konstruktor - Mit Parameter Titel und Genre
	public Filme(String titel, String genre) {
		this.titel = titel;
		this.genre = genre;
		laufendeNr++;	// Jeder neu erzeugte Objekt erhöht die Filmanzahl
	}	

	
/************************************************************************
 *	Getter und Setter 	
 ***********************************************************************/	
	public String getTitel() {			// Gibt den Titel des Objekts in einer anderen Klasse zurück
		return titel;
	}
	
	public void setTitel(String titel) {		// Legt den Titel des Objekts fest
		this.titel = titel;
	}

	public String getGenre() {			// Gibt das Genre des Objekts in einer anderen Klasse zurück
		return genre;
	}
	
	public void setGenre(String genre) {		// Legt das Genre des Objekts fest
		this.genre = genre;
	}
	
	public int getNr() {				// Gibt aus, wie viele Filme bislang erzeugt worden sind
		return laufendeNr;
	}
	
/************************************************************************
 *	Eine Methode, um alles auszugeben
 ************************************************************************
 *	Instanzvariablen können direkt genutzt werden
 *
 *  Innerhalb der Klasse können die privaten Instanz- und Klassenvariablen 
 *  direkt genutzt werden
 *   
 ***********************************************************************/	
	
	//printf benötigt Java 8
	public void vorfuehren() {
		System.out.printf("Titel: %s, Genre: %s - Anzahl Filme: %d%n", titel, genre, laufendeNr);
	}	
	

}
