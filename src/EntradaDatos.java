import java.util.Scanner;

public class EntradaDatos {

	
	//Medidas de las paredes
	
	int metrosfachada()  {
	
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros de fachada");
		int a;
		a = n1.nextInt();
		return a;	
	
	}
	
	int metrosparedlateral()  {
	
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros de la otra pared lateral");
		int a;
		a = n1.nextInt();
		return a;	
	
	}
	
	int metrosparedlateral2()  {
		
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros de una pared lateral");
		int a;
		a = n1.nextInt();
		return a;	
	
	}
	
	int metrosparedtrasera()  {
		
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros de una pared trasera");
		int a;
		a = n1.nextInt();
		return a;	
	
	}
	

	
	
	
	//Selección del tipo de ventana
	
	int ventanas;
	
	
	String tipoventana() {
		Scanner n1 = new Scanner(System.in);
	    System.out.println("Introducir el tipo de ventana" 
	    		+ "\n"+"1:  0,5m x 0,5m"	
	    		+ "\n"+"2:  0,75m x 0,75m"	
	    		+ "\n"+"3:  1m x 1m");
	    					
		
		String tipoventana;
		int selector;
		selector = n1.nextInt();
		
		
		switch(selector) {
		case 1: tipoventana="Has seleccionado el siguiente modelo: 0,5m x 0,5m"
				+"\n" + "El precio de cada ventana son 25 euros";
				
			return tipoventana;
			
			
		case 2: tipoventana="0,75m x 0,75m"
				+"\n" + "El precio de cada ventana son 25 euros";
			return tipoventana;
			
			
		case 3: tipoventana="1m x 1m"
				+"\n" + "El precio de cada ventana son 25 euros";
			return tipoventana;
			
			
		default: return "Este tipo de ventana no esta disponible";	
		
		
		}
	
			
	}
	
	
	
	//Precio para la instalación de las ventanas o no
	
		String precioinstalacion() {
			
			Scanner n2 = new Scanner(System.in);
			System.out.println("¿Desea usted la instalación de las ventanas? (conteste 1 o 2) "
					+ "\n"+ "1: Si"
					+ "\n"+ "2: No");
					
			String precioinstalacion;
			int selector;
			selector = n2.nextInt();
			
			switch(selector) {
		case 1: precioinstalacion="Al precio de las ventanas se le sumaán 100 euros por mano de obra";
				
			return precioinstalacion;
			
			
		case 2: precioinstalacion="El precio final es el precio de las ventanas";
			return precioinstalacion;
			
			
		default: return "Respuesta no reconocida";	
		
			
		}
		
		
	}
	

}
	
