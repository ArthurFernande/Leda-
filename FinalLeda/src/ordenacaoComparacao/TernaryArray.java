package ordenacaoComparacao;

import java.util.Arrays;

public class TernaryArray {

	public void sort(Integer[] array) {
		Integer menor = buscaMenor(array);
		Integer maior = buscaMaior(array);
		int posicaoMenor = 0;
		for (int i = 0; i < array.length ; i++) {
			if (array[i] == menor) {
				Util.Util.Swap(array, posicaoMenor, i);
				posicaoMenor++;
			}
		}
		int posicaoMaior = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == maior) {
				Util.Util.Swap(array, posicaoMaior, i);
				posicaoMaior--;
			}
		}
	}

	private Integer buscaMaior(Integer[] array) {
		Integer maior = array[0];
		for (int i = 0; i < array.length ; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}

	private Integer buscaMenor(Integer[] array) {
		Integer menor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		return menor;
	}
	
	public static void main(String[] args) {
		Integer []array ={1,0,2,0,0,0,2,0,1};
		TernaryArray ajuda = new TernaryArray();
		ajuda.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
