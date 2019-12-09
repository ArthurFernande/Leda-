package variacoesOrdenacao;

import java.util.Arrays;

import ordenacaoComparacao.SelectionSort;

public class SimultaneoSelectionSort {
	public void ordena(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			int menor = i;
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}
			}
			Util.Util.Swap(array, i, menor);

			int iterador = array.length - 1;
			int maior = iterador;
			for (int j = iterador; j >= 0; j--) {
				if (array[j] > array[maior]) {
					maior = j;
				}
			}
			Util.Util.Swap(array, maior, iterador);
		}

	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 7, 1, 0 ,-25};
		SimultaneoSelectionSort ajuda = new SimultaneoSelectionSort();
		ajuda.ordena(array);
		System.out.println(Arrays.toString(array));
	}

}
