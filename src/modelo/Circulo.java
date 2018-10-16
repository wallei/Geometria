package modelo;

import modelo.Punto;

public class Circulo {
	private Punto origen;
	private double radio;

	public Circulo(Punto origen, double radio) {
		this.origen = origen;
		this.radio = radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	/*
	 * public void setRadio(radio Punto) { this.radio = radio; }
	 */

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setRadio(Punto radio) {
		this.radio = radio.calcularDistancia(origen);
	}

	public boolean equals(Circulo c) {
		return ((origen.equals(c.getOrigen()) && radio == c.getRadio()));
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}

	public double calcularPerimetro() {
		double perimetreando;

		perimetreando = 2 * Math.PI * radio;

		return perimetreando;
	}

	public double calcularArea() {
		double areando;

		areando = Math.PI * Math.pow(radio, 2);

		return areando;
	}

	public double calcularDistancia(Circulo c) {
		double distancia;

		distancia = origen.calcularDistancia(c.getOrigen());

		return distancia;

	}
}
