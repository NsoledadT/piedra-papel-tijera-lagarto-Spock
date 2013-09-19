package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza Piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}
		@Test
		public void queTijeraDecapitaLagarto() {
		
		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

			assertEquals("Tijera Decapita Lagarto",
					Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	
     }
		
		@Test
		public void quePapelEnvuelvePapel() {
		
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

			assertEquals("Papel Envuelve Papel",
					Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	
     }

}
