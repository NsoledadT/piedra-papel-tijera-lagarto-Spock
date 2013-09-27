package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */

public class Mano {
	
/**
 * Toda Mano debe crearse con una forma dada, que será
 * la que determine su condición en el juego.
 * @param forma, la Forma que adopta la Mano.
 */
	
    private final Integer forma;
    
    private int variable;
    
    private final Resultado resultado[] = {Resultado.EMPATA, Resultado.PIERDE, Resultado.GANA};
    
    private final int tablaResultado[][] = {{0, 1, 1, 2, 2},
    		                                {2, 0, 1, 1, 2},
    		                                {2, 2, 0, 1, 1},
    		                                {1, 2, 2, 0, 1},
    		                                {1, 1, 2, 2, 0}};
    
    public Mano(final Forma forma) {
		this.forma = forma.getValor();
	  }
	
    public Resultado jugarCon(final Mano otra) {
    	
/**
  * Evaluará el resultado de la partida según las reglas
  * del juego.
  * @param otra, la otra Mano.
  * @return un Resultado, de acuerdo al estado del juego.
  */
        variable = tablaResultado[this.forma][otra.forma];
         return resultado[variable];
	  }
    
}