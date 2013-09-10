package edu.tallerweb.pptls;


/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	
    private  Integer forma;
    private int resultadoJuego;
    private final int tablaResultado[][] = {{0,1,1,2,2},
			                                {2,0,1,1,2},
			                                {2,2,0,1,1},
			                                {1,2,2,0,1},
			                                {1,1,2,2,0}};
	public Mano( Forma forma) {
		this.forma=forma.getValor();
	}
	
	public Resultado jugarCon(Mano otra) {
	   resultadoJuego = tablaResultado[this.forma][otra.forma];
	   if(resultadoJuego == 2){
		     return Resultado.GANA;
	    }
	   else{
	      if(resultadoJuego == 1){
			 return Resultado.PIERDE;
			    }
	    
	      else{
	    	 return Resultado.EMPATA;
	 		    }
	    }
	 }
	
}
