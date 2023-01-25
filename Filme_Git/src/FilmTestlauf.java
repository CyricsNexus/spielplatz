import java.util.Scanner;  


public class FilmTestlauf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie viele Filme?");
		int eingabe = sc.nextInt();
		
		Filme [] meineFilme = new Filme[eingabe];
		for (int i = 0; i<eingabe;i++) {
			meineFilme[i] = new Filme();
		}
		
		meineFilme[0].titel = "Vier Deadlines und ein Todesfall";
		meineFilme[0].genre = "Drama";

		meineFilme[1].titel = "Zwei Variablen trumpfen auf";
		meineFilme[1].genre = "Komödie";
		
		meineFilme[2].titel = "Die Hölle des gelben Königs";
		meineFilme[2].genre = "Horror";

		for (int i = 0; i<eingabe;i++) {
			meineFilme[i].vorführen();
		}

		
		
		sc.close();

	}
}
