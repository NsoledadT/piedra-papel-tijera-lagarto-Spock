package edu.tallerweb.pptls;


/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	
    private  Integer forma;
    private String resultadoJuego;
    private final String tablaResultado[][] = {{"EMPATE","PIERDE","PIERDE","GANA","GANA"},
			                                   {"GANA","EMPATE","PIERDE","PIERDE","GANA"},
			                                   {"GANA","GANA","EMPATE","PIERDE","PIERDE"},
			                                   {"PIERDE","GANA","GANA","EMPATE","PIERDE"},
			                                   {"PIERDE","PIERDE","GANA","GANA","EMPATE"}};
	public Mano( Forma forma) {
		this.forma=forma.getValor();
	}
	
	public Resultado jugarCon(Mano otra) {
	   resultadoJuego = tablaResultado[this.forma][otra.forma];
	   if(resultadoJuego == "GANA"){
		     return Resultado.GANA;
	    }
	   else{
	      if(resultadoJuego == "PIERDE"){
			 return Resultado.PIERDE;
			    }
	    
	      else{
	    	 return Resultado.EMPATA;
	 		    }
	    }
	 }
	
}
