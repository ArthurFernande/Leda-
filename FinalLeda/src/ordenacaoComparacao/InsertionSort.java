package ordenacaoComparacao;

import java.util.Arrays;

public class InsertionSort {
	public void ordena(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			int key = array[i];
			int j = i;
			while (j > 0 && key < array[j - 1]) {
				Util.Util.Swap(array, j, j - 1);
				j--;
			}
			array[j] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] array = { 4, 6, 7, 1, 0 };
		InsertionSort ajuda = new InsertionSort();
		ajuda.ordena(array);
		System.out.println(Arrays.toString(array));
	}

}
