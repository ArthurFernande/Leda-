package variacoesOrdenacao;

import java.util.Arrays;

import Util.Util;
import ordenacaoComparacao.QuickSort;

public class QuickSelect {
	
	public int ordena(int[]array, int ini, int fim,int k) {
		int particiona= particiona(array,ini,fim);
		
		if(particiona==k) {
			return array[particiona];
		}else if(particiona<k) {
			return ordena(array, particiona+1, fim, k);
		}else {
			return ordena(array, ini, particiona-1, k);
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
		QuickSelect ajuda = new QuickSelect();
		int saida = ajuda.ordena(array,0,array.length-1,4);
		System.out.println(saida);
	}

}
