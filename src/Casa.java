
public class Casa {
	
	//En esta clase voy a realizar el condicional para
	// recomendar el número de ventanas según los metros
	// deendiendo del área de las paredes
 
	
	
	//Cálculo del presupuesto
	int ventanas;
	int precio;
	String instalacion ;
	
	int presupuesto(int vent, int prec, String inst) {
		int presupuesto = 0;
		
		ventanas=vent;
		precio=prec=25;
		instalacion=inst;
		//inst=instalacion;
		presupuesto = ventanas*precio;
		
	
		return presupuesto;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	//Cálculo de recomendación de ventanas con condicional else if
	
	int ventanas(int metros, String presup)
		{
	
	
		
			if (metros>0 && metros<=10)
				{
				ventanas = 1;
			 	System.out.println("Se recomiendan las siguientes ventanas:");
				}
			
			 else if (metros>10 && metros<20)
			    {
				    ventanas = 3;
				 	System.out.println("Se recomiendan las siguientes ventanas:");
				}
			
	        else if (metros>=20 && metros<=30)
			    {
				    ventanas = 5;
				 	System.out.println("Se recomiendan las siguientes ventanas:");
				}

			else if (metros>30 && metros<=40)
				{
					ventanas = 8;
					System.out.println("Se recomiendan las siguientes ventanas:");
				}
			
			else if (metros>40 && metros<=50)
				{
					ventanas = 10;
					System.out.println("Se recomiendan las siguientes ventanas:");
				}	
				
			else if (metros>50 && metros<=60)
				{
					ventanas = 12;
					System.out.println("Se recomiendan las siguientes ventanas:");
				}	
			
			else if (metros>60 && metros<=70)
				{
					ventanas = 14;
					System.out.println("Se recomiendan las siguientes ventanas:");
				}	
			
			else
				{
					System.out.println("No es posible la recomendación para medidas tan altas");
				}
			
	return ventanas;
			
	
		}
	
	
	
	
	
	
	
	
	
	
	
}

	