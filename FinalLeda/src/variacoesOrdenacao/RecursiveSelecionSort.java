package variacoesOrdenacao;

public class RecursiveSelecionSort {
	
	public void ordena(int[] array, int n, int index) {
		if(n==index) {
			return;
		}
		int k = minIndex(array,index,n-1);
		if(k != index) {
			Util.Util.Swap(array, k, index);
		}
		ordena(array, n, index+1);
	}

	private int minIndex(int[] array, int i, int j) {
		if(i==j) {
			return i;
		}
		int k= minIndex(array, i+1, j);
		return k;
	}

}
