package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

    private final Integer forma;
    private int variable;
    private final Resultado [] resultado = {Resultado.EMPATA, Resultado.PIERDE, Resultado.GANA};
    private final int [][] tablaResultado = {{0, 1, 1, 2, 2},
    		                                {2, 0, 1, 1, 2},
    		                                {2, 2, 0, 1, 1},
    		                                {1, 2, 2, 0, 1},
    		                                {1, 1, 2, 2, 0}};
    public Mano(final Forma forma) {
		this.forma = forma.getValor();
	  }

    public Resultado jugarCon(final Mano otra) {
        variable = tablaResultado[this.forma][otra.forma];
         return resultado[variable];
	  }
}