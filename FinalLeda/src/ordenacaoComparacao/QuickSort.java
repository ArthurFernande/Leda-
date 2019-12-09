package ordenacaoComparacao;

import java.util.Arrays;

import Util.Util;

public class QuickSort {
	
	public void ordena(int[]array, int ini, int fim) {
		if(ini<=fim) {
			int pivot = particiona(array,ini,fim);
			ordena(array,ini,pivot-1);
			ordena(array, pivot+1, fim);
		}
	}

	private int particiona(int[] array, int ini, int fim) {
		int i= ini+1;
		int j =fim;
		int pivot= array[ini];
		
		while(i<=j) {
			if(array[i]<=pivot) {
				i++;
			}else if(array[j] > pivot) {
				j--;
			}else {
				Util.Swap(array, i, j);
			}
		}
		Util.Swap(array, ini, j);
		return j;
	}
	public static void main(String[] args) {
		int[] array = { 4, 6, 7, 1, 0 };
		QuickSort ajuda = new QuickSort();
		ajuda.ordena(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
