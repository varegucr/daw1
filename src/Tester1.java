
public class Tester1 {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto();
		Punto punto2 = new Punto(4.4,6.6);
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println("La distancia es "+punto1.calcularDistanciaDesde(punto2));
		
		Circulo circulo1 = new Circulo ();
		System.out.println(circulo1);
		System.out.println("El area del circulo es"+circulo1.calcularArea());
		System.out.println("El perimetro del circulo es"+circulo1.calcularPerimetro());
		System.out.println("La distancia del circulo al punto es "+circulo1.calcularDistanciaDesde(punto2));
		
		Triangulo triangulo1 = new Triangulo (); 
		System.out.println(triangulo1);
		System.out.println("El area del triangulo es " +triangulo1.calcularArea());
		System.out.println("El perimetro del triangulo es "+triangulo1.calcularPerimetro());
		System.out.println("La distancia del triangulo al punto es "+triangulo1.calcularDistanciaDesde(punto2));

	}

}
