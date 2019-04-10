import java.time.LocalDate;

public class Digitale extends Romanzo{
	private String formato;
	private long dimensione;
	private String supporto;
	public Digitale(String autore, String titolo, String editore, LocalDate annoPub, String formato, long dimensione,
			String supporto) {
		super(autore, titolo, editore, annoPub);
		this.formato = formato;
		this.dimensione = dimensione;
		this.supporto = supporto;
	}
	public String getFormato() {
		return formato;
	}
	public long getDimensione() {
		return dimensione;
	}
	public String getSupporto() {
		return supporto;
	}
	@Override
	public String toString() {
		return super.toString()+ " [formato=" + formato + ", dimensione=" + dimensione + ", supporto=" + supporto + "]";
	}
	

}
