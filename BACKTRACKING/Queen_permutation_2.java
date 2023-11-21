package BACKTRACKING;
//Permutation and combination=>, the same solution should not be repeated,
public class Queen_permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		boolean [] board = new boolean[n];
		permutation(board,0,tq,"",0);
//		
	}
	public static void permutation(boolean []board,int qpsf, int tq, String ans,int idx) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				board[i] = true;
				permutation(board,qpsf+1,tq,ans+"b"+i+"q"+qpsf+" ",i+1);
				board[i]= false;
			}
		}
	}
}