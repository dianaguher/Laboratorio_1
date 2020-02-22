package carro;

public abstract class Carro {
	public abstract String tipo();
	public final void imprimir() {
		System.out.println("YO SOY UN TIPO DE CARRO: " + tipo());
	}
}
