package ar.curso.cda;

import java.util.ArrayList;


public class MazoDeCartas {
	
	private ArrayList<Carta> miMazo = new ArrayList<Carta>();
	Carta carta = new Carta(1,"basto");
	
	public void agregarCartas() {
		this.miMazo.add(carta);
		System.out.println(miMazo);
	}
	
	
	

}
