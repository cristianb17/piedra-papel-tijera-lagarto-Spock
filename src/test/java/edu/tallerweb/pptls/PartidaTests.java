package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	//Tests donde el jugador 1 siempre gana
	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Tijera Corta Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel Cubre Piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Piedra aplasta lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto Envenena Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queSpockDestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock Destroza Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Tijera Decapita Lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto Come Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Papel Refuta Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra Aplasta Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	//Tests donde todos empatan
	@Test
	public void quePiedraEmpataConPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra Empata Piedra",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockEmpataConSpock() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock Empata Spock",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoEmpataConLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto Empata Lagarto",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelEmpataConPapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel Empata Papel",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraEmpataConTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera Empata Tijera",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	//Tests donde jugador 1 siempre pierde
	
	@Test
	public void queLagartoIntentaComerPiedra() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Lagarto Intenta Comer Piedra",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queLagartoIntentaComerTijera() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Lagarto Intenta Comer Tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockIntentaVaporizarLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock Intenta Vaporizar Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockIntentaVaporizarPapel() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Spock Intenta Vaporizar Papel",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraIntentaGolpearSpock() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Piedra Intenta Golpear Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePiedraIntentaGolpearPapel() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Piedra Intenta Golpear Papel",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelIntentaEnvolverLagarto() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Papel Intenta Envolver Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelIntentaEnvolverTijera() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Papel Intenta Envolver Tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraIntentaCortarSpock() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Tijera Intenta Cortar Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraIntentaCortarPiedra() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Tijera Intenta Cortar Piedra",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSePuedeInstanciarMano() {
		Mano jugadorUno = new Mano(Forma.TIJERA);
		assertFalse(jugadorUno.equals(null));
	}
	
	@Test
	public void queSePuedeJugar() {
		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		
		assertFalse(jugadorUno.jugarCon(jugadorDos).equals(null));
	}
	
}
