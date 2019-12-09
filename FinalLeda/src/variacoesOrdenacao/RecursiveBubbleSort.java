package variacoesOrdenacao;

import java.util.Arrays;

import ordenacaoComparacao.SelectionSort;

public class RecursiveBubbleSort {
	
	public void ordena(int[]array, int n) {
		if(n==1) {
			return;
	}
		for (int i = 0; i < n-1; i++) {
			if(array[i]>array[i+1]) {
				Util.Util.Swap(array, i, i+1);
			}
		}ordena(array, n-1);
	}
	public static void main(String[] args) {
		int[] array = { 4, 6, 7, 1, 0 ,-9};
		RecursiveBubbleSort ajuda = new RecursiveBubbleSort();
		ajuda.ordena(array,6);
		System.out.println(Arrays.toString(array));
	}

}
