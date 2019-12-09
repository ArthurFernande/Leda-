package ordenacaoComparacao;

import java.util.Arrays;

public class Bublesort {
	
	public void ordena(int[]array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j]>array[j+1]) {
					Util.Util.Swap(array, j, j+1);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] array= {4,6,7,1,0};
		Bublesort ajuda = new Bublesort();
		ajuda.ordena(array);
		System.out.println(Arrays.toString(array));
	}

}

