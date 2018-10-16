package test;

import modelo.ArregloUnidimensional;

public class ArregloUnidimensionalTest {

	public static void main(String[] args) {

		int[] arrayInt = { 2, 5, 7, 2, 9 };

		ArregloUnidimensional vector = new ArregloUnidimensional(arrayInt);

		int[] arrayOrdenado = {};
		int[] arrayOrdenado1 = {};

		System.out.print("ArregloUnidimensional: \n");
		System.out.print("Traer el Menor: ");
		System.out.println(vector.traerElMenor());
		System.out.print("Traer el Mayor: ");
		System.out.println(vector.traerElMayor());
		System.out.print("Trae el promedio: ");
		System.out.println(vector.calcularPromedio());

		arrayOrdenado = vector.ordenarAscendete();

		System.out.println("ordenarAcendete():int[] ");

		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.print(arrayOrdenado[i] + " ");
		}
		System.out.println("\n");

		System.out.println("ordenarDescendete():int[] ");

		arrayOrdenado1 = vector.ordenarDescendete();
		for (int i = 0; i < arrayOrdenado1.length; i++) {
			System.out.print(arrayOrdenado1[i] + " ");
		}

		System.out.println("");

		System.out.println("traerFrecuencia(int numero): int \n");
		System.out.println(vector.traerFrecuencia(9));

		System.out.println("traerModa(): int \n");
		System.out.println(vector.traerModa());

	}

}