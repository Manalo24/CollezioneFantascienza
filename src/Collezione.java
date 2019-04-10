import java.time.LocalDate;
import java.util.*;

public class Collezione {
	List<Romanzo> collection = new ArrayList<Romanzo>(10);
	private int i = 0;
	List<Romanzo> fcol = new ArrayList<Romanzo>(10);

	public void aggiungiLibro(Romanzo r) {
		if (i < 10) {
			collection.add(r);
		} else {
			System.out.println("Collezione piena!");
		}
	}

	public void rimuoviLibro(int posizione) {
		collection.remove(posizione);
	}

	public void ricercaRomanzo(String nome) {
		int pervedere = 0;
		for (int j = 0; j < collection.size(); j++) {
			if (collection.get(j).getTitolo().equalsIgnoreCase(nome)) {
				System.out.println("Questo è il romanzo cercato:" + collection.get(j));
				pervedere = 1;
			}
		}
		if (pervedere == 0) {
			System.out.println("il romanzo cercato non esiste nella collezione");
		}
	}

	public void ricercaAutore(String author) {
		int pervedere = 0;
		System.out.println("Ecco i romanzi di " + author + " :");
		for (int k = 0; k < collection.size(); k++) {
			if (collection.get(k).getAutore().equalsIgnoreCase(author)) {
				System.out.println(k + ") " + collection.get(k));
				pervedere = 1;
			}
		}
		if (pervedere == 0) {
			System.out.println("L'autore cercato non esiste nella collezione");
		}
	}

	public void ricercaData(LocalDate data, int prima) {
		if (prima == 2) {
			for (int y = 0; y < collection.size(); y++) {
				if (collection.get(y).getAnnoPub().compareTo(data) > 0) {
					System.out.println(collection.get(y));
				} else {
					System.out.println("");
				}
			}

		} if(prima == 1) {
			for (int y = 0; y < collection.size(); y++) {
				if (collection.get(y).getAnnoPub().compareTo(data) < 0) {
					System.out.println(collection.get(y));
				}
			}
		}
	}

	public void filtri(String autore, String format) {
		for (int p = 0; p < collection.size(); p++) {
			if (collection.get(p).getAutore().equalsIgnoreCase(autore)) {
				fcol.add(collection.get(p));
			}
		}
		for (int q = 0; q < collection.size(); q++) {
			if (format.equalsIgnoreCase("digitale")) {
				if (fcol.get(q) instanceof Digitale) {
					System.out.println(fcol.get(q));
				}
			} else if (format.equalsIgnoreCase("cartaceo")) {
				if (fcol.get(q) instanceof Cartaceo) {
					System.out.println(fcol.get(q));
				}
			}
		}
		fcol.clear();
	}

}
