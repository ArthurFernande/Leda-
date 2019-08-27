package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;

/**
 * This algorithm applies two selection sorts simultaneously. In a same
 * iteration, a selection sort pushes the greatest elements to the right and
 * another selection sort pushes the smallest elements to the left. At the end
 * of the first iteration, the smallest element is in the first position (index
 * 0) and the greatest element is the last position (index N-1). The next
 * iteration does the same from index 1 to index N-2. And so on. The execution
 * continues until the array is completely ordered.
 */
/*	obs1: professor disse que nao trata de excessao na aula
	obs2: simultaneo selection sort  trata do menor e maior elemento ao mesmo tempo */

public class SimultaneousSelectionsort<T extends Comparable<T>> extends AbstractSorting<T> {
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (leftIndex < 0 || rightIndex > array.length || array == null) {
			return;

		}
		for (int i = leftIndex; i <= rightIndex; i++) {
			int menor = i;
			//colocando o menor elemento de forma ordenada no array
			for (int j = i + 1; j <= rightIndex; j++) {
				if (array[j].compareTo(array[menor]) < 0) {
					menor = j;

				}

			}
			util.Util.swap(array, i, menor);
			//colocando o maior elemento de forma ordenada no array
			int interador = rightIndex;
			int maior = interador;
			for (int k = interador; k >= leftIndex; k--) {
				if (array[k].compareTo(array[maior]) > 0) {
					maior = k;

				}

			}
			util.Util.swap(array, interador, maior);

		}
	}
}
