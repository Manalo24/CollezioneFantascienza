import java.time.LocalDate;

public class Romanzo {
	private String autore;
	private String titolo;
	private String editore;
	private LocalDate annoPub;
	public Romanzo(String autore, String titolo, String editore, LocalDate annoPub) {
	
		this.autore = autore;
		this.titolo = titolo;
		this.editore = editore;
		this.annoPub = annoPub;
	}
	public String getAutore() {
		return autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getEditore() {
		return editore;
	}
	public LocalDate getAnnoPub() {
		return annoPub;
	}
	@Override
	public String toString() {
		return "Romanzo [autore=" + autore + ", titolo=" + titolo + ", editore=" + editore + ", annoPub=" + annoPub
				+ "]";
	}
	
}
