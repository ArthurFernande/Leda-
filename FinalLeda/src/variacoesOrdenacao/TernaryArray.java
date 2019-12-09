package variacoesOrdenacao;

public class TernaryArray {
	public void ordena(int[]array) {
		Integer menor = buscaMenor(array);
		Integer maior = buscaMaior(array);
		int posciaoMenor =0;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]==menor) {
				Util.Util.Swap(array, posciaoMenor, i);
				posciaoMenor++;
			}
		}
		int posicaoMaior =array.length-1;
		for (int i = array.length-1; i>=0; i--) {
			if(array[i]==maior) {
				Util.Util.Swap(array, posicaoMaior, i);
				posicaoMaior--;
			}
		}
		
	}

	private Integer buscaMaior(int[] array) {
		Integer maior = array[0];
		for (int i = 0; i <= array.length-1; i++) {
			if(array[i]> maior) {
				maior= array[i];
			}
		}
		return maior;
	}

	private Integer buscaMenor(int[] array) {
		Integer menor= array[0];
		for (int i = 0; i <= array.length-1; i++) {
			if(array[i]<menor) {
				menor =array[i];
			}
		}
		return menor;
	}

}
