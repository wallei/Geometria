package test;

import modelo.ArregloBidireccional;

public class TestArregloBidireccional {

	public static void main(String[] args) {

		double[][] arrayDouble= { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		double[][] arrayDouble2={ { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		
		ArregloBidireccional matriz = new ArregloBidireccional(arrayDouble);
		ArregloBidireccional matrizB = new ArregloBidireccional(arrayDouble2);
		
		
		//matriz.sumar(arrayDouble2);
		

        matriz.imprimir(arrayDouble);
	
		//matriz.imprimir(sumar(arrayDouble2));
        
        matriz.transpuesta();
		
	}

}
