package BACKTRACKING2;

public class CoinPermutation_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []coin = {2,3,5};
		int amount =8;
		Permutation_combination(coin,amount,"",0);
	}
	public static void Permutation_combination(int []coin ,int amount,String ans,int idx) {
		if(amount ==0) {
			System.out.print(ans+" ");
		}
		
		for(int i =idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				Permutation_combination(coin,amount-coin[i],ans+coin[i],i);
			}
		}
	}

}
