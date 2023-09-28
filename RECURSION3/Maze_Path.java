package RECURSION3;

public class Maze_Path {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;int m = 3;
		PrintPath(n-1,m-1, 0 , 0,"");
		System.out.println(count);
	}
	// er-->end row, ec-->end column , cr-->curr row, cc-->curr column, 
	public static void PrintPath(int er, int ec,int cr,int cc, String ans) {
		
		if(cr==er && cc==ec) {
			System.out.println(ans);
			count++;
			return;
		}
		if(cr>er || cc>ec) {
			return ;
		}
		PrintPath(er,ec,cr,cc+1,ans+"H");
		PrintPath(er,ec,cr+1,cc,ans+"V");
	}

}
