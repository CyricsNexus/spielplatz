public class FilmTestlauf {

	public static void main(String[] args) {
		
	/************************************************************************
	 *	Objekte in einem Array erzeugen
	 ************************************************************************
	 *	Objekte der Klasse Film können in einen Array eingefügt werden
	 *	Dadurch kann man auf Objektnamen verzichten
	 *	Sie lassen sich durch den Index des Arrays ansprechen
	 *
	 *************************************************************************/		

		int anzFilmeErstellen = 2;		// 2 Filme erstellen
		
		Filme [] meineFilme = new Filme[anzFilmeErstellen];	// Filme werden hier durch Konstruktor ohne Parameter erzeugt
		for (int i = 0; i < anzFilmeErstellen; i++) {
			meineFilme[i] = new Filme();
		}

	/************************************************************************
	 *	Setter müssen genutzt werden, um Instanzvariablen Titel und Genre nachträglich zu füllen
	 ************************************************************************/
		
		meineFilme[0].setTitel("Vier Deadlines und ein Todesfall");
		meineFilme[0].setGenre("Drama");

		meineFilme[1].setTitel("Zwei Variablen trumpfen auf");
		// meineFilme[1].setGenre("Komödie");

	/************************************************************************
	 *	Methoden der Klasse können auch bei Arrays ganz normal aufgerufen werden
	 *	Der Film mit dem Index 1 hat kein Genre erhalten und hat damit noch den Wert null
	 ************************************************************************/
		
		for (int i = 0; i < anzFilmeErstellen; i++) {
			meineFilme[i].vorfuehren();
		}

	/************************************************************************
	 *	Hier wird der Konstruktor mit Parametern aufgerufen
	 *	Dadurch können Fehler vermieden werden
	 ************************************************************************/

		Filme neuerFilm = new Filme("Ohne Proto geht der Cheffe nie ins Bett","Komödie");
		
	/************************************************************************
	 *	Über Getter können die Instanzvariablen der jeweilgen Objekte abgerufen werden.
	 *	Im Gegensatz zu der Methode vorführen() in der Klasse Filme, ist dieses Standard. 
	 ************************************************************************/
	
		System.out.printf("Titel: %s, Genre: %s - Anzahl Filme: %d%n", neuerFilm.getTitel(), neuerFilm.getGenre(), neuerFilm.getNr());

	}
}
