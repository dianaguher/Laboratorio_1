import carro.Carro;
import carro.Suv;
import carro.Sedan;
import avion.Jet;
import avion.Avioneta;

public class Test {
	private void ejecutarCarro() {
		Carro carro = new Suv();
		carro.imprimir();
        
		carro = new Sedan();
        carro.imprimir();
	}
	
	private static void ejecutarAvion() {
		Aeropuerto aeropuerto = new Aeropuerto(new Jet());
		aeropuerto.takeOff();
		
	    aeropuerto = new Aeropuerto(new Avioneta());
		aeropuerto.takeOff();
	}
	
	public static void main(String[] args) {
		new Test().ejecutarCarro();
		ejecutarAvion();
	}

}
