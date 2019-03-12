
public class Triangulo {
	//Atributos
	private Punto p1;
	private Punto p2;
	private Punto p3;
	
	//Constructor tres parametros
	public Triangulo (Punto p1,Punto p2,Punto p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	//Constructor vacio
	public Triangulo () {
		p1 = new Punto (2.4,4.8);
		p2 = new Punto (3.6,5.2);
		p3 = new Punto (4.2,6.3);
	}
	//Constructor 6 param.
	public Triangulo (double x1, double y1, double x2, double y2, double x3, double y3) {
		p1 = new Punto (x1,y1);
		p2 = new Punto (x2,y2);
		p3 = new Punto (x3,y3);
	}
	public Punto getP1() {
		return p1;
	}
	public Punto getP2() {
		return p2;
	}
	public Punto getP3() {
		return p3;
	}
	//Metodo
	public double calcularDistanciaDesde (Punto punto) {
		return p1.calcularDistanciaDesde(punto);
	}
	public double calcularArea () {
		double l1 = p1.calcularDistanciaDesde(getP2());
		double l2 = p1.calcularDistanciaDesde(getP3());
		return (l1 * l2) / 2;
	}
	public double calcularPerimetro () {
		double l1 = p1.calcularDistanciaDesde(getP2());
		double l2 = p2.calcularDistanciaDesde(getP3());
		double l3 = p3.calcularDistanciaDesde(getP1());
		return l1 + l2 + l3;
	}
	@Override
	public String toString() {
		return "Triangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}
	
}
