import java.util.Scanner;  


public class FilmTestlauf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie viele Filme? (max. 3)");
		int eingabe = sc.nextInt();
		
		if (eingabe > 3) {
			Filme [] meineFilme = new Filme[eingabe];
			for (int i = 0; i<eingabe;i++) {
				meineFilme[i] = new Filme();
			}

			meineFilme[0].titel = "Vier Deadlines und ein Todesfall";
			meineFilme[0].genre = "Drama";

			meineFilme[1].titel = "Zwei Variablen trumpfen auf";
			meineFilme[1].genre = "Komoedie";

			meineFilme[2].titel = "Die Hoelle des gelben Koenigs";
			meineFilme[2].genre = "Horror";

			for (int i = 0; i<eingabe;i++) {
				meineFilme[i].vorfuehren();
			}
		} else {
			System.out.print("Das kann doch keiner an einem Abend sehen.");
		}
		
		sc.close();

	}
}
