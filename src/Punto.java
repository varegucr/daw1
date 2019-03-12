
public class Punto {
	//Atributos
	private double x;
	private double y;
	
	//Constructor parametros
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Constructor vacio
	public Punto () {
		x = 2.2;
		y = 1.8;
	}
	//Getters
	public double getX () {
		return x;
	}
	public double getY () {
		return y;
	}
	//Metodos
	public double calcularDistanciaDesde (Punto punto) {
		double cateto1 = this.x - punto.getX();
		double cateto2 = this.y - punto.getY();
		double distancia = Math.sqrt(cateto1*cateto1 + cateto2 * cateto2);
		return distancia;
	}
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
