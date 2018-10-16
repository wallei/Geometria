package modelo;

public class ArregloBidireccional {

	private double[][] matrizA;

	public ArregloBidireccional(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}

	public double[][] sumar(double[][] matrizB) {
		double[][] resultadoSumar = new double[3][3];

		// resultadoSumar[][]=

		for (int x = 0; x < matrizA.length; x++) {
			for (int y = 0; y < matrizA[x].length; y++) {
				resultadoSumar[x][y] = matrizA[x][y] + matrizB[x][y];
			}
		}

		return resultadoSumar;

	}

	public double[][] imprimir(double[][] pichota) {

		double[][] resultado = new double[pichota.length][];

		for (int x = 0; x < pichota.length; x++) {
			System.out.print("|");
			for (int y = 0; y < pichota[x].length; y++) {
				System.out.print(pichota[x][y]);
				if (y != pichota[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}

		return resultado;

	}

	public double[][] transpuesta() {
		// double[][] resultado = new double[][];

		double[][] matrizT = new double[matrizA[0].length][matrizA.length];

		for (int x = 0; x < matrizA.length; x++) {
			for (int y = 0; y < matrizA[x].length; y++) {
				matrizT[y][x] = matrizA[x][y];
			}
		}

		return matrizT;
	}

}