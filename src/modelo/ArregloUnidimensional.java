package modelo;

public class ArregloUnidimensional {

	private int[] vector;

	public ArregloUnidimensional(int[] vector) {
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public int traerElMenor() {
		int menor = vector[0];
		int i;

		for (i = 0; i < vector.length; i++) {
			if (menor > vector[i]) {
				menor = vector[i];
			}
		}

		return menor;
	}

	public int traerElMayor() {
		int mayor = vector[0];
		int i;

		for (i = 0; i < vector.length; i++) {
			if (mayor < vector[i]) {
				mayor = vector[i];
			}
		}

		return mayor;
	}

	public double calcularPromedio() {
		double promedio = 0;
		int puchito = 0;
		int i;

		for (i = 0; i < vector.length; i++) {
			puchito = puchito + vector[i];

			promedio = (puchito / vector.length);

		}

		return promedio;
	}

	public int[] ordenarAscendete() {
		int[] ordenado = vector;

		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] > vector[j + 1]) {
					int tmp = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = tmp;
				}
			}
		}

		return ordenado;
	}
	
	
	public int[] ordenarDescendete() {
		int[] ordenado = vector;

		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - 1; j++) {
				if (vector[j] < vector[j + 1]) {
					int tmp = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = tmp;
				}
			}
		}

		return ordenado;
	}

	public double traerFrecuencia(int numero) {
		double frecuente = 0;
		int cantidad = 0;

		for (int i = 0; i < vector.length; i++) {
			if (numero == vector[i]) {
				cantidad = cantidad + 1;
			}
		}

		frecuente = ((double) cantidad / vector.length);

		return frecuente;
	}

	public int traerModa() {
		int moda = 0;
		double frecuencia, frecuenciaMaxima = 0;

		for (int i = 0; i < vector.length; i++) {
			frecuencia = this.traerFrecuencia(vector[i]);
			if (frecuencia > frecuenciaMaxima) {
				frecuenciaMaxima = frecuencia;
				moda = vector[i];
			}
		}

		return moda;

	}

}
