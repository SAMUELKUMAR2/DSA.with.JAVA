package BACKTRACKING;

public class Queen_Permutation {

	public static void main(String[] args) {
		int n = 4;
		int tq = 2;
		boolean [] board = new boolean[n];
		permutation(board,0,tq,"");
//		int []b = new int[n];
//		permu(b,0,tq,"");
		//qpsf-- queen place so far (no of queen paresent)
	}
	public static void permutation(boolean []board,int qpsf, int tq, String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i] = true;
				permutation(board,qpsf+1,tq,ans+"b"+i+"q"+qpsf);
				board[i]= false;
			}
		}
	}
//	public static void permu(int []b,int qpsf,int tq, String ans) {
//		if(qpsf==tq) {
//			System.out.println(ans);
//			return;
//		}
//		for(int i=0;i<b.length;i++) {
//			if(b[i]==0) {
//				b[i] = 1;
//				permu(b,qpsf+1,tq,ans+"b"+i+"q"+qpsf);
//				b[i]= 0;
//			}
//		}
//		
//	}

}
