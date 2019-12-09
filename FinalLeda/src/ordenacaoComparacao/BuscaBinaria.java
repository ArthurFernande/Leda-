package ordenacaoComparacao;

public class BuscaBinaria {

	public static int buscaBinaria(int[]array, int elemento) {
		return buscaBinary(array,elemento,0,array.length-1);
	}

	private static int buscaBinary(int[] array, int elemento, int ini, int fim) {
	int media =(ini+fim)/2;
		/*Obs caso me preocupe de pegar anterior ou proximo
		 * if(!naocontemElemento(array,elemento)) {
			return 58;
		}*/
		if(array[media]==elemento) {
			return array[media];
		}if(array[media]<elemento) {
			return buscaBinary(array,elemento,media+1,fim);
		}else {
			return buscaBinary(array,elemento,ini,media-1);
		}
	}
	
	private static boolean naocontemElemento(int[] array, int elemento) {
		boolean saida =false;
		int k=0;
		for (int i = 0; i <= array.length-1; i++) {
			if(array[i]!= elemento) {
				k++;
			}
		}
		if(k== array.length-1) {
			saida= true;
		}
		return saida;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,8,9};
		BuscaBinaria ajuda = new BuscaBinaria();
		int saida = ajuda.buscaBinaria(array, 10);
		System.out.println(saida);
	}
}
