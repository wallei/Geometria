package test;

import modelo.Circulo;
import modelo.Punto;

public class TestPunto {

	public static void main(String[] args) {

		Punto punto1 = new Punto(1.5, 2.5);
		Punto punto2 = new Punto(3.5, 5.0);

		System.out.print("Punto 1: ");
		System.out.println(punto1);

		System.out.print("Punto 2: ");
		System.out.println(punto2);

		System.out.println("El resultado de equals entre Punto1: " + (punto1) + " y Punto2:" + (punto2) + " es: ");
		System.out.println(punto1.equals(punto2));

		Punto punto3 = new Punto(10.00, 30.00);
		Punto punto4 = new Punto(10.00, 30.00);

		System.out.println("El resultado de equals entre Punto 3: " + (punto3) + " y Punto 4:" + (punto4) + " es: ");
		System.out.println(punto3.equals(punto4));

		System.out.println("Calcular la distancia entre 2 puntos: ");
		System.out.println(punto1.calcularDistancia(punto2));

		Circulo circulito1 = new Circulo(punto1, 5);
		Circulo circulito2 = new Circulo(punto2, 5);

		System.out.println("Calcular Perimetro: " + circulito1.calcularPerimetro());

		System.out.println("Calcular Area: " + circulito1.calcularArea());

		System.out.print("Calcular Distancia: " + circulito1.calcularDistancia(circulito2));

	}

}
