package edu.tallerweb.pptls;

import java.util.HashMap;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma forma;
	private static HashMap<String, Enum> reglasDelJuego;
	//me ejecuta el metodo para cargar las reglas antes que hacer cualquier otra cosa.
	static {
		cargarReglasDelJuego();
    }

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Resultado resultadoObtenidoDespuesDeJugar = (Resultado) reglasDelJuego.get(this.forma.getValor()
																		  + "VS" + otra.forma.getValor());
		return resultadoObtenidoDespuesDeJugar;
	}
	
	//metodo utilizado para cargar las reglas del juego
	private static void cargarReglasDelJuego(){
		
		reglasDelJuego = new HashMap<String, Enum>();
		
		reglasDelJuego.put(Forma.LAGARTO.getValor() + "VS" + Forma.LAGARTO.getValor(), Resultado.EMPATA);
		reglasDelJuego.put(Forma.LAGARTO.getValor() + "VS" + Forma.SPOCK.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.LAGARTO.getValor() + "VS" + Forma.PAPEL.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.LAGARTO.getValor() + "VS" + Forma.PIEDRA.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.LAGARTO.getValor() + "VS" + Forma.TIJERA.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.SPOCK.getValor() + "VS" + Forma.SPOCK.getValor(), Resultado.EMPATA);
		reglasDelJuego.put(Forma.SPOCK.getValor() + "VS" + Forma.PIEDRA.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.SPOCK.getValor() + "VS" + Forma.TIJERA.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.SPOCK.getValor() + "VS" + Forma.LAGARTO.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.SPOCK.getValor() + "VS" + Forma.PAPEL.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.PAPEL.getValor() + "VS" + Forma.PAPEL.getValor(), Resultado.EMPATA);
		reglasDelJuego.put(Forma.PAPEL.getValor() + "VS" + Forma.SPOCK.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.PAPEL.getValor() + "VS" + Forma.PIEDRA.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.PAPEL.getValor() + "VS" + Forma.LAGARTO.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.PAPEL.getValor() + "VS" + Forma.TIJERA.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.TIJERA.getValor() + "VS" + Forma.TIJERA.getValor(), Resultado.EMPATA);
		reglasDelJuego.put(Forma.TIJERA.getValor() + "VS" + Forma.LAGARTO.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.TIJERA.getValor() + "VS" + Forma.PAPEL.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.TIJERA.getValor() + "VS" + Forma.PIEDRA.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.TIJERA.getValor() + "VS" + Forma.SPOCK.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.PIEDRA.getValor() + "VS" + Forma.PIEDRA.getValor(), Resultado.EMPATA);
		reglasDelJuego.put(Forma.PIEDRA.getValor() + "VS" + Forma.LAGARTO.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.PIEDRA.getValor() + "VS" + Forma.TIJERA.getValor(), Resultado.GANA);
		reglasDelJuego.put(Forma.PIEDRA.getValor() + "VS" + Forma.PAPEL.getValor(), Resultado.PIERDE);
		reglasDelJuego.put(Forma.PIEDRA.getValor() + "VS" + Forma.SPOCK.getValor(), Resultado.PIERDE);
	}

}
