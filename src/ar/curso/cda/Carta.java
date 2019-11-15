package ar.curso.cda;


public class Carta {
	
	private Integer numero;
	private String palo;

	public Carta(Integer numero, String palo) {
		this.numero= numero;
		this.palo = palo;
		
	}
	
	public Integer validarNumerosPosibles(Integer numero) {
		Integer recuperarNumero = 0;
	if(numero>=1 && numero<=12) {
			recuperarNumero= numero;
		}else { 
		System.out.println("No se puede ingresar");
	}return numero;
	

}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
}