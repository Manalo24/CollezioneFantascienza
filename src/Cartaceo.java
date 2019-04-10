import java.time.LocalDate;

public class Cartaceo extends Romanzo{
	private String copertina;
	private String stato;
	private int numPagine;
	public Cartaceo(String autore, String titolo, String editore, LocalDate annoPub, String copertina, String stato,
			int numPagine) {
		super(autore, titolo, editore, annoPub);
		this.copertina = copertina;
		this.stato = stato;
		this.numPagine = numPagine;
	}
	public String getCopertina() {
		return copertina;
	}
	public String getStato() {
		return stato;
	}
	public int getNumPagine() {
		return numPagine;
	}
	@Override
	public String toString() {
		return super.toString() +" [copertina=" + copertina + ", stato=" + stato + ", numPagine=" + numPagine + "]";
	}
	
}
