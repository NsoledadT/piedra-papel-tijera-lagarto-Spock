package edu.tallerweb.pptls;


public class Mano{
	
    private final Integer forma;
    private int variable;
    private final int tablaResultado[][] = {{0,1,1,2,2},
    	                                    {2,0,1,1,2},
                                            {2,2,0,1,1},   
                                            {1,2,2,0,1},  
                                            {1,1,2,2,0}};
    
    private final Resultado Vector[] = {Resultado.EMPATA,Resultado.PIERDE,Resultado.GANA};
	
    public Mano( final Forma forma){
		this.forma = forma.getValor();
	  }
	
    public Resultado jugarCon(final Mano otra){
    variable=tablaResultado[this.forma][otra.forma];
    return Vector[variable];
	   
	  }
}
	
