package ordenacaoComparacao;

import java.util.Arrays;

public class SelectionSort {

	public void ordena(int[] array) {

		for (int i = 0; i <= array.length - 1; i++) {
			int menor = i;
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}
			}
			Util.Util.Swap(array, i, menor);
		}

	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 7, 1, 0 };
		SelectionSort ajuda = new SelectionSort();
		ajuda.ordena(array);
		System.out.println(Arrays.toString(array));
	}

}
