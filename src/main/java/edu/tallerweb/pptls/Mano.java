package edu.tallerweb.pptls;


public class Mano{
	
    private final Integer forma;
    private Resultado tablaResultado[][]={{Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA, Resultado.GANA},
			                              {Resultado.GANA, Resultado.EMPATA,Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA},
			                              {Resultado.GANA, Resultado.GANA,Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE},
			                              {Resultado.PIERDE, Resultado.GANA,Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE},
			                              {Resultado.PIERDE, Resultado.PIERDE,Resultado.GANA, Resultado.GANA, Resultado.EMPATA}};
	public Mano( final Forma forma){
		this.forma = forma.getValor();
	  }
	
	public Resultado jugarCon(final Mano otra){
	    return tablaResultado[this.forma][otra.forma];
	  }
}
	

