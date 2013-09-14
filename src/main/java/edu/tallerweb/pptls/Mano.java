package edu.tallerweb.pptls;


public class Mano {
	
    private final Integer forma;
    private int resultadoJuego;
    private final int tablaResultado[][] = {{0,1,1,2,2},
			                                {2,0,1,1,2},
			                                {2,2,0,1,1},
			                                {1,2,2,0,1},
			                                {1,1,2,2,0}};
	public Mano( final Forma forma) {
		this.forma=forma.getValor();
	}
	
	public Resultado jugarCon(final Mano otra) {
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
