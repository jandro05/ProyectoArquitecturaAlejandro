
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esta es la clase principal de mi proyecto de arquitectura
		//para la asignatura de tic2
		//Aquí se incluye el funcionamiento y los datos
		
		
		
		
		//Para introduccir los datos no debemos
		// tener en cuenta las paredes que estan pegadas a otra casa
		// ya que no podemos poner una ventana en esa pared
		// por ello al introduccir sus medidas tendremos que poner 0
		
		
		
		
		//ENTRADA DE DATOS
		
		EntradaDatos ed= new EntradaDatos();
		
		int metrosfachada = ed.metrosfachada();
		int metrosparedlateral = ed.metrosparedlateral();
		int metrosparedlateral2 = ed.metrosparedlateral2();	
		int metrosparedtrasera = ed.metrosparedtrasera();
		int metros = (metrosfachada+metrosparedlateral+metrosparedlateral2+metrosparedtrasera);
		int precio=25;
		int manodeobra=100;
		
		
		
		//PROCESAMIENTO DE LOS DATOS
		
		System.out.println("El área total de paredes exteriores son "+metros+" metros cuadrados");
		
		
		String tipoventana = ed.tipoventana();
		System.out.println(tipoventana);
		
		
		Casa c1 = new Casa();
	    int ventanas = c1.ventanas(metros, tipoventana);
		System.out.println(ventanas);
		
		
		int presupuesto = c1.presupuesto(ventanas, precio, tipoventana);
		System.out.println("El precio total de las ventanas es de "+presupuesto+ " euros");
		
		
		
		String precioinstalacion= ed.precioinstalacion();
		System.out.println(precioinstalacion);
		System.out.println("Si has seleccionado la instalación el precio sera de "+(presupuesto+manodeobra) + " euros, si no lo has seleccionado el precio es de "+presupuesto+ " euros");
		
		
		
		
	}

}
		