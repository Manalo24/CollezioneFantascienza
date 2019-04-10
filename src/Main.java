import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Collezione c = new Collezione();
		int position;
		//boolean choice;
		int pick;
		String cercaTit;
		String cercaAut;
		String copertina;
		String stato;
		int numPagine;
		String tipo;
		String formato;
		long dimensione;
		String supporto;
		int scelta = 1;
		int anno;
		int mese;
		int giorno;
		String autore;
		String titolo;
		String editore;
		LocalDate annoPub;
		while (scelta != 0) {
			System.out.println("1)Inserire un romanzo");
			System.out.println("2)Rimuovere un romanzo");
			System.out.println("3)Ricerca romanzo per titolo");
			System.out.println("4)Ricerca romanzo di un dato autore ");
			System.out.println("5)Ricerca romanzi per data di pubblicazione");
			System.out.println("6)Filtri");
			System.out.println("Scegli dal menu:");
			scelta = sc.nextInt();
			sc.nextLine();
			switch (scelta) {
			case 0:
				System.out.println("Arrivederci");
				break;
			case 1:
				System.out.println("Inserire autore del romanzo");
				autore = sc.nextLine();
				System.out.println("Inserire titolo");
				titolo = sc.nextLine();
				System.out.println("Inserire editore");
				editore = sc.nextLine();
				System.out.println("Inserire anno poi mese poi giorno");
				anno = sc.nextInt();
				mese = sc.nextInt();
				giorno = sc.nextInt();
				sc.nextLine();
				System.out.println("Il romanzo è digitale o cartaceo?");
				tipo = sc.nextLine();
				if (tipo.equalsIgnoreCase("digitale")) {
					System.out.println("Inserire formato");
					formato = sc.nextLine();
					System.out.println("Inserire dimensione in byte");
					dimensione = sc.nextLong();
					sc.nextLine();
					System.out.println("Inserire supporto");
					supporto = sc.nextLine();
					Romanzo dig = new Digitale(autore, titolo, editore, LocalDate.of(anno, mese, giorno), formato,
							dimensione, supporto);
					c.aggiungiLibro(dig);
				} else {
					System.out.println("Inserire tipologia di copertina Rigida o Molle");
					copertina = sc.nextLine();
					System.out.println("Inserire stato del romanzo");
					stato = sc.nextLine();
					System.out.println("Inserire num di pagine");
					numPagine = sc.nextInt();
					sc.nextLine();
					Romanzo cart = new Cartaceo(autore, titolo, editore, LocalDate.of(anno, mese, giorno), copertina,
							stato, numPagine);
					c.aggiungiLibro(cart);
				}
				System.out.println("Romanzo aggiunto");
				break;
			case 2:
				System.out.println("Ecco la lista dei romanzi");
				for (int i = 0; i < c.collection.size(); i++) {
					System.out.println(i + ") " + c.collection.get(i));
				}
				System.out.println("Inserire il numero del romanzo che vuoi togliere");
				position = sc.nextInt();
				sc.nextLine();
				c.rimuoviLibro(position);
				System.out.println("Romanzo tolto dalla lista");
				break;
			case 3:
				System.out.println("Inserisci titolo del romanzo che vuole cercare");
				cercaTit = sc.nextLine();
				c.ricercaRomanzo(cercaTit);
				break;
			case 4:
				System.out.println("Inserisci nome del autore che vuole cercare");
				cercaAut = sc.nextLine();
				c.ricercaAutore(cercaAut);
				break;
			case 5:
				System.out.println("Inserire anno poi mese poi giorno");
				anno = sc.nextInt();
				mese = sc.nextInt();
				giorno = sc.nextInt();
				sc.nextLine();
				annoPub=LocalDate.of(anno, mese, giorno);
				System.out.println("inserire 1 se vuole romanzi prima della data inserita altrimenti 2");
				pick=sc.nextInt();
				sc.hasNextLine();
				/*if (pick==1) {
					choice=true;
				} else {
					choice=false;
				}*/
				c.ricercaData(annoPub, pick);
				break;
			case 6:
				System.out.println("Inserire nome del autore che vuole cercare");
				autore=sc.nextLine();
				System.out.println("Inserire Cartaceo o Digitale");
				tipo=sc.nextLine();
				c.filtri(autore, tipo);
			}
		}
		// Romanzo r = new Romanzo(null, null, null, 0);
		// c.collection.add(r);
		// c.collection.add(r);
		// System.out.println(c.collection.get(0));
		// System.out.println(c.collection.toString());
		/*
		 * for(Romanzo re : c.collection) { System.out.println(re); }
		 */
	}

}

