package LECTURE4;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
		 int val= 1;
		 int row = 1;
		 int space = n-1;
		 int num = 1;
		  while(row<= n) {
			  int i = 1;
			  while(i<=space) {
			  System.out.print("\t");
			  i++;
			  }
			  int j = 1; 
			  while(j<=num) {
				  System.out.print(val+ "\t");
				  val++;
				  j++;
			  }
			  System.out.println();
			  row++;
			  space--;
			  num+=2;
			 
		  }
		  
		 
	}

}
