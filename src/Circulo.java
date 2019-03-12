
public class Circulo {
	//Atributos
	private Punto centro;
	private double radio;
	
	//Constructor parametros
	public Circulo (Punto centro,double radio) {
		this.centro = new Punto ();
		this.radio = radio;
	}
	//constructor vacio
	public Circulo () {
		centro = new Punto (3.3,1.1);
		radio = 2.6;
	}
	//constructor tres parametros
	public Circulo (double x, double y, double radio) {
		this.centro = new Punto (x,y);
		this.radio = radio;
	}
	public Punto getCentro() {
		return centro;
	}
	public double getRadio() {
		return radio;
	}
	//metodos 
	public double calcularDistanciaDesde (Punto punto) {
		return centro.calcularDistanciaDesde(punto);
	}
	public double calcularArea () {
		return Math.PI * radio * radio; 
	}
	public double calcularPerimetro () {
		return 2 * Math.PI * radio;
	}
	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
}
