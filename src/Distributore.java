
public class Distributore {

	private String citta;
	private String propietario;
	private int capacita;
	private int benzina;
	private int prezzo;
	
	
	
	public Distributore(String citta, String propietario, int capacita, int benzina, int prezzo) {
		this.citta = citta;
		this.propietario = propietario;
		this.capacita = capacita;
		this.benzina = benzina;
		this.prezzo=prezzo;
	}



	/**
	 * @return the citta
	 */
	public String getCitta() {
		return citta;
	}



	/**
	 * @param citta the citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}



	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}



	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}



	/**
	 * @return the capacita
	 */
	public int getCapacita() {
		return capacita;
	}



	/**
	 * @param capacita the capacita to set
	 */
	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}



	/**
	 * @return the benzina
	 */
	public int getBenzina() {
		return benzina;
	}



	/**
	 * @param benzina the benzina to set
	 */
	public void setBenzina(int benzina) {
		this.benzina = benzina;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Distributore [citta=" + citta + ", propietario=" + propietario + ", capacita=" + capacita + ", benzina="
				+ benzina + "]";
	}
	
	public void erogazione(int benzina) {
		int incasso;
		incasso=this.prezzo*this.benzina;
		System.out.println("E' stato inserito " + benzina + "l al prezzo di " + incasso);
	}



	/**
	 * @return the prezzo
	 */
	public int getPrezzo() {
		return prezzo;
	}



	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


	
}
