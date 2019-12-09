package ordenacaoComparacao;

import java.util.Arrays;

public class MergeSort {

	public void ordena(int[] array, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			ordena(array, ini, meio);
			ordena(array, meio + 1, fim);
			merge(array,ini,meio,fim);
		}
	}

	private void merge(int[] array, int ini, int meio, int fim) {
		int[]auxiliar =new int[array.length];
		
		for (int i = 0; i < auxiliar.length; i++) {
			auxiliar[i]=array[i];
		}
		int i =ini;
		int j =meio+1;
		int k= ini;
		while(i<=meio && j<=fim) {
			if(auxiliar[i]<auxiliar[j]) {
				array[k]=auxiliar[i];
				i++;
			}else {
				array[k]=auxiliar[j];
				j++;
			}
			k++;
		}
		while(i<=meio) {
			array[k]=auxiliar[i];
			i++;
			k++;
		}
		while(j<=fim) {
			array[k]=auxiliar[j];
			j++;
			k++;
		}
		
	}
	public static void main(String[] args) {
		int[] array = { 4, 6, 7, 1, 0 };
		MergeSort ajuda = new MergeSort();
		ajuda.ordena(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
